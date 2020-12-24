package com.sy.service;

import com.sy.MD5.MD5Utils;
import com.sy.mapper.SybidaCompanyMarkMapper;
import com.sy.pojo.SybidaCompanyMark;
import com.sy.redis.RedisOpsUtil;
import com.sy.register.DateUtil;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class CompanyServiceImp implements CompanyService{
    @Autowired
    RedisOpsUtil redisOpsUtil;
    @Autowired
    SybidaCompanyMarkMapper sybidaCompanyMarkMapper;
    @Override
    public ResponseResult ecode(String userId) {
        ResponseResult responseResult=new ResponseResult();
        SybidaCompanyMark sybidaCompanyMark=new SybidaCompanyMark();
        sybidaCompanyMark.setMarkAlterDate(new Date());
        sybidaCompanyMark.setMarkTeacherId(userId);
        String tCode=UUID.randomUUID().toString();
        sybidaCompanyMark.setMarkErcodeId(tCode);
        int row=sybidaCompanyMarkMapper.insertSelective(sybidaCompanyMark);
        if(row>0){
            responseResult.setCode(1);
        }else{
            responseResult.setCode(0);
        }
        responseResult.setMessage(String.valueOf(sybidaCompanyMark.getMarkId()));
        return responseResult;
    }
}
