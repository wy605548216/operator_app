package com.lks.mapper;

import com.lks.pojo.AccountDrawalApply;
import com.lks.pojo.AccountDrawalApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface AccountDrawalApplyMapper {
    long countByExample(AccountDrawalApplyExample example);

    int deleteByExample(AccountDrawalApplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccountDrawalApply record);

    int insertSelective(AccountDrawalApply record);

    List<AccountDrawalApply> selectByExample(AccountDrawalApplyExample example);

    AccountDrawalApply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccountDrawalApply record, @Param("example") AccountDrawalApplyExample example);

    int updateByExample(@Param("record") AccountDrawalApply record, @Param("example") AccountDrawalApplyExample example);

    int updateByPrimaryKeySelective(AccountDrawalApply record);

    int updateByPrimaryKey(AccountDrawalApply record);
}