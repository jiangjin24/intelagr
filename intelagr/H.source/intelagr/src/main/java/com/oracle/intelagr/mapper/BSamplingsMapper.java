package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.BSamplings;
import com.oracle.intelagr.entity.BSamplingsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BSamplingsMapper {
    int countByExample(BSamplingsExample example);

    int deleteByExample(BSamplingsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BSamplings record);

    int insertSelective(BSamplings record);

    List<BSamplings> selectByExample(BSamplingsExample example);

    BSamplings selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BSamplings record, @Param("example") BSamplingsExample example);

    int updateByExample(@Param("record") BSamplings record, @Param("example") BSamplingsExample example);

    int updateByPrimaryKeySelective(BSamplings record);

    int updateByPrimaryKey(BSamplings record);
}