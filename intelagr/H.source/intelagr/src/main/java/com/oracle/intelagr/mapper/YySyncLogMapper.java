package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.YySyncLog;
import com.oracle.intelagr.entity.YySyncLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface YySyncLogMapper {
    int countByExample(YySyncLogExample example);

    int deleteByExample(YySyncLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YySyncLog record);

    int insertSelective(YySyncLog record);

    List<YySyncLog> selectByExample(YySyncLogExample example);

    YySyncLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YySyncLog record, @Param("example") YySyncLogExample example);

    int updateByExample(@Param("record") YySyncLog record, @Param("example") YySyncLogExample example);

    int updateByPrimaryKeySelective(YySyncLog record);

    int updateByPrimaryKey(YySyncLog record);
}