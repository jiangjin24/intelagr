package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.BBlacklistmanageh;
import com.oracle.intelagr.entity.BBlacklistmanagehExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BBlacklistmanagehMapper {
    int countByExample(BBlacklistmanagehExample example);

    int deleteByExample(BBlacklistmanagehExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BBlacklistmanageh record);

    int insertSelective(BBlacklistmanageh record);

    List<BBlacklistmanageh> selectByExample(BBlacklistmanagehExample example);

    BBlacklistmanageh selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BBlacklistmanageh record, @Param("example") BBlacklistmanagehExample example);

    int updateByExample(@Param("record") BBlacklistmanageh record, @Param("example") BBlacklistmanagehExample example);

    int updateByPrimaryKeySelective(BBlacklistmanageh record);

    int updateByPrimaryKey(BBlacklistmanageh record);
}