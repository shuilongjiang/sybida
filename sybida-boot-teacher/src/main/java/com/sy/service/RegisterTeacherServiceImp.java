package com.sy.service;

import com.sy.mapper.SybidaTeachMapper;
import com.sy.mapper.SybidaUserMapper;
import com.sy.pojo.SybidaTeach;
import com.sy.pojo.SybidaUser;
import com.sy.pojo.SybidaUserExample;
import com.sy.vo.ResponseResult;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class RegisterTeacherServiceImp implements RegisterTeacherService{
    @Autowired
    SybidaUserMapper sybidaUserMapper;
    @Override
    public ResponseResult redistTeacherCheckPhone(String phone) {
        ResponseResult responseResult=new ResponseResult();
        SybidaUserExample exampl=new SybidaUserExample();
        exampl.createCriteria().andUserPhoneEqualTo(phone);
        List<SybidaUser> list=sybidaUserMapper.selectByExample(exampl);
        if(null!=list&&list.size()!=0){
            responseResult.setCode(1);
            responseResult.setMessage("号码已存在");
        }else{
            responseResult.setCode(0);
            responseResult.setMessage("号码已不存在");

        }
        return responseResult;
    }
   @Autowired
    SybidaTeachMapper sybidaTeachMapper;
    @Transactional
    @Override
    public ResponseResult insertTeacher(String phone, String name, Byte studyId) {
        ResponseResult responseResult=new ResponseResult();
        Date date=new Date();
        SybidaUser sybidaUser=new SybidaUser();
        sybidaUser.setUserName(name);
        sybidaUser.setUserPassword("123456");
        sybidaUser.setUserNote(1);
        sybidaUser.setUserPhone(phone);
        sybidaUser.setUserAlterTime(date);
        sybidaUser.setUserAuthority(studyId);
        int rowUser=sybidaUserMapper.insertSelective(sybidaUser);
        SybidaTeach sybidaTeach=new SybidaTeach();
        sybidaTeach.setTeachId(sybidaUser.getUserId());
        sybidaTeach.setTeachName(name);
        sybidaTeach.setTeachNull1("1");
        sybidaTeach.setTeachStudyId(Integer.valueOf(studyId)+1);
        sybidaTeach.setTeachPhoto("defaultpicture4.jpg");
        sybidaTeach.setTeachAlterTime(new Date());
        sybidaTeach.setTeachTel(phone);
        int rowTeacher=sybidaTeachMapper.insertSelective(sybidaTeach);
        if(rowUser>0&&rowTeacher>0){
            responseResult.setCode(1);
        }else {
            responseResult.setCode(0);
        }
        return responseResult;
    }
}
