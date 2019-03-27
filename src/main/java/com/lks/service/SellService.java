package com.lks.service;

import com.lks.pojo.MobileResult;

import java.text.ParseException;

public interface SellService {

/*    MobileResult revenueCount(Integer orgId, String beginTime,String endTime);

    MobileResult revenueChart(Integer orgId, String beginTime,String endTime, Integer type) throws ParseException;*/

    MobileResult indexCount(Integer orgId) throws ParseException;
}
