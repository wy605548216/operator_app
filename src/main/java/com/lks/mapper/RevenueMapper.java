package com.lks.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Component
public interface RevenueMapper {

    BigDecimal revenueCount(@Param("orgId")Integer orgId, @Param("beginTime")String beginTime, @Param("endTime")String endTime);

    List<Map<String,Object>> revenueChartDay(@Param("orgId") Integer orgId, @Param("beginTime")String beginTime, @Param("endTime")String endTime);

    List<Map<String,Object>> revenueChartMonth(@Param("orgId")Integer orgId, @Param("beginTime")String beginTime, @Param("endTime")String endTime);
}
