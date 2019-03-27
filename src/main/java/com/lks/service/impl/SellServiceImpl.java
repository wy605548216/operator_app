package com.lks.service.impl;

import com.lks.mapper.RevenueMapper;
import com.lks.pojo.MobileResult;
import com.lks.service.SellService;
import com.lks.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Service
public class SellServiceImpl implements SellService{

    @Autowired
    private RevenueMapper revenueMapper;

    private DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    public MobileResult revenueCount(Integer orgId, String beginTime, String endTime) {

        BigDecimal bigDecimal = revenueMapper.revenueCount(orgId, beginTime, endTime);
        return MobileResult.success(bigDecimal);
    }


    public List<Map<String,Object>> revenueChart(Integer orgId, String beginTime, String endTime, Integer type) throws ParseException {
        List<Map<String,Object>> revenueChartMapList = null;
        if (type == 1 || type == 2){
            revenueChartMapList = revenueMapper.revenueChartDay(orgId,beginTime,endTime);
            //日期填充
            List<Map<String, Object>> list = DateUtils.dateFallDay(revenueChartMapList, LocalDateTime.parse(beginTime, formatter2).getDayOfMonth(),
                    LocalDateTime.parse(endTime, formatter2).getDayOfMonth(), 1);
            return list;
        }else {
            revenueChartMapList = revenueMapper.revenueChartMonth(orgId,beginTime,endTime);
            //日期填充
            List<Map<String, Object>> list = DateUtils.dateFallMonth(revenueChartMapList, LocalDateTime.parse(beginTime, formatter2).getMonth().getValue(),
                    LocalDateTime.parse(endTime, formatter2).getMonth().getValue(), 1);
            return list;
        }

    }

    @Override
    public MobileResult indexCount(Integer orgId) throws ParseException {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("revenueCountDay",revenueMapper.revenueCount(orgId, sdf.format(DateUtils.getDayBegin()), sdf.format(DateUtils.getDayEnd())));
        hashMap.put("revenueCountWeek",revenueMapper.revenueCount(orgId, sdf.format(DateUtils.getBeginDayOfWeek()), sdf.format(DateUtils.getEndDayOfWeek())));
        hashMap.put("revenueCountMonth",revenueMapper.revenueCount(orgId, sdf.format(DateUtils.getBeginDayOfMonth()), sdf.format(DateUtils.getEndDayOfMonth())));

        hashMap.put("revenueChartWeek",revenueChart(orgId, sdf.format(DateUtils.getBeginDayOfWeek()), sdf.format(DateUtils.getEndDayOfWeek()),1));
        hashMap.put("revenueChartMonth",revenueChart(orgId, sdf.format(DateUtils.getBeginDayOfMonth()), sdf.format(DateUtils.getEndDayOfMonth()),1));
        hashMap.put("revenueChartYear",revenueChart(orgId, sdf.format(DateUtils.getBeginDayOfYear()), sdf.format(DateUtils.getEndDayOfYear()),3));
        return MobileResult.success(hashMap);
    }


}
