package com.sy.service;

import com.sy.vo.ResponseResult;

public interface TeacherSerivce {

    ResponseResult selectPage(int pageSize, int pageNum,String  teacherStudy);

    ResponseResult selectStudy();

}
