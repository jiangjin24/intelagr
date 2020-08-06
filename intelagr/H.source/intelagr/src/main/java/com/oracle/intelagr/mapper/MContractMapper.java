package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.MContract;
import com.oracle.intelagr.entity.MContractExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MContractMapper {
    int countByExample(MContractExample example);

    int deleteByExample(MContractExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MContract record);

    int insertSelective(MContract record);

    List<MContract> selectByExample(MContractExample example);

    MContract selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MContract record, @Param("example") MContractExample example);

    int updateByExample(@Param("record") MContract record, @Param("example") MContractExample example);

    int updateByPrimaryKeySelective(MContract record);

    int updateByPrimaryKey(MContract record);
}