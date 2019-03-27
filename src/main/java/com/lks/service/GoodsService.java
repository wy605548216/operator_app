package com.lks.service;

import com.lks.pojo.MobileResult;

public interface GoodsService {

    MobileResult goodsRank(Integer orgId,Integer page,Integer limit,String beginTime,String endTime);

    MobileResult goodsClassify(Integer orgId);

    MobileResult goodsInfoList(Integer orgId,String keyWord,String classifyId,Integer page,Integer limit);
}
