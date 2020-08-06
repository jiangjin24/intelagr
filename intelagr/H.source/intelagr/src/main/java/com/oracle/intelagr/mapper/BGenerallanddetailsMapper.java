package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.BGenerallanddetails;
import com.oracle.intelagr.entity.BGenerallanddetailsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BGenerallanddetailsMapper {
    int countByExample(BGenerallanddetailsExample example);

    int deleteByExample(BGenerallanddetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BGenerallanddetails record);

    int insertSelective(BGenerallanddetails record);

    List<BGenerallanddetails> selectByExample(BGenerallanddetailsExample example);

    BGenerallanddetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BGenerallanddetails record, @Param("example") BGenerallanddetailsExample example);

    int updateByExample(@Param("record") BGenerallanddetails record, @Param("example") BGenerallanddetailsExample example);

    int updateByPrimaryKeySelective(BGenerallanddetails record);

    int updateByPrimaryKey(BGenerallanddetails record);
}