package com.sy.service;

import com.sy.pojo.SybidaClass;
import com.sy.pojo.SybidaStudy;
import com.sy.vo.ResponseResult;

import java.util.List;

public interface ClassInfoService {
    ResponseResult selectAllByPage(int currPage, int pageSize);

    ResponseResult selectByclassName(String className);

    List<SybidaClass> selectClass();

    List<SybidaStudy> selectStudy();

    ResponseResult deleteClass(String classId);
}
