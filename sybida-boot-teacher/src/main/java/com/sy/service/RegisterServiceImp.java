package com.sy.service;

import com.sy.mapper.*;
import com.sy.pojo.*;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
@Service
public class RegisterServiceImp implements RegisterService {
    @Autowired
    SybidaClassMapper sybidaClassMapper;
    @Autowired
    SybidaStudyMapper sybidaStudyMapper;
    @Autowired
    SybidaTeachMapper sybidaTeachMapper;
    @Autowired
    SybidaUserMapper sybidaUserMapper;
    @Autowired
    SybidaStudentMapper sybidaStudentMapper;
    @Transactional
    @Override
    public List<SybidaClass> selectClass() {
        List<SybidaClass> listClass=sybidaClassMapper.selectByExample(null);
        return listClass;
    }
    @Transactional
    @Override
    public List<SybidaStudy> selectStudy() {
        List<SybidaStudy> listStudy=sybidaStudyMapper.selectByExample(null);
        return listStudy;
    }
    @Transactional
    @Override
    public List<SybidaTeach> selectTeacher() {
        List<SybidaTeach> listTeacher=sybidaTeachMapper.selectByExample(null);
        return listTeacher;
    }
    @Transactional(rollbackFor=Exception.class)//让checked例外也回滚：在整个方法前加上
    @Override
    public int insertSelective(RegisterExcel record, PartStudent partStudent) {
        ResponseResult responseResult = new ResponseResult();
        String phone = record.getPhone().replace(",","");
        SybidaUserExample sybidaUserExample=new SybidaUserExample();
        SybidaUserExample.Criteria criteria = sybidaUserExample.createCriteria();
        criteria.andUserNameEqualTo(record.getName());
        criteria.andUserPhoneEqualTo(record.getPhone());
        List<SybidaUser> listUser=sybidaUserMapper.selectByExample(sybidaUserExample);
       if (listUser.size()>0) {
           SybidaUser sybidaUser = new SybidaUser();
           sybidaUser.setUserName(record.getName());
           sybidaUser.setUserPassword("123456");
           sybidaUser.setUserPhone(phone);
           sybidaUser.setUserNote(1);
           sybidaUser.setUserAuthority((byte) 2);
           sybidaUser.setUserAlterTime(new Date());
           int row1 = sybidaUserMapper.insertSelective(sybidaUser);

           SybidaStudent sybidaStudent = new SybidaStudent();
           sybidaStudent.setStudentId(sybidaUser.getUserId());
           sybidaStudent.setStudentName(sybidaUser.getUserName());
           sybidaStudent.setStudentPhone(sybidaUser.getUserPhone());
           sybidaStudent.setStudentClassId(Integer.valueOf(partStudent.getSelectClass()));
           sybidaStudent.setStudentStudyId(Integer.valueOf(partStudent.getSelectStudy()));
           sybidaStudent.setStudentNull1("B");
           int row2 = sybidaStudentMapper.insertSelective(sybidaStudent);
           if (row1 > 0 && row2 > 0) {
               return 1;
           } else {

               return 0;
           }
       }
       return 0;
    }

    @Override
    public int updateClass(PartStudent partStudent) {
        SybidaClass sybidaClass = new SybidaClass();
        sybidaClass.setClassId(Integer.valueOf(partStudent.getSelectClass()));
        sybidaClass.setClassTeachId(Integer.valueOf(partStudent.getSelectTeacher()));
        sybidaClass.setClassStudyId(Integer.valueOf(partStudent.getSelectStudy()));
        int row3 = sybidaClassMapper.updateByPrimaryKeySelective(sybidaClass);
        if (row3>0){
            return 1;
        }
      return 0;
    }
}
