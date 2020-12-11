package com.sy.service;

import com.sy.mapper.SybidaReceiveMapper;
import com.sy.mapper.SybidaUserMapper;
import com.sy.pojo.*;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
@CacheConfig(cacheNames = "userinfo")
@Service
public class UserInfoServiceImp implements UserInfoService{
    @Autowired
    SybidaUserMapper sybidaUserMapper;
    @Autowired
    SybidaReceiveMapper sybidaReceiveMapper;
    @Cacheable(key="#p0")
    @Override
    public ResponseResult userInfoStu(Integer userid) {
        StudentInfo studentInfo= sybidaUserMapper.selectStuInfo(userid);
        int num = sybidaReceiveMapper.selectNumUnreadMessage(userid);
        studentInfo.setMessageNum(num);
        ResponseResult responseResult=new ResponseResult();
        responseResult.setCode(1);
        responseResult.setData(studentInfo);
        return responseResult;
    }
    @Cacheable(key="#p0")
    @Override
    public ResponseResult userInfoTeach(Integer userid) {
        TeacherInfo teacherInfo= sybidaUserMapper.selectTeacheInfo(userid);
        int num = sybidaReceiveMapper.selectNumUnreadMessage(userid);
        teacherInfo.setMessageNum(num);
        ResponseResult responseResult=new ResponseResult();
        responseResult.setCode(1);
        responseResult.setData(teacherInfo);
        return responseResult;
    }
}
