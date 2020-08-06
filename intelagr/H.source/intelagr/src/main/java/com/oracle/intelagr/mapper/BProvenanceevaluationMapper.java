package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.BProvenanceevaluation;
import com.oracle.intelagr.entity.BProvenanceevaluationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BProvenanceevaluationMapper {
    int countByExample(BProvenanceevaluationExample example);

    int deleteByExample(BProvenanceevaluationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BProvenanceevaluation record);

    int insertSelective(BProvenanceevaluation record);

    List<BProvenanceevaluation> selectByExample(BProvenanceevaluationExample example);

    BProvenanceevaluation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BProvenanceevaluation record, @Param("example") BProvenanceevaluationExample example);

    int updateByExample(@Param("record") BProvenanceevaluation record, @Param("example") BProvenanceevaluationExample example);

    int updateByPrimaryKeySelective(BProvenanceevaluation record);

    int updateByPrimaryKey(BProvenanceevaluation record);
}