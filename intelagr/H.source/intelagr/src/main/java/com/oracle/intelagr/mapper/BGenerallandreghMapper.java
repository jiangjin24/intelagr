package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.BGenerallandregh;
import com.oracle.intelagr.entity.BGenerallandreghExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BGenerallandreghMapper {
    int countByExample(BGenerallandreghExample example);

    int deleteByExample(BGenerallandreghExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BGenerallandregh record);

    int insertSelective(BGenerallandregh record);

    List<BGenerallandregh> selectByExample(BGenerallandreghExample example);

    BGenerallandregh selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BGenerallandregh record, @Param("example") BGenerallandreghExample example);

    int updateByExample(@Param("record") BGenerallandregh record, @Param("example") BGenerallandreghExample example);

    int updateByPrimaryKeySelective(BGenerallandregh record);

    int updateByPrimaryKey(BGenerallandregh record);
}