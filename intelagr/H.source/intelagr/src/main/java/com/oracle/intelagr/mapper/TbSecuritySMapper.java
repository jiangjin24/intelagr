package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.TbSecurityS;
import com.oracle.intelagr.entity.TbSecuritySExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbSecuritySMapper {
    int countByExample(TbSecuritySExample example);

    int deleteByExample(TbSecuritySExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbSecurityS record);

    int insertSelective(TbSecurityS record);

    List<TbSecurityS> selectByExample(TbSecuritySExample example);

    TbSecurityS selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbSecurityS record, @Param("example") TbSecuritySExample example);

    int updateByExample(@Param("record") TbSecurityS record, @Param("example") TbSecuritySExample example);

    int updateByPrimaryKeySelective(TbSecurityS record);

    int updateByPrimaryKey(TbSecurityS record);
}