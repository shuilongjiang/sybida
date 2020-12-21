package com.sy.service;

import com.sy.pojo.SybidaClass;
import com.sy.pojo.SybidaStudy;
import com.sy.vo.ResponseResult;

import java.util.List;

public interface StudyInfoService {
    ResponseResult selectAllByPage(int pageNum, int pageSize, String selectStudy);
    ResponseResult delecOnetStudy(String studyId);
    ResponseResult deleteAllStudy(List<Integer> list);
    ResponseResult updateStudy(SybidaStudy sybidaStudy);
    SybidaStudy showOneStudy(String studyId);
}
