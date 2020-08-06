package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.BLandregchange;
import com.oracle.intelagr.entity.BLandregchangeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BLandregchangeMapper {
    int countByExample(BLandregchangeExample example);

    int deleteByExample(BLandregchangeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BLandregchange record);

    int insertSelective(BLandregchange record);

    List<BLandregchange> selectByExample(BLandregchangeExample example);

    BLandregchange selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BLandregchange record, @Param("example") BLandregchangeExample example);

    int updateByExample(@Param("record") BLandregchange record, @Param("example") BLandregchangeExample example);

    int updateByPrimaryKeySelective(BLandregchange record);

    int updateByPrimaryKey(BLandregchange record);
}