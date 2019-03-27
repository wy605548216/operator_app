package com.lks.mapper;

import com.lks.pojo.Terminals;
import com.lks.pojo.TerminalsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TerminalsMapper {
    long countByExample(TerminalsExample example);

    int deleteByExample(TerminalsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Terminals record);

    int insertSelective(Terminals record);

    List<Terminals> selectByExample(TerminalsExample example);

    Terminals selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Terminals record, @Param("example") TerminalsExample example);

    int updateByExample(@Param("record") Terminals record, @Param("example") TerminalsExample example);

    int updateByPrimaryKeySelective(Terminals record);

    int updateByPrimaryKey(Terminals record);
}