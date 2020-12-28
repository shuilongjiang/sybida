package com.sy.service;

import com.sy.pojo.SybidaClass;
import com.sy.pojo.SybidaStudy;
import com.sy.pojo.SybidaTeach;
import com.sy.vo.ResponseResult;

import java.util.List;

public interface ClassInfoService {
    ResponseResult selectAllByPage(int pageNum, int pageSize,String selectClass);

    ResponseResult selectByclassName(String className);

    List<SybidaClass> selectClass();

    List<SybidaStudy> selectStudy();

    ResponseResult deleteClass(String classId);

    ResponseResult selectTeachId(String teachId);

    ResponseResult deleteAllClass(List<Integer> list);

    SybidaClass showOneClass(String classId);

    SybidaTeach selectTeacherName(String classTeachId);

    SybidaStudy selectStudyName(String classStudyId);

    ResponseResult updateClassInfo(SybidaClass sybidaClass);

    ResponseResult teacherIdFindClass(String pageSize,String pageNum,String classManagerId);

//    ResponseResult teacherIdFindClass2(String pageSize,String pageNum,String classManagerId);

    ResponseResult teacherIdFindClass2(String pageSize,String pageNum,String classId);
    ResponseResult selectTeacherMutiClass(String classManagerId);
    ResponseResult selectUserByIdClass(String userId,String pageNum,String pageSize,String selectClass);
    ResponseResult selectTeacher();
    ResponseResult selectmanager();
}
