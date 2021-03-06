package com.sy.service;

import com.sy.dto.LayuiDataforallteacher;
import com.sy.mapper.SybidaVitaeEvaluateMapper;
import com.sy.pojo.SybidaStudent;
import com.sy.pojo.SybidaTeach;
import com.sy.pojo.SybidaUser;
import com.sy.pojo.SybidaVitaeEvaluate;
import com.sy.vo.ResponseResult;

import java.util.List;

public interface TeacherSerivce {

    ResponseResult selectPage(int pageSize, int pageNum,String  teacherStudy);

    ResponseResult selectStudy();
    ResponseResult deleteTeacher(Integer deleteTeacher);
    ResponseResult deleteAllTeacher(List<Integer> list);
    ResponseResult selectAllVitae(int pageSize,int pageNum,String classId);
    LayuiDataforallteacher selectAllVitaeForTeacher(String classId);
    ResponseResult insertVitaeEvaluateLevel(SybidaVitaeEvaluate sybidaVitaeEvaluate);
    ResponseResult selectStudentJob(int pageSize,int pageNum);
    ResponseResult selectJobByStuId(int id);
    ResponseResult selcetAllStudent(int pageSize,int pageNum);
    ResponseResult selcetStudentById(int id);
    ResponseResult updateInfoStudent(SybidaStudent object);
    ResponseResult selectTeacherById(int userid);
    ResponseResult updateTeacherInfo(SybidaTeach object);
    ResponseResult insertTeacher(SybidaUser sybidaUser);
    ResponseResult insertTeachtwo(SybidaTeach sybidaTeach);
    List<SybidaStudent> selectStudentByClassId(String classId);
    ResponseResult selectStudentByName(String name);
    ResponseResult updateLeval(String studentId,String stuLeaval);
    ResponseResult selectTeacherByPhoneNum(String phoneNum);

}
