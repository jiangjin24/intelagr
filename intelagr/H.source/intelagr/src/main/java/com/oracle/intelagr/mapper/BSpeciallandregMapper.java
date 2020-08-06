package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.BSpeciallandreg;
import com.oracle.intelagr.entity.BSpeciallandregExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BSpeciallandregMapper {
    int countByExample(BSpeciallandregExample example);

    int deleteByExample(BSpeciallandregExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BSpeciallandreg record);

    int insertSelective(BSpeciallandreg record);

    List<BSpeciallandreg> selectByExample(BSpeciallandregExample example);

    BSpeciallandreg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BSpeciallandreg record, @Param("example") BSpeciallandregExample example);

    int updateByExample(@Param("record") BSpeciallandreg record, @Param("example") BSpeciallandregExample example);

    int updateByPrimaryKeySelective(BSpeciallandreg record);

    int updateByPrimaryKey(BSpeciallandreg record);
}