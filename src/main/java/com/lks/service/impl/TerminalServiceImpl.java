package com.lks.service.impl;

import com.github.pagehelper.PageHelper;
import com.lks.mapper.GoodsRankMapper;
import com.lks.mapper.TerminalRankMapper;
import com.lks.pojo.MobileResult;
import com.lks.service.TerminalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TerminalServiceImpl implements TerminalService {

    @Autowired
    private TerminalRankMapper terminalRankMapper;
    @Autowired
    private GoodsRankMapper goodsRankMapper;

    @Override
    public MobileResult terminalRank(Integer orgId,Integer page,Integer limit,String keyWord, String startTime,String endTime) {
        PageHelper.startPage(page, limit);
        List<Map<String,Object>> stringObjectMap = terminalRankMapper.terminalRank(orgId,keyWord,startTime,endTime);
        return MobileResult.success(stringObjectMap);
    }


    @Override
    public MobileResult terminalStateCount(Integer orgId) {
        Map<String,Object> stringObjectMap = terminalRankMapper.terminalStateCount(orgId);
        return MobileResult.success(stringObjectMap);
    }

    @Override
    public MobileResult getTerminalList(Integer orgId, Integer state, Integer page, Integer limit,String conditions) {
        PageHelper.startPage(page, limit);
        List<Map<String, Object>> terminalList = terminalRankMapper.getTerminalList(orgId, state, conditions);
        return MobileResult.success(terminalList);
    }

    @Override
    public MobileResult getTerminalInfo(Integer orgId, Integer terminalId) {
        Map<String, Object> terminalInfo = terminalRankMapper.getTerminalInfo(orgId, terminalId);
        List<Map<String, Object>> goodsList = goodsRankMapper.getGoodsList(terminalId);
        terminalInfo.put("goodsList",goodsList);
        return MobileResult.success(terminalInfo);
    }

    @Override
    public MobileResult getLineAndPoint(Integer orgId) {
        List<Map<String, Object>> lineAndPoint = terminalRankMapper.getLineAndPoint(orgId);
        if(lineAndPoint.isEmpty()){
            return MobileResult.fail("没有管理的线路");
        }
        //线路map
        HashMap<String, String> lineMap = new HashMap<>();
        //总站点map
        HashMap<Object, Object> poinMap = new HashMap<>();
        for (Map<String, Object> lineAndPointMap : lineAndPoint) {
            //不存在 put线路map
            if (!lineMap.containsKey(lineAndPointMap.get("lineId"))){
                //站点List
                ArrayList<Object> poinList = new ArrayList<>();
                lineMap.put(lineAndPointMap.get("lineId").toString(),lineAndPointMap.get("lineTitle").toString());
                //站点map
                HashMap<String, String> pointMap = new HashMap<>();
                for (Map<String,Object> stringObjectMap : lineAndPoint) {
                    if (lineAndPointMap.get("lineId").equals(stringObjectMap.get("pointPId"))){
                        pointMap.put(stringObjectMap.get("pointId").toString(),stringObjectMap.get("pointTitle").toString());
                    }
                }
                if (!pointMap.isEmpty()){
                    poinList.add(pointMap);
                }
                poinMap.put(lineAndPointMap.get("lineId").toString(),poinList);
            }
        }
        LinkedHashMap<Object, Object> lineAndPointMap = new LinkedHashMap<>();
        lineAndPointMap.put("line",lineMap);
        lineAndPointMap.put("poin",poinMap);
        return MobileResult.success(lineAndPointMap);
    }

    @Override
    public MobileResult setOnOff(Integer orgId, Integer terminalId) {
        terminalRankMapper.setOnOff(orgId,terminalId);
        return MobileResult.success();
    }
}
