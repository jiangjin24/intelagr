package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.BYieldpredictiond;
import com.oracle.intelagr.entity.BYieldpredictiondExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BYieldpredictiondMapper {
    int countByExample(BYieldpredictiondExample example);

    int deleteByExample(BYieldpredictiondExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BYieldpredictiond record);

    int insertSelective(BYieldpredictiond record);

    List<BYieldpredictiond> selectByExample(BYieldpredictiondExample example);

    BYieldpredictiond selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BYieldpredictiond record, @Param("example") BYieldpredictiondExample example);

    int updateByExample(@Param("record") BYieldpredictiond record, @Param("example") BYieldpredictiondExample example);

    int updateByPrimaryKeySelective(BYieldpredictiond record);

    int updateByPrimaryKey(BYieldpredictiond record);
}