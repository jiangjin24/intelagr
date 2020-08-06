package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.BLandPicture;
import com.oracle.intelagr.entity.BLandPictureExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BLandPictureMapper {
    int countByExample(BLandPictureExample example);

    int deleteByExample(BLandPictureExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BLandPicture record);

    int insertSelective(BLandPicture record);

    List<BLandPicture> selectByExample(BLandPictureExample example);

    BLandPicture selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BLandPicture record, @Param("example") BLandPictureExample example);

    int updateByExample(@Param("record") BLandPicture record, @Param("example") BLandPictureExample example);

    int updateByPrimaryKeySelective(BLandPicture record);

    int updateByPrimaryKey(BLandPicture record);
}