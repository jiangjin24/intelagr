package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.BLandlog;
import com.oracle.intelagr.entity.BLandlogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BLandlogMapper {
    int countByExample(BLandlogExample example);

    int deleteByExample(BLandlogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BLandlog record);

    int insertSelective(BLandlog record);

    List<BLandlog> selectByExample(BLandlogExample example);

    BLandlog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BLandlog record, @Param("example") BLandlogExample example);

    int updateByExample(@Param("record") BLandlog record, @Param("example") BLandlogExample example);

    int updateByPrimaryKeySelective(BLandlog record);

    int updateByPrimaryKey(BLandlog record);
}