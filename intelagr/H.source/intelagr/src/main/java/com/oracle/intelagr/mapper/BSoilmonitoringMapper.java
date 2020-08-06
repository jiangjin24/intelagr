package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.BSoilmonitoring;
import com.oracle.intelagr.entity.BSoilmonitoringExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BSoilmonitoringMapper {
    int countByExample(BSoilmonitoringExample example);

    int deleteByExample(BSoilmonitoringExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BSoilmonitoring record);

    int insertSelective(BSoilmonitoring record);

    List<BSoilmonitoring> selectByExample(BSoilmonitoringExample example);

    BSoilmonitoring selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BSoilmonitoring record, @Param("example") BSoilmonitoringExample example);

    int updateByExample(@Param("record") BSoilmonitoring record, @Param("example") BSoilmonitoringExample example);

    int updateByPrimaryKeySelective(BSoilmonitoring record);

    int updateByPrimaryKey(BSoilmonitoring record);
}