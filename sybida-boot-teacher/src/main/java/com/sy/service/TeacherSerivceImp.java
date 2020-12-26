package com.sy.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.dto.StudentJobForTeacher;
import com.sy.dto.VitaeLevelForTeacher;
import com.sy.mapper.*;
import com.sy.pojo.*;
import com.sy.redis.RedisOpsUtil;
import com.sy.register.DateUtil;
import com.sy.vo.ResponseResult;
import org.apache.jasper.tagplugins.jstl.core.If;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TeacherSerivceImp implements TeacherSerivce {
    @Autowired
    SybidaTeachMapper sybidaTeachMapper;
    @Autowired
    SybidaStudyMapper sybidaStudyMapper;
    @Autowired
    RedisOpsUtil redisOpsUtil;
    @Autowired
    SybidaVitaeEvaluateMapper sybidaVitaeEvaluateMapper;
    @Autowired
    SybidaVitaeMapper sybidaVitaeMapper;
    @Autowired
    SybidaJobMapper sybidaJobMapper;
    @Autowired
    SybidaStudentMapper sybidaStudentMapper;
    @Autowired
    SybidaStudent sybidaStudent;
    @Autowired
    SybidaTeach sybidaTeach;
    @Autowired
    SybidaNewsMapper sybidaNewsMapper;
    @Autowired
    SybidaReceiveMapper sybidaReceiveMapper;

    @Transactional
    @Override
    public ResponseResult selectPage(int pageSize, int pageNum, String teacherStudy1) {
        ResponseResult responseResult = new ResponseResult();


        List<SybidaTeach> list;
        PageHelper.startPage(pageNum, pageSize);
        if ("-1".equals(teacherStudy1)) {
            SybidaTeachExample sybidaTeachExample = new SybidaTeachExample();
            SybidaTeachExample.Criteria criteria = sybidaTeachExample.createCriteria();
            criteria.andTeachNull1EqualTo("1");
            list = sybidaTeachMapper.selectByExample(sybidaTeachExample);
        } else {
            SybidaTeachExample sybidaTeachExample = new SybidaTeachExample();
            SybidaTeachExample.Criteria criteria = sybidaTeachExample.createCriteria();
            criteria.andTeachStudyIdEqualTo(Integer.valueOf(teacherStudy1)).andTeachNull1EqualTo("1");
            list = sybidaTeachMapper.selectByExample(sybidaTeachExample);
        }
        PageInfo<SybidaTeach> pageInfo = new PageInfo<>(list);
        for (int i = 0; i < list.size(); i++) {
            Integer id = list.get(i).getTeachStudyId();
            SybidaStudy s = sybidaStudyMapper.selectByPrimaryKey(id);
            list.get(i).setTeachNull2(s.getStudyAspect());
        }
        responseResult.setData(pageInfo);
        responseResult.setCode(1);
        responseResult.setMessage("查询成功！");
        return responseResult;
    }


    @Transactional
    @Override
    public ResponseResult selectStudy() {
        ResponseResult responseResult = new ResponseResult();
        List<SybidaStudy> list = sybidaStudyMapper.selectByExample(null);
        if (null != list && list.size() > 0) {
            responseResult.setCode(1);
        } else {
            responseResult.setCode(0);
        }
        List<SybidaStudy> list1 = new ArrayList<>();
        list1.add(list.get(0));
        list1.add(list.get(1));
        list1.add(list.get(2));
        list1.add(list.get(3));
        responseResult.setData(list1);
        return responseResult;
    }

    @Autowired
    SybidaUserMapper sybidaUserMapper;

    @Transactional
    @Override
    public ResponseResult deleteTeacher(Integer deleteTeacher) {
        sybidaUserMapper.deleteByPrimaryKey(deleteTeacher);
        SybidaTeach sybidaTeach = new SybidaTeach();
        sybidaTeach.setTeachId(deleteTeacher);
        sybidaTeach.setTeachNull1("0");
        sybidaTeach.setTeachAlterTime(new Date());
        int row = sybidaTeachMapper.updateByPrimaryKeySelective(sybidaTeach);
        ResponseResult responseResult = new ResponseResult();
        if (row > 0) {
            responseResult.setCode(1);
        } else {
            responseResult.setCode(0);

        }
        return responseResult;
    }

    @Transactional
    @Override
    public ResponseResult deleteAllTeacher(List<Integer> list) {
        int row = 0;
        for (int i = 0; i < list.size(); i++) {
            sybidaUserMapper.deleteByPrimaryKey(list.get(i));
            SybidaTeach sybidaTeach = new SybidaTeach();
            sybidaTeach.setTeachId(list.get(i));
            sybidaTeach.setTeachNull1("0");
            row += sybidaTeachMapper.updateByPrimaryKeySelective(sybidaTeach);
        }
        ResponseResult responseResult = new ResponseResult();
        if (row == list.size()) {
            responseResult.setCode(1);
        } else {
            responseResult.setCode(0);
        }
        return responseResult;
    }

    @Transactional
    @Override
    public ResponseResult selectAllVitae(int pageSize, int pageNum) {

        ResponseResult responseResult = new ResponseResult();
        PageHelper.startPage(pageNum, pageSize);

        List<VitaeLevelForTeacher> list = sybidaVitaeMapper.selectAllVitaeForTeacher();
//        List<SybidaVitae> list = sybidaVitaeMapper.selectByExample(null);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        PageInfo<VitaeLevelForTeacher> PageInfo = new PageInfo<>(list);
        responseResult.setCode(1);
        responseResult.setMessage("查询成功");
        responseResult.setData(PageInfo);
        return responseResult;

    }


    @Autowired
    SybidaStudy sybidaStudy;

    @Override
    public ResponseResult selectStudentJob(int pageSize, int pageNum) {
        ResponseResult responseResult = new ResponseResult();
        PageHelper.startPage(pageNum, pageSize);

        List<StudentJobForTeacher> list = sybidaJobMapper.selectStudentJob();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        PageInfo<StudentJobForTeacher> PageInfo = new PageInfo<>(list);
        responseResult.setCode(1);
        responseResult.setMessage("查询成功");
        responseResult.setData(PageInfo);
        return responseResult;
    }


    @Override
    public ResponseResult selectJobByStuId(int id) {
        ResponseResult responseResult = new ResponseResult();
        StudentJobForTeacher studentJobForTeacher = sybidaJobMapper.selectJobById(id);
        System.out.println(studentJobForTeacher);
        if (studentJobForTeacher == null) {
            responseResult.setCode(0);
        } else {
            responseResult.setCode(1);
            responseResult.setData(studentJobForTeacher);
        }
        return responseResult;
    }

    @Override
    public ResponseResult selcetAllStudent(int pageSize, int pageNum) {
        ResponseResult responseResult = new ResponseResult();
        PageHelper.startPage(pageNum, pageSize);
        List<SybidaStudent> list = sybidaStudentMapper.selectByExample(null);
        PageInfo<SybidaStudent> PageInfo = new PageInfo<>(list);
        responseResult.setCode(1);
        responseResult.setMessage("成功");
        responseResult.setData(PageInfo);
        return responseResult;
    }

    @Override
    public ResponseResult selcetStudentById(int id) {
        ResponseResult responseResult = new ResponseResult();
        SybidaStudent sybidaStudent = sybidaStudentMapper.selectByPrimaryKey(id);
        System.out.println(sybidaStudent);
        if (sybidaStudent == null) {
            responseResult.setCode(0);
            responseResult.setMessage("error");
        } else {
            responseResult.setData(sybidaStudent);
            responseResult.setCode(1);
            responseResult.setMessage("成功");
        }
        return responseResult;
    }

    @Transactional
    @Override
    public ResponseResult updateInfoStudent(SybidaStudent object) {
        ResponseResult responseResult = new ResponseResult();
//        SybidaStudent sybidaStudent = new SybidaStudent();

        int affectedRows = sybidaStudentMapper.updateStudentInfo(object);
        if (affectedRows > 0) {
            responseResult.setCode(1);
            responseResult.setMessage("成功！");

        } else {
            responseResult.setCode(0);
            responseResult.setMessage("失败!");
        }

        System.out.println(object);
        return responseResult;
    }

    @Override
    public ResponseResult selectTeacherById(int userid) {
        ResponseResult responseResult = new ResponseResult();
        SybidaTeach sybidaTeach = sybidaTeachMapper.selectByPrimaryKey(userid);
        System.out.println(sybidaTeach);
        if (sybidaTeach == null) {
            responseResult.setCode(0);
            responseResult.setMessage("失败");
        } else {
            responseResult.setCode(1);
            responseResult.setData(sybidaTeach);
            responseResult.setMessage("成功");
        }
        return responseResult;
    }

    @Override
    public ResponseResult updateTeacherInfo(SybidaTeach object) {
        ResponseResult responseResult = new ResponseResult();
        int affectedRows = sybidaTeachMapper.updateTeacherInfo(object);
        if (affectedRows > 0) {
            responseResult.setMessage("成功");
            responseResult.setCode(1);
        }
        {
            responseResult.setCode(0);
        }

        return responseResult;
    }

    @Override
    public ResponseResult insertVitaeEvaluateLevel(SybidaVitaeEvaluate sybidaVitaeEvaluate) {
        ResponseResult responseResult = new ResponseResult();
        int affectedRows = sybidaVitaeEvaluateMapper.insert(sybidaVitaeEvaluate);
        if (affectedRows > 0) {
            responseResult.setCode(1);
            responseResult.setMessage("成功！");
            SybidaNews sybidaNews = new SybidaNews();
            sybidaNews.setNewsUserId(sybidaVitaeEvaluate.getVitaeEvaluateUserId());
            SybidaTeach sybidaTeach=sybidaTeachMapper.selectByPrimaryKey(sybidaVitaeEvaluate.getVitaeEvaluateUserId());
            SybidaVitae vitae= sybidaVitaeMapper.selectByPrimaryKey(sybidaVitaeEvaluate.getVitaeEvaluateId());
            SybidaStudent student=sybidaStudentMapper.selectByPrimaryKey(vitae.getVitaeStudentId());
            Date date = new Date();
            String time = DateUtil.date2String(date,"yyyy年MM月dd日HH时mm分ss秒");
            String news = "教师"+sybidaTeach.getTeachName()+",在"+time+"评价了"+student.getStudentName()+"的简历";
            sybidaNews.setNewsTest(news);
            sybidaNews.setNewsSendTime(date);
            sybidaNews.setNewsAlterTime(date);
            sybidaNews.setNewsNull1("1");
            int affected = sybidaNewsMapper.insert(sybidaNews);
             if(affected == 0){
                 System.out.println("发送到SybidaNews失败！");
            }else{
                 SybidaReceive sybidaReceive = new SybidaReceive();
                 sybidaReceive.setReceiveUserId(student.getStudentId());
                 sybidaReceive.setReceiveNull1("1");
                 sybidaReceive.setReceiveAlterTime(date);
                 sybidaReceive.setReceiveIsRead((byte) 0);
                 int receiveId = sybidaNews.getNewsId();
                 sybidaReceive.setReceiveId(receiveId);
                 sybidaReceiveMapper.insertSelective(sybidaReceive);
             }
        } else {
            responseResult.setCode(0);
            responseResult.setMessage("失败!");
        }
        return responseResult;
    }

    @Override
    public ResponseResult insertTeacher(SybidaUser sybidaUser) {
        ResponseResult responseResult = new ResponseResult();
        int affectedRows = sybidaUserMapper.insertTeacher(sybidaUser);
        if (affectedRows > 0) {
            responseResult.setCode(1);
            responseResult.setMessage("成功");
            responseResult.setData(sybidaUser);
        } else {
            responseResult.setCode(0);
            responseResult.setMessage("失败");
        }
        return responseResult;
    }

    @Override
    public ResponseResult insertTeachtwo(SybidaTeach sybidaTeach) {
        ResponseResult responseResult = new ResponseResult();
        int row = sybidaTeachMapper.insertSelective(sybidaTeach);
        if (row == 1) {
            responseResult.setCode(1);
            responseResult.setMessage("存入教师表成功");
            return responseResult;
        } else {
            responseResult.setCode(0);
            responseResult.setMessage("失败");
        }
        return responseResult;
    }

    @Override
    public List<SybidaStudent> selectStudentByClassId(String classId) {
        ResponseResult responseResult = new ResponseResult();
        SybidaStudentExample sybidaStudentExample = new SybidaStudentExample();
        SybidaStudentExample.Criteria criteria = sybidaStudentExample.createCriteria();
        criteria.andStudentClassIdEqualTo(Integer.valueOf(classId));
        return sybidaStudentMapper.selectByExample(sybidaStudentExample);
    }

    @Override
    public ResponseResult selectStudentByName(String name) {
        ResponseResult responseResult = new ResponseResult();
        List<SybidaStudent> list = sybidaStudentMapper.selectStudentByName(name);
        PageInfo<SybidaStudent> PageInfo = new PageInfo<>(list);
        responseResult.setCode(1);
        responseResult.setMessage("成功");
        responseResult.setData(PageInfo);
        return responseResult;
    }


}