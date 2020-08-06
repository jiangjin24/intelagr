package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.BCompanycomplaint;
import com.oracle.intelagr.entity.BCompanycomplaintExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BCompanycomplaintMapper {
    int countByExample(BCompanycomplaintExample example);

    int deleteByExample(BCompanycomplaintExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BCompanycomplaint record);

    int insertSelective(BCompanycomplaint record);

    List<BCompanycomplaint> selectByExample(BCompanycomplaintExample example);

    BCompanycomplaint selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BCompanycomplaint record, @Param("example") BCompanycomplaintExample example);

    int updateByExample(@Param("record") BCompanycomplaint record, @Param("example") BCompanycomplaintExample example);

    int updateByPrimaryKeySelective(BCompanycomplaint record);

    int updateByPrimaryKey(BCompanycomplaint record);
}