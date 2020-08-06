package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.BWatermonitoring;
import com.oracle.intelagr.entity.BWatermonitoringExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BWatermonitoringMapper {
    int countByExample(BWatermonitoringExample example);

    int deleteByExample(BWatermonitoringExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BWatermonitoring record);

    int insertSelective(BWatermonitoring record);

    List<BWatermonitoring> selectByExample(BWatermonitoringExample example);

    BWatermonitoring selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BWatermonitoring record, @Param("example") BWatermonitoringExample example);

    int updateByExample(@Param("record") BWatermonitoring record, @Param("example") BWatermonitoringExample example);

    int updateByPrimaryKeySelective(BWatermonitoring record);

    int updateByPrimaryKey(BWatermonitoring record);
}