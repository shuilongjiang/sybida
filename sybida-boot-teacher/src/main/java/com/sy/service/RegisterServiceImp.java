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
        System.out.println(record+"================");
        System.out.println(partStudent+"___________________------------");
        ResponseResult responseResult = new ResponseResult();
        String phone = record.getPhone().replace(",","");
        //查询班级中是否有重复的学生
        SybidaUserExample sybidaUserExample=new SybidaUserExample();
        SybidaUserExample.Criteria criteria = sybidaUserExample.createCriteria();
        criteria.andUserNameEqualTo(record.getName());
        criteria.andUserPhoneEqualTo(phone);
        List<SybidaUser> listUser=sybidaUserMapper.selectByExample(sybidaUserExample);
       if (listUser.size()==0) {
           //插入用户表将获取的信息
           SybidaUser sybidaUser = new SybidaUser();
           sybidaUser.setUserName(record.getName());
           sybidaUser.setUserPassword("123456");
           sybidaUser.setUserPhone(phone);
           sybidaUser.setUserNote(1);
           sybidaUser.setUserAuthority((byte) 2);
           sybidaUser.setUserAlterTime(new Date());
           int row1 = sybidaUserMapper.insertSelective(sybidaUser);
           //根据班级名获取 班级id 插入学生表中的  班级id
           SybidaClassExample sybidaClassExample=new SybidaClassExample();
           SybidaClassExample.Criteria criteria1 = sybidaClassExample.createCriteria();
           criteria1.andClassNumEqualTo(partStudent.getClassCreate());
           List<SybidaClass>listClass= sybidaClassMapper.selectByExample(sybidaClassExample);
            //插入学生表 用户id  用户姓名， 用户电话， 班级的id 学习方向等插入表
           SybidaStudent sybidaStudent = new SybidaStudent();
           sybidaStudent.setStudentId(sybidaUser.getUserId());
           sybidaStudent.setStudentName(sybidaUser.getUserName());
           sybidaStudent.setStudentPhone(sybidaUser.getUserPhone());
           sybidaStudent.setStudentClassId(Integer.valueOf(listClass.get(0).getClassId()));
           sybidaStudent.setStudentStudyId(Integer.valueOf(partStudent.getSelectStudy()));
           sybidaStudent.setStudentNull1("B");
           sybidaStudent.setStudentAlterTime(new Date());
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
    public int createClass(PartStudent partStudent) {
//        SybidaClassExample sybidaClassExample=new SybidaClassExample();
//        SybidaClassExample.Criteria criteria = sybidaClassExample.createCriteria();
//        criteria.andClassNumEqualTo()
//        sybidaClassMapper.selectByExample();

        SybidaClass sybidaClass = new SybidaClass();
        sybidaClass.setClassNum(partStudent.getClassCreate());
        sybidaClass.setClassTeachId(Integer.valueOf(partStudent.getSelectTeacher()));
        sybidaClass.setClassManagerId(Integer.valueOf(partStudent.getInsetManager()));
        sybidaClass.setClassStudyId(Integer.valueOf(partStudent.getSelectStudy()));
        sybidaClass.setClassAlterTime(new Date());
        int row3 = sybidaClassMapper.insertSelective(sybidaClass);
        if (row3>0){
            return 1;
        }
      return 0;
    }

    @Override
    public List<SybidaClass> selectClassName(String name) {
        SybidaClassExample sybidaClassExample=new SybidaClassExample();
        SybidaClassExample.Criteria criteria = sybidaClassExample.createCriteria();
        criteria.andClassNumEqualTo(name);
        List<SybidaClass> classList= sybidaClassMapper.selectByExample(sybidaClassExample);
        return classList;
    }
}
