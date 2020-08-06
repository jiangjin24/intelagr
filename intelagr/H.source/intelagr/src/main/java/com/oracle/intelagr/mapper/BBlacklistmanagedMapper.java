package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.BBlacklistmanaged;
import com.oracle.intelagr.entity.BBlacklistmanagedExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BBlacklistmanagedMapper {
    int countByExample(BBlacklistmanagedExample example);

    int deleteByExample(BBlacklistmanagedExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BBlacklistmanaged record);

    int insertSelective(BBlacklistmanaged record);

    List<BBlacklistmanaged> selectByExample(BBlacklistmanagedExample example);

    BBlacklistmanaged selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BBlacklistmanaged record, @Param("example") BBlacklistmanagedExample example);

    int updateByExample(@Param("record") BBlacklistmanaged record, @Param("example") BBlacklistmanagedExample example);

    int updateByPrimaryKeySelective(BBlacklistmanaged record);

    int updateByPrimaryKey(BBlacklistmanaged record);
}