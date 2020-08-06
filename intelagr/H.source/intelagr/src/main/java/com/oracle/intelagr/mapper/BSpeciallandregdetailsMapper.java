package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.BSpeciallandregdetails;
import com.oracle.intelagr.entity.BSpeciallandregdetailsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BSpeciallandregdetailsMapper {
    int countByExample(BSpeciallandregdetailsExample example);

    int deleteByExample(BSpeciallandregdetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BSpeciallandregdetails record);

    int insertSelective(BSpeciallandregdetails record);

    List<BSpeciallandregdetails> selectByExample(BSpeciallandregdetailsExample example);

    BSpeciallandregdetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BSpeciallandregdetails record, @Param("example") BSpeciallandregdetailsExample example);

    int updateByExample(@Param("record") BSpeciallandregdetails record, @Param("example") BSpeciallandregdetailsExample example);

    int updateByPrimaryKeySelective(BSpeciallandregdetails record);

    int updateByPrimaryKey(BSpeciallandregdetails record);
}