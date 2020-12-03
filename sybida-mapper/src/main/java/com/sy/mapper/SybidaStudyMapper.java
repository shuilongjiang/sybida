package com.sy.mapper;

import com.sy.pojo.SybidaStudy;
import com.sy.pojo.SybidaStudyExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SybidaStudyMapper {
    int countByExample(SybidaStudyExample example);

    int deleteByExample(SybidaStudyExample example);

    int deleteByPrimaryKey(Integer studyId);

    int insert(SybidaStudy record);

    int insertSelective(SybidaStudy record);

    List<SybidaStudy> selectByExample(SybidaStudyExample example);

    SybidaStudy selectByPrimaryKey(Integer studyId);

    int updateByExampleSelective(@Param("record") SybidaStudy record, @Param("example") SybidaStudyExample example);

    int updateByExample(@Param("record") SybidaStudy record, @Param("example") SybidaStudyExample example);

    int updateByPrimaryKeySelective(SybidaStudy record);

    int updateByPrimaryKey(SybidaStudy record);
}