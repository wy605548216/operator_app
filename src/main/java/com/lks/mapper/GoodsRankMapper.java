package com.lks.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface GoodsRankMapper {

    List<Map<String,Object>> goodsRank(@Param("orgId") Integer orgId, @Param("beginTime") String beginTime, @Param("endTime") String endTime);

    List<Map<String,Object>> getGoodsList(@Param("terminalId") Integer terminalId);

    List<Map<String,Object>> goodsClassify(@Param("orgId") Integer orgId);

    List<Map<String,Object>> goodsInfoList(@Param("orgId")Integer orgId, @Param("keyWord")String keyWord, @Param("classifyId")String classifyId);
}
