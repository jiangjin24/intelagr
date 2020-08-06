package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.BGrainforecastd;
import com.oracle.intelagr.entity.BGrainforecastdExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BGrainforecastdMapper {
    int countByExample(BGrainforecastdExample example);

    int deleteByExample(BGrainforecastdExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BGrainforecastd record);

    int insertSelective(BGrainforecastd record);

    List<BGrainforecastd> selectByExample(BGrainforecastdExample example);

    BGrainforecastd selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BGrainforecastd record, @Param("example") BGrainforecastdExample example);

    int updateByExample(@Param("record") BGrainforecastd record, @Param("example") BGrainforecastdExample example);

    int updateByPrimaryKeySelective(BGrainforecastd record);

    int updateByPrimaryKey(BGrainforecastd record);
}