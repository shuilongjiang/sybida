package com.sy.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.dto.AuditionForTeacher;
import com.sy.dto.JobForTeacher;
import com.sy.dto.OfferForTeacher;
import com.sy.mapper.*;
import com.sy.pojo.*;
import com.sy.redis.RedisOpsUtil;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional
    @Override
    public ResponseResult selectSybidaJobByStudentId(Integer jobStudentId) {
        SybidaJobExample sybidaJobExample = new SybidaJobExample();
        sybidaJobExample.createCriteria().andJobStudentIdEqualTo(jobStudentId);
        List<SybidaJob> sybidaJobList = sybidaJobMapper.selectByExample(sybidaJobExample);

        ResponseResult responseResult = new ResponseResult();
        if(null != sybidaJobList && sybidaJobList.size()>0){
            responseResult.setCode(0);
            responseResult.setMessage("登记表已填写");
        } else {
            responseResult.setMessage("登记表未填写");
        }
        return responseResult;
    }


    @Transactional
    @Override
    public ResponseResult selectstudentJobbyJobStudentId(Integer jobStudentId) {
        ResponseResult responseResult = new ResponseResult();
        JobForTeacher jobForTeacher = sybidaJobMapper.selectstudentJobbyJobStudentId(jobStudentId);
        System.out.println(jobForTeacher);
        responseResult.setData(jobForTeacher);
        responseResult.setCode(1);
        responseResult.setMessage("查询成功！");
        return responseResult;
    }

    @Transactional
    @Override
    public ResponseResult updateSybidaJob(SybidaJob sybidaJob) {
        ResponseResult responseResult = new ResponseResult();
        int affectedRows = sybidaJobMapper.updateByPrimaryKeySelective(sybidaJob);
        if (affectedRows > 0) {
            responseResult.setCode(1);
            responseResult.setMessage("成功！");
        } else {
            responseResult.setCode(0);
            responseResult.setMessage("失败!");
        }
        System.out.println(sybidaJob);
        return responseResult;
    }


}
