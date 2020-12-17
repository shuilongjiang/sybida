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
    @Transactional
    @Override
    public ResponseResult insertSelective(RegisterExcel record, PartStudent partStudent) {
        SybidaUser sybidaUser=new SybidaUser();
        System.out.println(record.getName()+"++++++++++++++++++=====");
        sybidaUser.setUserName(record.getName());
        sybidaUser.setUserPassword("123456");
        sybidaUser.setUserPhone(record.getPhone());
        sybidaUser.setUserNote(1);
        sybidaUser.setUserAuthority((byte)2);
        sybidaUser.setUserAlterTime(new Date());
        int affecedRows=sybidaUserMapper.insertSelective(sybidaUser);

            SybidaStudent sybidaStudent=new SybidaStudent();
            sybidaStudent.setStudentId(sybidaUser.getUserId());
            sybidaStudent.setStudentName(sybidaUser.getUserName());
            sybidaStudent.setStudentPhone(sybidaUser.getUserPhone());
            sybidaStudent.setStudentClassId(Integer.valueOf(partStudent.getSelectClass()));
            sybidaStudent.setStudentStudyId(Integer.valueOf(partStudent.getSelectStudy()));
            sybidaStudent.setStudentNull1("B");
         int row= sybidaStudentMapper.insertSelective(sybidaStudent);

         SybidaClass sybidaClass=new SybidaClass();

//         sybidaClassMapper.updateByPrimaryKeySelective();



        return null;
    }
}
