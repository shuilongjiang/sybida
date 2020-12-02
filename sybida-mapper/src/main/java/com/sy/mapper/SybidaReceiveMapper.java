package com.sy.mapper;

import com.sy.pojo.SybidaReceive;
import com.sy.pojo.SybidaReceiveExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SybidaReceiveMapper {
    int countByExample(SybidaReceiveExample example);

    int deleteByExample(SybidaReceiveExample example);

    int insert(SybidaReceive record);

    int insertSelective(SybidaReceive record);

    List<SybidaReceive> selectByExample(SybidaReceiveExample example);

    int updateByExampleSelective(@Param("record") SybidaReceive record, @Param("example") SybidaReceiveExample example);

    int updateByExample(@Param("record") SybidaReceive record, @Param("example") SybidaReceiveExample example);
}