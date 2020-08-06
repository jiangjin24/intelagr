package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.BProcessMonitoring;
import com.oracle.intelagr.entity.BProcessMonitoringExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BProcessMonitoringMapper {
    int countByExample(BProcessMonitoringExample example);

    int deleteByExample(BProcessMonitoringExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BProcessMonitoring record);

    int insertSelective(BProcessMonitoring record);

    List<BProcessMonitoring> selectByExample(BProcessMonitoringExample example);

    BProcessMonitoring selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BProcessMonitoring record, @Param("example") BProcessMonitoringExample example);

    int updateByExample(@Param("record") BProcessMonitoring record, @Param("example") BProcessMonitoringExample example);

    int updateByPrimaryKeySelective(BProcessMonitoring record);

    int updateByPrimaryKey(BProcessMonitoring record);
}