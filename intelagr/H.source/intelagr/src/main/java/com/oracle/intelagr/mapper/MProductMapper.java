package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.MProduct;
import com.oracle.intelagr.entity.MProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MProductMapper {
    int countByExample(MProductExample example);

    int deleteByExample(MProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MProduct record);

    int insertSelective(MProduct record);

    List<MProduct> selectByExample(MProductExample example);

    MProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MProduct record, @Param("example") MProductExample example);

    int updateByExample(@Param("record") MProduct record, @Param("example") MProductExample example);

    int updateByPrimaryKeySelective(MProduct record);

    int updateByPrimaryKey(MProduct record);
}