package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.TbSecurityH;
import com.oracle.intelagr.entity.TbSecurityHExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSecurityHMapper {
    int countByExample(TbSecurityHExample example);

    int deleteByExample(TbSecurityHExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbSecurityH record);

    int insertSelective(TbSecurityH record);

    List<TbSecurityH> selectByExample(TbSecurityHExample example);

    TbSecurityH selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbSecurityH record, @Param("example") TbSecurityHExample example);

    int updateByExample(@Param("record") TbSecurityH record, @Param("example") TbSecurityHExample example);

    int updateByPrimaryKeySelective(TbSecurityH record);

    int updateByPrimaryKey(TbSecurityH record);
}