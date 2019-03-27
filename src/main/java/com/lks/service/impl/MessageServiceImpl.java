package com.lks.service.impl;

import com.github.pagehelper.PageHelper;
import com.lks.mapper.MessageMapper;
import com.lks.pojo.MobileResult;
import com.lks.service.MessageService;
import com.lks.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageMapper messageMapper;
    @Autowired
    private UserService userService;


    @Override
    public MobileResult getMessageList(Integer orgId, Integer state, String beginTime, String endTime, Integer page, Integer limit) {
        if (state != 1){
            List<Map<String, Object>> messageList = messageMapper.getMessageList(orgId, state, beginTime, endTime);
            return MobileResult.success(messageList);
        }
        List<Map<String, Object>> messageList = messageMapper.getMessageOrderList(orgId,null, state, beginTime, endTime);
        return MobileResult.success(messageList);
    }

    @Override
    public MobileResult getMessage(Integer orgId) {
        ArrayList<Object> objects = new ArrayList<>();
        PageHelper.startPage(0, 1);
        List<Map<String, Object>> refundMessageList = messageMapper.getRefundMessageList(orgId, "", "");
        if(refundMessageList.size()>0){
            Map<String, Object> refundMessageMap = refundMessageList.get(0);
            refundMessageMap.put("type",1);
            refundMessageMap.put("title","退款消息");
            refundMessageMap.put("remark","退款金额: "+refundMessageMap.get("refundAmount"));
            objects.add(refundMessageMap);
        }
        PageHelper.startPage(0, 1);
        List<Map<String, Object>> sellMessageOrderList = messageMapper.getSellMessageOrderList(orgId, "", "");
        if(sellMessageOrderList.size()>0){
            Map<String, Object> sellMessageMap = sellMessageOrderList.get(0);
            sellMessageMap.put("type",2);
            sellMessageMap.put("title","出售消息");
            sellMessageMap.put("remark","出售商品: "+sellMessageMap.get("describeA"));
            objects.add(sellMessageMap);
        }
       // List<Map<String, Object>> message = messageMapper.getMessage(orgId);
        return MobileResult.success(objects);
    }

    @Override
    public MobileResult MessageDetails(Integer orgId, Integer messageId) {
        Map<String, Object> messageInfo = messageMapper.getMessageInfo(orgId, messageId);
        Integer type = (Integer) messageInfo.get("type");
        Integer params = (Integer) messageInfo.get("params");
        if(type == 0){
            return  MobileResult.success(messageInfo);
        }else if (type == 1){
            return userService.abnormalOrderDetail(orgId, params);
        }else if (type == 2){
            return userService.abnormalOrderDetail(orgId, params);
        }
        return null;
    }

    @Override
    public MobileResult getNewMessageLists(Integer orgId, Integer state, String beginTime, String endTime, Integer page, Integer limit) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("count",0);
        PageHelper.startPage(page, limit);
        if (state == 1){
            List<Map<String, Object>> messageList = messageMapper.getRefundMessageList(orgId, beginTime, endTime);
            hashMap.put("messageList",messageList);
            return MobileResult.success(hashMap);
        }
        List<Map<String, Object>> messageList = messageMapper.getSellMessageOrderList(orgId, beginTime, endTime);
        BigDecimal bigDecimal = messageMapper.countMoney(orgId, beginTime, endTime);
        hashMap.put("count",bigDecimal);
        hashMap.put("messageList",messageList);
        return MobileResult.success(hashMap);

    }
}
