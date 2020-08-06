package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.BSeedcomplaint;
import com.oracle.intelagr.entity.BSeedcomplaintExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BSeedcomplaintMapper {
    int countByExample(BSeedcomplaintExample example);

    int deleteByExample(BSeedcomplaintExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BSeedcomplaint record);

    int insertSelective(BSeedcomplaint record);

    List<BSeedcomplaint> selectByExample(BSeedcomplaintExample example);

    BSeedcomplaint selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BSeedcomplaint record, @Param("example") BSeedcomplaintExample example);

    int updateByExample(@Param("record") BSeedcomplaint record, @Param("example") BSeedcomplaintExample example);

    int updateByPrimaryKeySelective(BSeedcomplaint record);

    int updateByPrimaryKey(BSeedcomplaint record);
}