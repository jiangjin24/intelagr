package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.BAirmonitoring;
import com.oracle.intelagr.entity.BAirmonitoringExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BAirmonitoringMapper {
    int countByExample(BAirmonitoringExample example);

    int deleteByExample(BAirmonitoringExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BAirmonitoring record);

    int insertSelective(BAirmonitoring record);

    List<BAirmonitoring> selectByExample(BAirmonitoringExample example);

    BAirmonitoring selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BAirmonitoring record, @Param("example") BAirmonitoringExample example);

    int updateByExample(@Param("record") BAirmonitoring record, @Param("example") BAirmonitoringExample example);

    int updateByPrimaryKeySelective(BAirmonitoring record);

    int updateByPrimaryKey(BAirmonitoring record);
}