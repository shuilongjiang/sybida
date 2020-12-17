package com.sy.service;

import com.sy.mapper.*;
import com.sy.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class StudentUploadVitaeServiceImp implements StudentUploadVitaeService {
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
        SybidaVitaeExample sybidaVitaeExample=new SybidaVitaeExample();
        SybidaVitaeExample.Criteria criteria = sybidaVitaeExample.createCriteria();
        criteria.andVitaeStudentIdEqualTo(Integer.valueOf(userId));
        SybidaVitae sybidaVitae1=new SybidaVitae();
        sybidaVitae1.setVitaeIsNew(0);
        sybidaVitaeMapper.updateByExampleSelective(sybidaVitae1,sybidaVitaeExample);
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
        sybidaNewsMapper.insertSelective(sybidaNews);

        sybidaReceive.setReceiveId(sybidaNews.getNewsId());
        sybidaReceive.setReceiveUserId(sybidaClass.getClassTeachId());
        sybidaReceive.setReceiveAlterTime(date);
        sybidaReceive.setReceiveIsRead((byte) 0);
        sybidaReceiveMapper.insertSelective(sybidaReceive);

        SybidaVitae sybidaVitae=new SybidaVitae();
        sybidaVitae.setVitaeAlterTime(date);
        sybidaVitae.setVitaeStudentId(Integer.valueOf(userId));
        sybidaVitae.setVitaeStudyId(Integer.valueOf(studyId));
        sybidaVitae.setVitaeIsNew(1);
        sybidaVitae.setVitaeUrl(filename);
        sybidaVitae.setVitaeIsRead((byte) 0);
        sybidaVitaeMapper.insert(sybidaVitae);
        return 1;
    }
}
