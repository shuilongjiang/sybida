package com.sy.service;

import com.sy.vo.ResponseResult;

public interface ClassInfoService {
    ResponseResult selectAllByPage(int currPage, int pageSize);

    ResponseResult selectByclassName(String className);

    ResponseResult selcetAllStudent(int pageSize,int pageNum);

    ResponseResult selcetStudentById(int id);
}
