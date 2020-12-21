package com.sy.service;


import com.sy.pojo.SybidaAudition;
import com.sy.vo.ResponseResult;


public interface AuditionSerivce {

    ResponseResult selectClass(String userId);



    //    ResponseResult selectPage(int pageSize, int pageNum, String studentStudy);
    ResponseResult selectPage(int pageSize, int pageNum, String classNum,int userid);




    ResponseResult selectstudentInterviewbyauditionId(int auditionId);



    ResponseResult selectAllClass();
    ResponseResult selectStudentById(String userId);
    ResponseResult selectClassByClassId(String classId);



    ResponseResult addSybidaAudition(SybidaAudition object);


}
