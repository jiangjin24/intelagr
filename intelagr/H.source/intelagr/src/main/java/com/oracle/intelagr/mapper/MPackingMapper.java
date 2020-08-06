package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.MPacking;
import com.oracle.intelagr.entity.MPackingExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MPackingMapper {
    int countByExample(MPackingExample example);

    int deleteByExample(MPackingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MPacking record);

    int insertSelective(MPacking record);

    List<MPacking> selectByExample(MPackingExample example);

    MPacking selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MPacking record, @Param("example") MPackingExample example);

    int updateByExample(@Param("record") MPacking record, @Param("example") MPackingExample example);

    int updateByPrimaryKeySelective(MPacking record);

    int updateByPrimaryKey(MPacking record);
}