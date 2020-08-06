package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.BGrainforecasth;
import com.oracle.intelagr.entity.BGrainforecasthExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BGrainforecasthMapper {
    int countByExample(BGrainforecasthExample example);

    int deleteByExample(BGrainforecasthExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BGrainforecasth record);

    int insertSelective(BGrainforecasth record);

    List<BGrainforecasth> selectByExample(BGrainforecasthExample example);

    BGrainforecasth selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BGrainforecasth record, @Param("example") BGrainforecasthExample example);

    int updateByExample(@Param("record") BGrainforecasth record, @Param("example") BGrainforecasthExample example);

    int updateByPrimaryKeySelective(BGrainforecasth record);

    int updateByPrimaryKey(BGrainforecasth record);
}