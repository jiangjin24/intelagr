package com.oracle.intelagr.mapper;

import com.oracle.intelagr.entity.BGrainfarmerdetail;
import com.oracle.intelagr.entity.BGrainfarmerdetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BGrainfarmerdetailMapper {
    int countByExample(BGrainfarmerdetailExample example);

    int deleteByExample(BGrainfarmerdetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BGrainfarmerdetail record);

    int insertSelective(BGrainfarmerdetail record);

    List<BGrainfarmerdetail> selectByExample(BGrainfarmerdetailExample example);

    BGrainfarmerdetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BGrainfarmerdetail record, @Param("example") BGrainfarmerdetailExample example);

    int updateByExample(@Param("record") BGrainfarmerdetail record, @Param("example") BGrainfarmerdetailExample example);

    int updateByPrimaryKeySelective(BGrainfarmerdetail record);

    int updateByPrimaryKey(BGrainfarmerdetail record);
}