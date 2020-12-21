package com.sy.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.dto.AuditionForTeacher;
import com.sy.mapper.*;
import com.sy.pojo.*;
import com.sy.redis.RedisOpsUtil;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobSerivceImp implements JobSerivce {

    @Autowired
    SybidaJobMapper sybidaJobMapper;

    @Autowired
    RedisOpsUtil redisOpsUtil;


    @Override
    public ResponseResult addSybidaJob(SybidaJob sybidaJob) {
        ResponseResult responseResult = new ResponseResult();
        int affectedRows = sybidaJobMapper.insertSelective(sybidaJob);
        if (affectedRows > 0) {
            responseResult.setCode(1);
            responseResult.setMessage("成功！");
        } else {
            responseResult.setCode(0);
            responseResult.setMessage("失败!");
        }
        System.out.println(sybidaJob+"!!!!!!!!!+++++++++++");
        return responseResult;

    }



}
