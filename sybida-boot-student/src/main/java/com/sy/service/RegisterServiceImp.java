package com.sy.service;

import com.sy.mapper.*;
import com.sy.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class RegisterServiceImp implements RegisterService {
    @Autowired
    SybidaUserMapper sybidaUserMapper;
    @Autowired
    SybidaStudentMapper sybidaStudentMapper;
    @Autowired
    SybidaTeachMapper sybidaTeachMapper;
    @Autowired
    SybidaClassMapper sybidaClassMapper;

    @Override
    public int insertSelective(SybidaUser record, PartStudent partStudent) {
        SybidaUser sybidaUser=new SybidaUser();
        System.out.println(record.getUserName()+"fjosjfsdajfoiajdso");
        sybidaUser.setUserName(record.getUserName());
        sybidaUser.setUserPassword(record.getUserPassword());
        sybidaUser.setUserPhone(record.getUserPhone());
        sybidaUser.setUserNote(record.getUserNote());
        sybidaUser.setUserAuthority((byte)record.getUserAuthority());
        sybidaUser.setUserAlterTime(new Date());
        int affecedRows=sybidaUserMapper.insertSelective(sybidaUser);

        if (record.getUserAuthority() == 2) {
            SybidaStudent sybidaStudent=new SybidaStudent();
            sybidaStudent.setStudentId(sybidaUser.getUserId());
            sybidaStudent.setStudentName(sybidaUser.getUserName());
            sybidaStudent.setStudentPhone(sybidaUser.getUserPhone());
            sybidaStudent.setStudentClassId(Integer.valueOf(partStudent.getSelectClass()));
            sybidaStudent.setStudentStudyId(Integer.valueOf(partStudent.getSelectStudy()));
            sybidaStudentMapper.insertSelective(sybidaStudent);


        }else {

            SybidaTeach sybidaTeach=new SybidaTeach();
            sybidaTeach.setTeachId(sybidaUser.getUserId());
            sybidaTeach.setTeachName(sybidaUser.getUserName());
            sybidaTeach.setTeachTel(sybidaUser.getUserPhone());
            sybidaTeachMapper.insertSelective(sybidaTeach);



            if (record.getUserAuthority() == 0) {
                SybidaClass sybidaClass=new SybidaClass();
                sybidaClass.setClassManagerId(sybidaUser.getUserId());
                sybidaClass.setClassTeachId(Integer.valueOf(partStudent.getSelectTeacher()));
                sybidaClass.setClassStudyId(Integer.valueOf(partStudent.getSelectStudy()));
                sybidaClass.setClassAlterTime(new Date());
                sybidaClassMapper.insertSelective(sybidaClass);

            }
        }


            return 1;
        }

    @Override
    public List<SybidaClass> selectByExample(SybidaClassExample example) {
        List<SybidaClass> lists=sybidaClassMapper.selectByExample(null);
        return null;
    }
}


