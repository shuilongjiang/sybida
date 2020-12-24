package com.sy.mapper;

import com.sy.dto.StudentVitae;
import com.sy.dto.VitaeLevelForTeacher;
import com.sy.pojo.SybidaStudent;
import com.sy.pojo.SybidaStudentAndStudyAndClass;
import com.sy.pojo.SybidaStudentExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
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

    int updateByPrimaryKey(int record);

    List<SybidaStudentAndStudyAndClass> selectByExampleSelective(SybidaStudent sybidaStudent);

   int updateStudentInfo(SybidaStudent object);

    List<StudentVitae> selectStudentVitaeById(Integer studentId);

}