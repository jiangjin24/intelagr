package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.MMonitorpoint;
import com.oracle.intelagr.entity.MMonitorpointExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MMonitorpointMapper {
    int countByExample(MMonitorpointExample example);

    int deleteByExample(MMonitorpointExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MMonitorpoint record);

    int insertSelective(MMonitorpoint record);

    List<MMonitorpoint> selectByExample(MMonitorpointExample example);

    MMonitorpoint selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MMonitorpoint record, @Param("example") MMonitorpointExample example);

    int updateByExample(@Param("record") MMonitorpoint record, @Param("example") MMonitorpointExample example);

    int updateByPrimaryKeySelective(MMonitorpoint record);

    int updateByPrimaryKey(MMonitorpoint record);
}