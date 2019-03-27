package com.lks.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Map;

@Component
public interface RefundMapper {

    Map<String,Object> getOrgParent (@Param("orgId") Integer orgId);

    void setUserMoney(ArrayList<Map<String,Object>> list);

    void addLog(ArrayList<Map<String,Object>> list);

    Map<String,Object> withdrawDetail(@Param("orgId") Integer orgId, @Param("userId") Integer userId, @Param("id")Integer id);
}
