package com.sy.mapper;

import com.sy.dto.StudentJobForTeacher;
import com.sy.pojo.HotList;
import com.sy.pojo.SybidaJob;
import com.sy.pojo.SybidaJobExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
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

    List<HotList> selectHotList();

    List<StudentJobForTeacher> selectStudentJob();

    StudentJobForTeacher selectJobById(@Param("stuID") Integer id);

}