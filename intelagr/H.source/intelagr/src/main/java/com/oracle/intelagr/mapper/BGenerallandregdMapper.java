package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.BGenerallandregd;
import com.oracle.intelagr.entity.BGenerallandregdExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BGenerallandregdMapper {
    int countByExample(BGenerallandregdExample example);

    int deleteByExample(BGenerallandregdExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BGenerallandregd record);

    int insertSelective(BGenerallandregd record);

    List<BGenerallandregd> selectByExample(BGenerallandregdExample example);

    BGenerallandregd selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BGenerallandregd record, @Param("example") BGenerallandregdExample example);

    int updateByExample(@Param("record") BGenerallandregd record, @Param("example") BGenerallandregdExample example);

    int updateByPrimaryKeySelective(BGenerallandregd record);

    int updateByPrimaryKey(BGenerallandregd record);
}