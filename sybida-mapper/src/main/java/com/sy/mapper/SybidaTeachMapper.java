package com.sy.mapper;

import com.sy.pojo.SybidaTeach;
import com.sy.pojo.SybidaTeachExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SybidaTeachMapper {
    int countByExample(SybidaTeachExample example);

    int deleteByExample(SybidaTeachExample example);

    int deleteByPrimaryKey(Integer teachId);

    int insert(SybidaTeach record);

    int insertSelective(SybidaTeach record);

    List<SybidaTeach> selectByExample(SybidaTeachExample example);

    SybidaTeach selectByPrimaryKey(Integer teachId);

    int updateByExampleSelective(@Param("record") SybidaTeach record, @Param("example") SybidaTeachExample example);

    int updateByExample(@Param("record") SybidaTeach record, @Param("example") SybidaTeachExample example);

    int updateByPrimaryKeySelective(SybidaTeach record);

    int updateByPrimaryKey(SybidaTeach record);
}