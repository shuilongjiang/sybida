package com.sy.service;


import com.sy.mapper.SybidaStudentMapper;
import com.sy.pojo.SybidaStudent;
import com.sy.redis.RedisOpsUtil;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentSerivceImp implements StudentSerivce {

    @Autowired
    SybidaStudentMapper sybidaStudentMapper;

    @Autowired
    RedisOpsUtil redisOpsUtil;


    @Override
    public ResponseResult selectstudentbyid(int userId) {
        ResponseResult responseResult = new ResponseResult();
        SybidaStudent sybidaStudent = sybidaStudentMapper.selectByPrimaryKey(userId);
        System.out.println(sybidaStudent+"******");
        if (sybidaStudent==null){
            responseResult.setCode(0);
            responseResult.setMessage("查询失败");
        }else {
            responseResult.setData(sybidaStudent);
            responseResult.setCode(1);
            responseResult.setMessage("查询成功");
        }
        return responseResult;
    }
}
