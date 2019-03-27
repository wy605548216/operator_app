package com.lks.controller;

import com.lks.pojo.MobileResult;
import com.lks.service.SellService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;

@Controller
@RequestMapping("/api/sell/")
public class SellController {

    @Autowired
    private SellService sellService;

    // 收益统计
/*    @ApiOperation(value = "收益统计", notes = "收益统计", httpMethod = "GET")
    @RequestMapping(value = "/revenueCount", method = RequestMethod.GET)
    @ResponseBody
    public MobileResult revenueCount(@RequestParam(required = false) String orgId,
                                  @ApiParam(value = "开始时间") @RequestParam String beginTime,
                                  @ApiParam(value = "结束时间") @RequestParam String endTime){

        return sellService.revenueCount(Integer.parseInt(orgId),beginTime,endTime);
    }

    // 收益图表
    @ApiOperation(value = "收益图表", notes = "收益图表", httpMethod = "GET")
    @RequestMapping(value = "/revenueChart", method = RequestMethod.GET)
    @ResponseBody
    public MobileResult revenueChart(@RequestParam(required = false) String orgId,
                                     @ApiParam(value = "开始时间") @RequestParam String beginTime,
                                     @ApiParam(value = "结束时间") @RequestParam String endTime,
                                     @ApiParam(value = "标识 1 周 2 月 3 年") @RequestParam Integer type) throws ParseException {

        return sellService.revenueChart(Integer.parseInt(orgId),beginTime,endTime,type);
    }*/

    // 首页统计
    @ApiOperation(value = "首页统计", notes = "首页统计", httpMethod = "GET")
    @RequestMapping(value = "/indexCount", method = RequestMethod.GET)
    @ResponseBody
    public MobileResult indexCount(@RequestParam(required = false) String orgId) throws ParseException {

        return sellService.indexCount(Integer.parseInt(orgId));
    }
}
