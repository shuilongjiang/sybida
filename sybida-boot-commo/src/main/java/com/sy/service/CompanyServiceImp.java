package com.sy.service;

import com.sy.MD5.MD5Utils;
import com.sy.redis.RedisOpsUtil;
import com.sy.register.DateUtil;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CompanyServiceImp implements CompanyService{
    @Autowired
    RedisOpsUtil redisOpsUtil;
    @Override
    public ResponseResult ecode(String userId) {
        ResponseResult responseResult=new ResponseResult();
        Date date=new Date();
        String key= MD5Utils.encrypt(date.toString()+userId);
        System.out.println(date.toString()+userId);
        redisOpsUtil.set(""+key, DateUtil.date2String(new Date()),60*24*7);
        System.out.println(key);
        responseResult.setCode(1);
        responseResult.setMessage(key);
        return responseResult;
    }
}
