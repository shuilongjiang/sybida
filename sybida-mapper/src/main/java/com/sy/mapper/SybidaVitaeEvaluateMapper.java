package com.sy.mapper;

import com.sy.pojo.SybidaVitaeEvaluate;
import com.sy.pojo.SybidaVitaeEvaluateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SybidaVitaeEvaluateMapper {
    int countByExample(SybidaVitaeEvaluateExample example);

    int deleteByExample(SybidaVitaeEvaluateExample example);

    int insert(SybidaVitaeEvaluate record);

    int insertSelective(SybidaVitaeEvaluate record);

    List<SybidaVitaeEvaluate> selectByExample(SybidaVitaeEvaluateExample example);

    int updateByExampleSelective(@Param("record") SybidaVitaeEvaluate record, @Param("example") SybidaVitaeEvaluateExample example);

    int updateByExample(@Param("record") SybidaVitaeEvaluate record, @Param("example") SybidaVitaeEvaluateExample example);
}