package com.sy.service;

import com.sy.mapper.*;
import com.sy.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.crypto.Data;
import java.util.Date;

@Service
public class StudentUploadVitaeImp implements StudentUploadVitae{
    @Autowired
    SybidaStudentMapper sybidaStudentMapper;
    @Autowired
    SybidaClassMapper sybidaClassMapper;
    @Autowired
    SybidaClass sybidaClass;
    @Autowired
    SybidaStudent sybidaStudent;
    @Autowired
    SybidaNewsMapper sybidaNewsMapper;
    @Autowired
    SybidaReceiveMapper sybidaReceiveMapper;
    @Autowired
    SybidaVitaeMapper sybidaVitaeMapper;
    @Transactional
    @Override
    public Integer UploadVitae(String userId, String studyId,String filename) {
        sybidaStudent=sybidaStudentMapper.selectByPrimaryKey(Integer.valueOf(userId));
        sybidaClass=sybidaClassMapper.selectByPrimaryKey(sybidaStudent.getStudentClassId());
        SybidaNews sybidaNews=new SybidaNews();
        sybidaNews.setNewsUserId(Integer.valueOf(userId));
        Date date=new Date();
        String news="学生--"+sybidaStudent.getStudentName()+",--在"+date+"上传了一份简历请及时查看！";
        sybidaNews.setNewsTest(news);
        sybidaNews.setNewsSendTime(date);
        sybidaNews.setNewsAlterTime(date);
        sybidaNews.setNewsReadPeople(0);
        SybidaReceive sybidaReceive=new SybidaReceive();
        sybidaReceive.setReceiveId(sybidaNews.getNewsId());
        sybidaReceive.setReceiveUserId(sybidaClass.getClassTeachId());
        sybidaReceive.setReceiveAlterTime(date);
        sybidaReceive.setReceiveIsRead((byte) 0);
        sybidaReceiveMapper.insertSelective(sybidaReceive);
        sybidaNewsMapper.insertSelective(sybidaNews);
        SybidaVitae sybidaVitae=new SybidaVitae();
        sybidaVitae.setVitaeAlterTime(date);
        sybidaVitae.setVitaeStudentId(Integer.valueOf(userId));
//        sybidaVitaeMapper.insert()
        return 0;
    }
}
