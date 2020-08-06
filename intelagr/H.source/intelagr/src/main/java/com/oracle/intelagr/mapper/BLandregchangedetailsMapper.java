package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.BLandregchangedetails;
import com.oracle.intelagr.entity.BLandregchangedetailsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BLandregchangedetailsMapper {
    int countByExample(BLandregchangedetailsExample example);

    int deleteByExample(BLandregchangedetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BLandregchangedetails record);

    int insertSelective(BLandregchangedetails record);

    List<BLandregchangedetails> selectByExample(BLandregchangedetailsExample example);

    BLandregchangedetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BLandregchangedetails record, @Param("example") BLandregchangedetailsExample example);

    int updateByExample(@Param("record") BLandregchangedetails record, @Param("example") BLandregchangedetailsExample example);

    int updateByPrimaryKeySelective(BLandregchangedetails record);

    int updateByPrimaryKey(BLandregchangedetails record);
}