package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.BGrainreg;
import com.oracle.intelagr.entity.BGrainregExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BGrainregMapper {
    int countByExample(BGrainregExample example);

    int deleteByExample(BGrainregExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BGrainreg record);

    int insertSelective(BGrainreg record);

    List<BGrainreg> selectByExample(BGrainregExample example);

    BGrainreg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BGrainreg record, @Param("example") BGrainregExample example);

    int updateByExample(@Param("record") BGrainreg record, @Param("example") BGrainregExample example);

    int updateByPrimaryKeySelective(BGrainreg record);

    int updateByPrimaryKey(BGrainreg record);
}