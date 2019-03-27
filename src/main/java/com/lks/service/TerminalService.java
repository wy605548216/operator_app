package com.lks.service;

import com.lks.pojo.MobileResult;

public interface TerminalService {

    MobileResult terminalRank(Integer orgId,Integer page,Integer limit,String keyWord, String startTime,String endTime);

    MobileResult terminalStateCount(Integer orgId);

    MobileResult getTerminalList(Integer orgId,Integer state,Integer page,Integer limit,String conditions);

    MobileResult getTerminalInfo(Integer orgId,Integer terminalId);

    MobileResult getLineAndPoint(Integer orgId);

    MobileResult setOnOff(Integer orgId,Integer terminalId);
}
