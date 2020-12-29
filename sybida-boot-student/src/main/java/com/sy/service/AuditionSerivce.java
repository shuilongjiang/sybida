package com.sy.service;


import com.sy.pojo.SybidaAudition;
import com.sy.vo.ResponseResult;

import java.util.List;


public interface AuditionSerivce {

    ResponseResult selectClass(String userId);
    ResponseResult selectPage2(int pageSize, int pageNum, String classNum,int userid);
    ResponseResult selectstudentInterviewbyauditionId(int auditionId);
    ResponseResult selectAllClass();
    ResponseResult selectStudentById(String userId);
    ResponseResult selectClassByClassId(String classId);



    ResponseResult addSybidaAudition(SybidaAudition object);


    ResponseResult deleteStudentAudition (Integer deleteAuditionId);


    ResponseResult deleteAllStudentAudition(List<Integer> list);



    ResponseResult selectpageStudentAudition(int pageSize, int pageNum,int userid);

    ResponseResult updateSybidaAudition(SybidaAudition sybidaAudition);

}
