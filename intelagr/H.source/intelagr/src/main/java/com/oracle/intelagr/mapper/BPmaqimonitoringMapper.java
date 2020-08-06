package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.BPmaqimonitoring;
import com.oracle.intelagr.entity.BPmaqimonitoringExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BPmaqimonitoringMapper {
    int countByExample(BPmaqimonitoringExample example);

    int deleteByExample(BPmaqimonitoringExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BPmaqimonitoring record);

    int insertSelective(BPmaqimonitoring record);

    List<BPmaqimonitoring> selectByExample(BPmaqimonitoringExample example);

    BPmaqimonitoring selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BPmaqimonitoring record, @Param("example") BPmaqimonitoringExample example);

    int updateByExample(@Param("record") BPmaqimonitoring record, @Param("example") BPmaqimonitoringExample example);

    int updateByPrimaryKeySelective(BPmaqimonitoring record);

    int updateByPrimaryKey(BPmaqimonitoring record);
}