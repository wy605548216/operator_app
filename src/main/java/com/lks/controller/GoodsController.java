package com.lks.controller;

import com.lks.pojo.MobileResult;
import com.lks.service.GoodsService;
import com.lks.service.TerminalService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/goods/")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    // 商品排名
    @ApiOperation(value = "商品排名", notes = "商品排名", httpMethod = "GET")
    @RequestMapping(value = "/goodsRank", method = RequestMethod.GET)
    @ResponseBody
    public MobileResult goodsRank(@RequestParam(required = false) String orgId,
                                  @ApiParam(value = "开始时间") @RequestParam String beginTime,
                                  @ApiParam(value = "结束时间") @RequestParam String endTime,
                                  @ApiParam(value = "当前页,从1开始") @RequestParam(required = false, defaultValue = "1") Integer page,
                                  @ApiParam(value = "选填,每页显示数量,默认10") @RequestParam(required = false, defaultValue = "10") Integer limit){

        return goodsService.goodsRank(Integer.parseInt(orgId),page,limit,beginTime,endTime);
    }

    // 商品分类
    @ApiOperation(value = "商品分类", notes = "商品分类", httpMethod = "GET")
    @RequestMapping(value = "/goodsClassify", method = RequestMethod.GET)
    @ResponseBody
    public MobileResult goodsClassify(@RequestParam(required = false) String orgId){

        return goodsService.goodsClassify(Integer.parseInt(orgId));
    }
    // 商品库存列表
    @ApiOperation(value = "商品库存列表", notes = "商品库存列表", httpMethod = "GET")
    @RequestMapping(value = "/goodsInfoList", method = RequestMethod.GET)
    @ResponseBody
    public MobileResult goodsInfoList(@RequestParam(required = false) String orgId,
                                      @RequestParam(required = false) String keyWord,
                                      @RequestParam(required = false) String classifyId,
                                      @ApiParam(value = "当前页,从1开始") @RequestParam(required = false, defaultValue = "1") Integer page,
                                      @ApiParam(value = "选填,每页显示数量,默认10") @RequestParam(required = false, defaultValue = "10") Integer limit){

        return goodsService.goodsInfoList(Integer.parseInt(orgId),keyWord,classifyId,page,limit);
    }

}
