package com.sy.service;


import com.sy.vo.ResponseResult;


public interface AuditionSerivce {

//    ResponseResult selectPage(int pageSize, int pageNum, String studentStudy);
    ResponseResult selectPage(int pageSize, int pageNum, String classNum,int userid);


    ResponseResult selectClass(String userId);

    ResponseResult selectstudentInterviewbyauditionId(int auditionId);

}
