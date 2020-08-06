package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.BLandregchangehis;
import com.oracle.intelagr.entity.BLandregchangehisExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BLandregchangehisMapper {
    int countByExample(BLandregchangehisExample example);

    int deleteByExample(BLandregchangehisExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BLandregchangehis record);

    int insertSelective(BLandregchangehis record);

    List<BLandregchangehis> selectByExample(BLandregchangehisExample example);

    BLandregchangehis selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BLandregchangehis record, @Param("example") BLandregchangehisExample example);

    int updateByExample(@Param("record") BLandregchangehis record, @Param("example") BLandregchangehisExample example);

    int updateByPrimaryKeySelective(BLandregchangehis record);

    int updateByPrimaryKey(BLandregchangehis record);
}