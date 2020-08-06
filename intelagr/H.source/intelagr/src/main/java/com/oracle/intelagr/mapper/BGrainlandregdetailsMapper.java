package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.BGrainlandregdetails;
import com.oracle.intelagr.entity.BGrainlandregdetailsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BGrainlandregdetailsMapper {
    int countByExample(BGrainlandregdetailsExample example);

    int deleteByExample(BGrainlandregdetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BGrainlandregdetails record);

    int insertSelective(BGrainlandregdetails record);

    List<BGrainlandregdetails> selectByExample(BGrainlandregdetailsExample example);

    BGrainlandregdetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BGrainlandregdetails record, @Param("example") BGrainlandregdetailsExample example);

    int updateByExample(@Param("record") BGrainlandregdetails record, @Param("example") BGrainlandregdetailsExample example);

    int updateByPrimaryKeySelective(BGrainlandregdetails record);

    int updateByPrimaryKey(BGrainlandregdetails record);
}