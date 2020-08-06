package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.MPeasant;
import com.oracle.intelagr.entity.MPeasantExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MPeasantMapper {
    int countByExample(MPeasantExample example);

    int deleteByExample(MPeasantExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MPeasant record);

    int insertSelective(MPeasant record);

    List<MPeasant> selectByExample(MPeasantExample example);

    MPeasant selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MPeasant record, @Param("example") MPeasantExample example);

    int updateByExample(@Param("record") MPeasant record, @Param("example") MPeasantExample example);

    int updateByPrimaryKeySelective(MPeasant record);

    int updateByPrimaryKey(MPeasant record);
}