package com.lks.controller;

import com.lks.pojo.MobileResult;
import com.lks.service.TerminalService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/terminal/")
public class TerminalController {

    @Autowired
    private TerminalService terminalService;

    // 设备排名
    @ApiOperation(value = "设备排名", notes = "设备排名", httpMethod = "GET")
    @RequestMapping(value = "/terminalRank", method = RequestMethod.GET)
    @ResponseBody
    public MobileResult terminalRank(@RequestParam(required = false) String orgId,
                                     @RequestParam(required = false) String keyWord,
                                     @RequestParam(required = false) String startTime,
                                     @RequestParam(required = false) String endTime,
                                     @ApiParam(value = "当前页,从1开始") @RequestParam(required = false, defaultValue = "1") Integer page,
                                     @ApiParam(value = "选填,每页显示数量,默认10") @RequestParam(required = false, defaultValue = "10") Integer limit){

        return terminalService.terminalRank(Integer.parseInt(orgId),page,limit,keyWord,startTime,endTime);
    }

    // 设备状态统计
    @ApiOperation(value = "设备状态统计", notes = "设备状态统计", httpMethod = "GET")
    @RequestMapping(value = "/terminalStateCount", method = RequestMethod.GET)
    @ResponseBody
    public MobileResult terminalStateCount(@RequestParam(required = false) String orgId){

        return terminalService.terminalStateCount(Integer.parseInt(orgId));
    }


    // 根据设备状态查询列表
    @ApiOperation(value = "根据设备状态查询列表", notes = "根据设备状态查询列表", httpMethod = "GET")
    @RequestMapping(value = "/getTerminalList", method = RequestMethod.GET)
    @ResponseBody
    public MobileResult getTerminalList(@RequestParam(required = false) String orgId,
                                        @ApiParam(value = "0:全部 1：缺货 2：开启 3：关闭 4:离线 5：在线")@RequestParam Integer state,
                                        @ApiParam(value = "筛选条件")@RequestParam(required = false) String conditions,
                                        @ApiParam(value = "当前页,从1开始") @RequestParam(required = false, defaultValue = "1") Integer page,
                                        @ApiParam(value = "选填,每页显示数量,默认10") @RequestParam(required = false, defaultValue = "10")  Integer limit){

        return terminalService.getTerminalList(Integer.parseInt(orgId),state,page,limit,conditions);
    }

    // 根据设备状态查询列表
    @ApiOperation(value = "设备详情", notes = "设备详情", httpMethod = "GET")
    @RequestMapping(value = "/getTerminalInfo", method = RequestMethod.GET)
    @ResponseBody
    public MobileResult getTerminalInfo(@RequestParam(required = false) String orgId,
                                        @ApiParam(value = "设备id")@RequestParam Integer terminalId){

        return terminalService.getTerminalInfo(Integer.parseInt(orgId),terminalId);
    }

    // 点位线路
    @ApiOperation(value = "点位线路", notes = "点位线路", httpMethod = "GET")
    @RequestMapping(value = "/getLineAndPoint", method = RequestMethod.GET)
    @ResponseBody
    public MobileResult getLineAndPoint(@RequestParam(required = false) String orgId){

        return terminalService.getLineAndPoint(Integer.parseInt(orgId));
    }

    // 设备开关
    @ApiOperation(value = "设备开关", notes = "设备开关", httpMethod = "GET")
    @RequestMapping(value = "/setOnOff", method = RequestMethod.GET)
    @ResponseBody
    public MobileResult setOnOff(@RequestParam(required = false) String orgId,
                                 @RequestParam Integer terminalId){

        return terminalService.setOnOff(Integer.parseInt(orgId),terminalId);
    }
}
