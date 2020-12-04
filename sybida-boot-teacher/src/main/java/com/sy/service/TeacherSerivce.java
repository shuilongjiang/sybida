package com.sy.service;

import com.sy.vo.ResponseResult;

import java.util.List;

public interface TeacherSerivce {

    ResponseResult selectPage(int pageSize, int pageNum,String  teacherStudy);

    ResponseResult selectStudy();
    ResponseResult deleteTeacher(Integer deleteTeacher);
    ResponseResult deleteAllTeacher(List<Integer> list);
}
