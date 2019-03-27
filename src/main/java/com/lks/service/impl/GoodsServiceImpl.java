package com.lks.service.impl;

import com.github.pagehelper.PageHelper;
import com.lks.mapper.GoodsRankMapper;
import com.lks.pojo.MobileResult;
import com.lks.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsRankMapper goodsRankMapper;

    @Override
    public MobileResult goodsRank(Integer orgId, Integer page, Integer limit,String beginTime,String endTime) {
        PageHelper.startPage(page, limit);
        List<Map<String,Object>> stringObjectMap = goodsRankMapper.goodsRank(orgId,beginTime,endTime);
        return MobileResult.success(stringObjectMap);
    }

    @Override
    public MobileResult goodsClassify(Integer orgId) {
        List<Map<String, Object>> list = goodsRankMapper.goodsClassify(orgId);
        return MobileResult.success(list);
    }

    @Override
    public MobileResult goodsInfoList(Integer orgId, String keyWord, String classifyId,Integer page,Integer limit) {
        PageHelper.startPage(page, limit);
        List<Map<String, Object>> list = goodsRankMapper.goodsInfoList(orgId,keyWord,classifyId);
        return MobileResult.success(list);
    }
}
