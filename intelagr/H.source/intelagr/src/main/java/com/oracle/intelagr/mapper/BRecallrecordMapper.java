package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.BRecallrecord;
import com.oracle.intelagr.entity.BRecallrecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BRecallrecordMapper {
    int countByExample(BRecallrecordExample example);

    int deleteByExample(BRecallrecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BRecallrecord record);

    int insertSelective(BRecallrecord record);

    List<BRecallrecord> selectByExample(BRecallrecordExample example);

    BRecallrecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BRecallrecord record, @Param("example") BRecallrecordExample example);

    int updateByExample(@Param("record") BRecallrecord record, @Param("example") BRecallrecordExample example);

    int updateByPrimaryKeySelective(BRecallrecord record);

    int updateByPrimaryKey(BRecallrecord record);
}