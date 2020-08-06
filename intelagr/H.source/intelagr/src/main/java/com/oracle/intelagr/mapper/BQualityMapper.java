package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.BQuality;
import com.oracle.intelagr.entity.BQualityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BQualityMapper {
    int countByExample(BQualityExample example);

    int deleteByExample(BQualityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BQuality record);

    int insertSelective(BQuality record);

    List<BQuality> selectByExample(BQualityExample example);

    BQuality selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BQuality record, @Param("example") BQualityExample example);

    int updateByExample(@Param("record") BQuality record, @Param("example") BQualityExample example);

    int updateByPrimaryKeySelective(BQuality record);

    int updateByPrimaryKey(BQuality record);
}