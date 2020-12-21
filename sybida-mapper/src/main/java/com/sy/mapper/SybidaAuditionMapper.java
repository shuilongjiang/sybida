package com.sy.mapper;

import com.sy.dto.AuditionForTeacher;
import com.sy.pojo.SybidaAudition;
import com.sy.pojo.SybidaAuditionExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SybidaAuditionMapper {
    int countByExample(SybidaAuditionExample example);

    int deleteByExample(SybidaAuditionExample example);

    int deleteByPrimaryKey(Integer auditionId);

    int insert(SybidaAudition record);

    int insertSelective(SybidaAudition record);

    List<SybidaAudition> selectByExample(SybidaAuditionExample example);

    SybidaAudition selectByPrimaryKey(Integer auditionId);

    int updateByExampleSelective(@Param("record") SybidaAudition record, @Param("example") SybidaAuditionExample example);

    int updateByExample(@Param("record") SybidaAudition record, @Param("example") SybidaAuditionExample example);

    int updateByPrimaryKeySelective(SybidaAudition record);

    int updateByPrimaryKey(SybidaAudition record);

    List<AuditionForTeacher> selectAuditionByauditionStudentIdForTeacher(Integer auditionStudentId);

    AuditionForTeacher selectstudentInterviewbyauditionId(Integer auditionId);


}