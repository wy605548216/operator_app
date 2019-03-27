package com.lks.service.impl;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.lks.jwt.JwtUtil;
import com.lks.mapper.*;
import com.lks.pojo.*;
import com.lks.service.UserService;
import com.lks.util.HttpUtils;
import com.lks.util.LUXTEKUtils;
import net.sf.json.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.net.PasswordAuthentication;
import java.util.*;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SysUserMapper sysUserMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private AccountDrawalApplyMapper accountDrawalApplyMapper;
    @Autowired
    private MessageMapper messageMapper;
    @Autowired
    private OrdersMapper ordersMapper;
    @Autowired
    private RefundMapper refundMapper;
    @Value("${url.refund}")
    private String refundUrl;
    @Value("${url.token}")
    private String bearer;

    @Override
    public MobileResult login(String userName, String password, HttpServletRequest request) throws Exception {
        SysUser sysUser= userMapper.getUserInfo(userName,LUXTEKUtils.encryptionPayPWD(password));
        if (sysUser==null) {
            return MobileResult.fail("账号或密码错误!");
        }
        if (!sysUser.getIsEnable()){
            return MobileResult.fail("账号被禁用,联系管理员!");
        }
        sysUser.setLastLoginIp(LUXTEKUtils.getIpAddr(request));
        sysUser.setLastLoginTime(new Date());
        sysUserMapper.updateByPrimaryKey(sysUser);
        HashMap<String, Object> userMap = new HashMap<>();
        userMap.put("orgId",sysUser.getOrgId().toString());
        userMap.put("userId",sysUser.getId().toString());
        return MobileResult.success(JwtUtil.generateToken(userMap));
    }

    @Override
    public MobileResult userInfo(Integer orgId) {
        Map<String, Object> userInfoMoney = userMapper.getUserInfoMoney(orgId);
        return MobileResult.success(userInfoMoney);
    }

    @Override
    public MobileResult drawalList(Integer orgId, Integer state) {
        List<Map<String, Object>> list = userMapper.drawalList(orgId, state);
        return MobileResult.success(list);
    }

    @Override
    public MobileResult withdraw(Integer orgId,AccountDrawalApply accountDrawalApply, Integer userId) {
        List<Map<String, Object>> list = userMapper.drawalList(orgId, 3);
        if (list.size() != 0){
            return MobileResult.fail("已有正在审核的提现申请,请勿重复申请");
        }
        //判断查询金额
        Map<String, Object> userInfoMoney = userMapper.getUserInfoMoney(orgId);
        if (accountDrawalApply.getDrawalMeony().compareTo(new BigDecimal(userInfoMoney.get("balance").toString())) > 0){
            return MobileResult.fail("提现金额不能大于余额");
        }
        //查询运营商信息
        SysUser sysUser = sysUserMapper.selectByPrimaryKey(userId);
        //封装提现申请对象
        accountDrawalApply.setOrgId(orgId);
        accountDrawalApply.setApplyTime(new Date());
        accountDrawalApply.setApplyUserId(userId);
        accountDrawalApply.setApplyUserName(sysUser.getUserName());
        accountDrawalApplyMapper.insertSelective(accountDrawalApply);
        return MobileResult.success("申请成功");
    }

    @Override
    public MobileResult abnormalOrder(Integer orgId,Integer state) {
        List<Map<String, Object>> messageList = messageMapper.abnormalOrder(orgId,state);
        return MobileResult.success(messageList);
    }

    @Override
    public MobileResult abnormalOrderDetail(Integer orgId, Integer id) {
        Map<String, Object> orderInfo = messageMapper.abnormalOrderDetail(orgId, id);
        //手机号码加*
        if(orderInfo.get("telphone") != null && orderInfo.get("telphone") != ""){
            Object telphone = orderInfo.get("telphone");
            String phone = orderInfo.get("telphone").toString().replaceAll("(\\d{3})\\d{4}(\\d{4})","$1****$2");
            orderInfo.remove("telphone");
            orderInfo.put("phone",phone);
        }
        List<Map<String, Object>> orderDetail = messageMapper.getOrderDetail(orgId, id);
        HashMap<String, Object> orderMap = new HashMap<>();
        orderMap.put("orderInfo",orderInfo);
        orderMap.put("orderDetail",orderDetail);
        return MobileResult.success(orderMap);
    }

    @Override
    @Transactional
    public MobileResult refund(Integer orgId, Integer id, BigDecimal refundMoney) {
        Orders orders = ordersMapper.selectByPrimaryKey(id);
        if (refundMoney.compareTo(orders.getRealAmount())>0){
            return MobileResult.fail("退款金额不能大于订单支付金额");
        }
        if (orders.getRefundTime() != null){
            return MobileResult.fail("此订单已退款");
        }
        //计算退款后金额
        BigDecimal realAmount = orders.getRealAmount().subtract(refundMoney);

        if (realAmount.compareTo(new BigDecimal(0)) == 0){
            //退款处理
            JSONObject refund = refund(orders, refundMoney);
            if (refund.get("code").equals(0)){
                return MobileResult.success();
            }
            //手动回滚事务
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return MobileResult.fail("退款失败:"+refund.get("message"));
        }
        //查询父组织
        Map<String, Object> orgParent = refundMapper.getOrgParent(orgId);
        //抽成比例
        BigDecimal ratio = new BigDecimal(orgParent.get("ratio").toString()).divide(new BigDecimal(100));
        //父组织抽成金额
        BigDecimal parentMoney = realAmount.multiply(ratio).setScale(2, BigDecimal.ROUND_HALF_UP);
        //子组织金额
        BigDecimal sonMoney = realAmount.subtract(parentMoney);
        //修改账户信息  加记录集合
        ArrayList<Map<String,Object>> userInfoList = new ArrayList<>();
        //父对象
        HashMap<String, Object> parentMap = new HashMap<>();
        parentMap.put("orgId",orgParent.get("orgId"));
        parentMap.put("orderId",orders.getId());
        parentMap.put("amount",parentMoney);
        parentMap.put("ratio",ratio.multiply(new BigDecimal(100)).intValue());
        parentMap.put("type",2);
        parentMap.put("remark", "父组织入账");
        userInfoList.add(parentMap);
        //子对象
        HashMap<String, Object> sonMap = new HashMap<>();
        parentMap.put("orgId",orgId);
        parentMap.put("orderId",orders.getId());
        parentMap.put("amount",sonMoney);
        parentMap.put("ratio",new BigDecimal(1).subtract(ratio).multiply(new BigDecimal(100)).intValue());
        parentMap.put("type",1);
        parentMap.put("remark", "子组织入账");
        userInfoList.add(sonMap);
        ////修改账户信息  加记录
        refundMapper.setUserMoney(userInfoList);
        refundMapper.addLog(userInfoList);
        //改订单状态
        orders.setStatus((byte) 3);
        ordersMapper.updateByPrimaryKeySelective(orders);
        //退款处理
        JSONObject refund = refund(orders, refundMoney);
        if (refund.get("code").equals(0)){
            return MobileResult.success();
        }
        //手动回滚事务
        TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        return MobileResult.fail("退款失败:"+refund.get("message"));
    }

    @Override
    public MobileResult withdrawDetail(Integer orgId, Integer userId, Integer id) {
        Map<String, Object> withdrawDetailMap = refundMapper.withdrawDetail(orgId, userId, id);
        return MobileResult.success(withdrawDetailMap);
    }


    public JSONObject refund(Orders orders, BigDecimal refundMoney){
        JSONObject jsonObject;
        if(orders.getPaymentId() == 1){
            jsonObject = HttpUtils.doGetPay(refundUrl+"/api/alipay/refund?outTradeNo="+orders.getOrderNo()+"&refundAmount="+refundMoney+"&tradeNo="+
                    orders.getOrderNo()+"&refundReason=异常订单退款&outRequestNo="+orders.getOrderNo(),bearer);
        }else {
            Integer multiply = refundMoney.multiply(new BigDecimal(100)).intValue();
            jsonObject = HttpUtils.doGetPay(refundUrl + "/api/wechatpay/refundv2?outTradeNo=" + orders.getOrderNo() + "&refundAmount=" + multiply + "&tradeNo=" +
                    orders.getOrderNo() + "&refundDesc=异常订单退款&outRefundNo=" + orders.getOrderNo() + "&totalAmount=" + multiply, bearer);
        }
        return jsonObject;
    }

}
