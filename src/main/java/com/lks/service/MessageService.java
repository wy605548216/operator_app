package com.lks.service;

import com.lks.pojo.MobileResult;

public interface MessageService{

    MobileResult getMessageList(Integer orgId, Integer state, String beginTime, String endTime, Integer page, Integer limit);

    MobileResult getMessage(Integer orgId);

    MobileResult MessageDetails(Integer orgId, Integer messageId);

    MobileResult getNewMessageLists(Integer orgId, Integer state, String beginTime, String endTime, Integer page, Integer limit);
}
