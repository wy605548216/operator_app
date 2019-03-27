package com.lks.service;

import com.lks.pojo.AccountDrawalApply;
import com.lks.pojo.MobileResult;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;


public interface UserService {

    MobileResult login(String userName, String password, HttpServletRequest request) throws Exception;

    MobileResult userInfo(Integer orgId);

    MobileResult drawalList(Integer orgId,Integer state);

    MobileResult withdraw(Integer orgId,AccountDrawalApply accountDrawalApply, Integer userId);

    MobileResult abnormalOrder(Integer orgId,Integer state);

    MobileResult abnormalOrderDetail(Integer orgId,Integer id);

    MobileResult refund(Integer orgId, Integer id, BigDecimal refundMoney);

    MobileResult withdrawDetail(Integer orgId, Integer userId,Integer id);

}
