package com.lks.controller;

import com.lks.pojo.MobileResult;
import com.lks.service.MessageService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/message/")
public class MessageController {

    @Autowired
    private MessageService messageService;

    // 消息通知
    @ApiOperation(value = "消息通知", notes = "消息通知", httpMethod = "GET")
    @RequestMapping(value = "/getMessage", method = RequestMethod.GET)
    @ResponseBody
    public MobileResult getMessage(@RequestParam(required = false) String orgId){

        return  messageService.getMessage(Integer.parseInt(orgId));
    }

    // 查message表
    @ApiOperation(value = "消息列表", notes = "消息列表", httpMethod = "GET")
    @RequestMapping(value = "/getMessageList", method = RequestMethod.GET)
    @ResponseBody
    public MobileResult getMessageList(@RequestParam(required = false) String orgId,
                                  @ApiParam(value = "1:退款 2:售卖 3:优惠促销") @RequestParam Integer state,
                                  @ApiParam(value = "开始时间") @RequestParam String beginTime,
                                  @ApiParam(value = "结束时间") @RequestParam String endTime,
                                  @ApiParam(value = "当前页,从1开始") @RequestParam(required = false, defaultValue = "1") Integer page,
                                  @ApiParam(value = "选填,每页显示数量,默认10") @RequestParam(required = false, defaultValue = "10") Integer limit){

        return messageService.getMessageList(Integer.parseInt(orgId),state,beginTime,endTime,page,limit);
    }

    // 直接查order表
    @ApiOperation(value = "消息列表", notes = "消息列表", httpMethod = "GET")
    @RequestMapping(value = "/getNewMessageList", method = RequestMethod.GET)
    @ResponseBody
    public MobileResult getNewMessageLists(@RequestParam(required = false) String orgId,
                                       @ApiParam(value = "1:退款 2:售卖") @RequestParam Integer state,
                                       @ApiParam(value = "开始时间") @RequestParam String beginTime,
                                       @ApiParam(value = "结束时间") @RequestParam String endTime,
                                       @ApiParam(value = "当前页,从1开始") @RequestParam(required = false, defaultValue = "1") Integer page,
                                       @ApiParam(value = "选填,每页显示数量,默认10") @RequestParam(required = false, defaultValue = "10") Integer limit){

        return messageService.getNewMessageLists(Integer.parseInt(orgId),state,beginTime,endTime,page,limit);
    }


    // 消息详情
    @ApiOperation(value = "消息详情", notes = "消息详情", httpMethod = "GET")
    @RequestMapping(value = "/MessageDetails", method = RequestMethod.GET)
    @ResponseBody
    public MobileResult MessageDetails(@RequestParam(required = false) String orgId,
                                       @ApiParam(value = "messageId") @RequestParam Integer messageId){

        return messageService.MessageDetails(Integer.parseInt(orgId),messageId);
    }


}
