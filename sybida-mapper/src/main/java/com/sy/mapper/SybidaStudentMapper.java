package com.sy.mapper;

import com.sy.pojo.SybidaStudent;
import com.sy.pojo.SybidaStudentAndStudyAndClass;
import com.sy.pojo.SybidaStudentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SybidaStudentMapper {
    int countByExample(SybidaStudentExample example);

    int deleteByExample(SybidaStudentExample example);

    int deleteByPrimaryKey(Integer studentId);

    int insert(SybidaStudent record);

    int insertSelective(SybidaStudent record);

    List<SybidaStudent> selectByExample(SybidaStudentExample example);

    SybidaStudent selectByPrimaryKey(Integer studentId);

    int updateByExampleSelective(@Param("record") SybidaStudent record, @Param("example") SybidaStudentExample example);

    int updateByExample(@Param("record") SybidaStudent record, @Param("example") SybidaStudentExample example);

    int updateByPrimaryKeySelective(SybidaStudent record);

    int updateByPrimaryKey(SybidaStudent record);
    List<SybidaStudentAndStudyAndClass> selectByExampleSelective(SybidaStudent sybidaStudent);
}