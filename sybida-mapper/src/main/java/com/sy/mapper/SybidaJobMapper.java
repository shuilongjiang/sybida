package com.sy.mapper;

import com.sy.pojo.SybidaJob;
import com.sy.pojo.SybidaJobExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SybidaJobMapper {
    int countByExample(SybidaJobExample example);

    int deleteByExample(SybidaJobExample example);

    int deleteByPrimaryKey(Integer jobId);

    int insert(SybidaJob record);

    int insertSelective(SybidaJob record);

    List<SybidaJob> selectByExample(SybidaJobExample example);

    SybidaJob selectByPrimaryKey(Integer jobId);

    int updateByExampleSelective(@Param("record") SybidaJob record, @Param("example") SybidaJobExample example);

    int updateByExample(@Param("record") SybidaJob record, @Param("example") SybidaJobExample example);

    int updateByPrimaryKeySelective(SybidaJob record);

    int updateByPrimaryKey(SybidaJob record);
}