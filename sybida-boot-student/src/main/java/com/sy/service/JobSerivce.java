package com.sy.service;


import com.sy.pojo.SybidaJob;
import com.sy.pojo.SybidaOffer;
import com.sy.vo.ResponseResult;

import java.util.List;


public interface JobSerivce {


    ResponseResult addSybidaJob(SybidaJob sybidaJob);
    ResponseResult selectSybidaJobByStudentId(Integer jobStudentId);
    ResponseResult selectstudentJobbyJobStudentId(Integer jobStudentId);
    ResponseResult updateSybidaJob(SybidaJob sybidaJob);
    ResponseResult selectPage(int pageSize, int pageNum, String classNum,int userid);

    ResponseResult deleteStudentJob (Integer deleteJobId);

    ResponseResult deleteAllStudentJob(List<Integer> list);

    ResponseResult selectstudentJobbyJobId(int jobId);


}
