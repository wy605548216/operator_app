package com.lks.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Component
public interface MessageMapper {

    List<Map<String,Object>>  getMessageList(@Param("orgId") Integer orgId, @Param("state") Integer state, @Param("beginTime") String beginTime, @Param("endTime") String endTime);

    List<Map<String,Object>> getMessageOrderList(@Param("orgId") Integer orgId, @Param("orderState") Integer orderState, @Param("state") Integer state, @Param("beginTime") String beginTime, @Param("endTime") String endTime);

    List<Map<String,Object>>  getMessage(@Param("orgId") Integer orgId);

    Map<String,Object> getMessageInfo(@Param("orgId") Integer orgId, @Param("messageId")Integer messageId);

    List<Map<String,Object>> abnormalOrder(@Param("orgId") Integer orgId, @Param("orderState") Integer orderState);

    Map<String,Object> abnormalOrderDetail(@Param("orgId") Integer orgId, @Param("id") Integer id);

    List<Map<String,Object>> getOrderDetail(@Param("orgId") Integer orgId, @Param("id") Integer id);

    List<Map<String,Object>> getRefundMessageList(@Param("orgId") Integer orgId, @Param("beginTime") String beginTime, @Param("endTime") String endTime);

    List<Map<String,Object>> getSellMessageOrderList(@Param("orgId") Integer orgId, @Param("beginTime") String beginTime, @Param("endTime") String endTime);

    BigDecimal countMoney(@Param("orgId") Integer orgId, @Param("beginTime")String beginTime,@Param("endTime") String endTime);
}
