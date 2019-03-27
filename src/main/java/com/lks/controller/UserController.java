package com.lks.controller;

import com.lks.pojo.AccountDrawalApply;
import com.lks.pojo.MobileResult;
import com.lks.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // 登录
    @ApiOperation(value = "登录", notes = "登录", httpMethod = "POST")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public MobileResult login(@ApiParam(value = "用户名:usreName,密码:password") @RequestBody Map<String, String> map,
                              HttpServletRequest request) throws Exception {
        if (StringUtils.isBlank(map.get("usreName")) || StringUtils.isBlank(map.get("password"))) {
            return MobileResult.parameterError();
        }
        return userService.login(map.get("usreName"), map.get("password"),request);
    }

    // 用户信息
    @ApiOperation(value = "用户信息", notes = "用户信息", httpMethod = "GET")
    @RequestMapping(value = "/api/userInfo", method = RequestMethod.GET)
    @ResponseBody
    public MobileResult userInfo(@RequestParam(required = false) String orgId) {

        return userService.userInfo(Integer.parseInt(orgId));
    }

    // 提现列表
    @ApiOperation(value = "提现列表", notes = "提现列表", httpMethod = "GET")
    @RequestMapping(value = "/api/drawalList", method = RequestMethod.GET)
    @ResponseBody
    public MobileResult drawalList(@RequestParam(required = false) String orgId,
                                   @ApiParam(value = "0:未通过 1：通过 3：处理中   不传全部")@RequestParam(required = false) Integer state) {

        return userService.drawalList(Integer.parseInt(orgId),state);
    }

    //提现
    @ApiOperation(value = "提现", notes = "提现", httpMethod = "POST")
    @RequestMapping(value = "/api/withdraw", method = RequestMethod.POST)
    @ResponseBody
    public MobileResult withdraw(@RequestParam(required = false) String orgId,
                                 @RequestParam(required = false) String userId,
                                 @RequestBody AccountDrawalApply accountDrawalApply) {

        return userService.withdraw(Integer.parseInt(orgId),accountDrawalApply,Integer.parseInt(userId));
    }

    //提现
    @ApiOperation(value = "提现详情", notes = "提现详情", httpMethod = "GET")
    @RequestMapping(value = "/api/withdrawDetail", method = RequestMethod.GET)
    @ResponseBody
    public MobileResult withdrawDetail(@RequestParam(required = false) String orgId,
                                 @RequestParam(required = false) String userId,
                                 @RequestParam Integer id) {

        return userService.withdrawDetail(Integer.parseInt(orgId),Integer.parseInt(userId),id);
    }

    //异常订单
    @ApiOperation(value = "异常订单", notes = "异常订单", httpMethod = "GET")
    @RequestMapping(value = "/api/abnormalOrder", method = RequestMethod.GET)
    @ResponseBody
    public MobileResult abnormalOrder(@RequestParam(required = false) String orgId,
                                      @ApiParam(value = "6:待处理  5:成功  不传全部")@RequestParam(required = false) Integer state) {

        return userService.abnormalOrder(Integer.parseInt(orgId),state);
    }

    //异常订单详情
    @ApiOperation(value = "异常订单详情", notes = "异常订单详情", httpMethod = "GET")
    @RequestMapping(value = "/api/abnormalOrderDetail", method = RequestMethod.GET)
    @ResponseBody
    public MobileResult abnormalOrderDetail(@RequestParam(required = false) String orgId,
                                            @RequestParam Integer id) {

        return userService.abnormalOrderDetail(Integer.parseInt(orgId),id);
    }


    //退款
    @ApiOperation(value = "退款", notes = "退款", httpMethod = "GET")
    @RequestMapping(value = "/api/refund", method = RequestMethod.GET)
    @ResponseBody
    public MobileResult refund(@RequestParam(required = false) String orgId,
                               @RequestParam Integer id,
                               @RequestParam BigDecimal refundMoney) {

        return userService.refund(Integer.parseInt(orgId),id,refundMoney);
    }
}
