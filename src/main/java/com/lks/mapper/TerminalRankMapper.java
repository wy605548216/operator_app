package com.lks.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface TerminalRankMapper {

    List<Map<String,Object>> terminalRank(@Param("orgId") Integer orgId,@Param("keyWord") String keyWord,
                                          @Param("startTime") String startTime,@Param("endTime") String endTime);

    Map<String,Object> terminalStateCount(@Param("orgId") Integer orgId);

    List<Map<String,Object>> getTerminalList(@Param("orgId") Integer orgId,@Param("state") Integer state,@Param("conditions") String conditions);

    Map<String,Object> getTerminalInfo(@Param("orgId") Integer orgId, @Param("terminalId") Integer terminalId);

    List<Map<String,Object>> getLineAndPoint(@Param("orgId") Integer orgId);

    void  setOnOff(@Param("orgId") Integer orgId, @Param("terminalId") Integer terminalId);


}
