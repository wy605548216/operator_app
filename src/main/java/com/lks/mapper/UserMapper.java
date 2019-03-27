package com.lks.mapper;

import com.lks.pojo.SysUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface UserMapper {

    SysUser getUserInfo(@Param("userName") String userName, @Param("passWord") String passWord);

    Map<String,Object> getUserInfoMoney(@Param("orgId") Integer orgId);

    List<Map<String,Object>> drawalList(@Param("orgId") Integer orgId, @Param("state") Integer state);
}
