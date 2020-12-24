package com.sy.service;


import com.sy.pojo.SybidaJob;
import com.sy.pojo.SybidaOffer;
import com.sy.vo.ResponseResult;


public interface JobSerivce {


    ResponseResult addSybidaJob(SybidaJob sybidaJob);
    ResponseResult selectSybidaJobByStudentId(Integer jobStudentId);
    ResponseResult selectstudentJobbyJobStudentId(Integer jobStudentId);
    ResponseResult updateSybidaJob(SybidaJob sybidaJob);


}
