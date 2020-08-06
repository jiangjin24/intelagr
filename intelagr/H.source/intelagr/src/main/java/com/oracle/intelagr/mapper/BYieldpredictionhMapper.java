package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.BYieldpredictionh;
import com.oracle.intelagr.entity.BYieldpredictionhExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BYieldpredictionhMapper {
    int countByExample(BYieldpredictionhExample example);

    int deleteByExample(BYieldpredictionhExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BYieldpredictionh record);

    int insertSelective(BYieldpredictionh record);

    List<BYieldpredictionh> selectByExample(BYieldpredictionhExample example);

    BYieldpredictionh selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BYieldpredictionh record, @Param("example") BYieldpredictionhExample example);

    int updateByExample(@Param("record") BYieldpredictionh record, @Param("example") BYieldpredictionhExample example);

    int updateByPrimaryKeySelective(BYieldpredictionh record);

    int updateByPrimaryKey(BYieldpredictionh record);
}