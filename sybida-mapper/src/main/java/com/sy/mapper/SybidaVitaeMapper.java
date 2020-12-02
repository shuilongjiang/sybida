package com.sy.mapper;


import com.sy.pojo.SybidaVitae;
import com.sy.pojo.SybidaVitaeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SybidaVitaeMapper {
    int countByExample(SybidaVitaeExample example);

    int deleteByExample(SybidaVitaeExample example);

    int deleteByPrimaryKey(Integer vitaeId);

    int insert(SybidaVitae record);

    int insertSelective(SybidaVitae record);

    List<SybidaVitae> selectByExample(SybidaVitaeExample example);

    SybidaVitae selectByPrimaryKey(Integer vitaeId);

    int updateByExampleSelective(@Param("record") SybidaVitae record, @Param("example") SybidaVitaeExample example);

    int updateByExample(@Param("record") SybidaVitae record, @Param("example") SybidaVitaeExample example);

    int updateByPrimaryKeySelective(SybidaVitae record);

    int updateByPrimaryKey(SybidaVitae record);
}