package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.BGrainevaluation;
import com.oracle.intelagr.entity.BGrainevaluationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BGrainevaluationMapper {
    int countByExample(BGrainevaluationExample example);

    int deleteByExample(BGrainevaluationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BGrainevaluation record);

    int insertSelective(BGrainevaluation record);

    List<BGrainevaluation> selectByExample(BGrainevaluationExample example);

    BGrainevaluation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BGrainevaluation record, @Param("example") BGrainevaluationExample example);

    int updateByExample(@Param("record") BGrainevaluation record, @Param("example") BGrainevaluationExample example);

    int updateByPrimaryKeySelective(BGrainevaluation record);

    int updateByPrimaryKey(BGrainevaluation record);
}