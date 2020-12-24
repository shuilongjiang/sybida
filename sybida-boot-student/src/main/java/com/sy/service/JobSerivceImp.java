package com.sy.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.dto.AuditionForTeacher;
import com.sy.dto.JobForTeacher;
import com.sy.dto.OfferForTeacher;
import com.sy.mapper.*;
import com.sy.pojo.*;
import com.sy.redis.RedisOpsUtil;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class JobSerivceImp implements JobSerivce {

    @Autowired
    SybidaJobMapper sybidaJobMapper;

    @Autowired
    RedisOpsUtil redisOpsUtil;

    @Autowired
    SybidaClassMapper sybidaClassMapper;

    @Autowired
    SybidaStudentMapper sybidaStudentMapper;


    @Override
    public ResponseResult addSybidaJob(SybidaJob sybidaJob) {
        ResponseResult responseResult = new ResponseResult();
        int affectedRows = sybidaJobMapper.insertSelective(sybidaJob);
        if (affectedRows > 0) {
            responseResult.setCode(1);
            responseResult.setMessage("成功！");
        } else {
            responseResult.setCode(0);
            responseResult.setMessage("失败!");
        }
        System.out.println(sybidaJob+"!!!!!!!!!+++++++++++");
        return responseResult;

    }

    @Transactional
    @Override
    public ResponseResult selectSybidaJobByStudentId(Integer jobStudentId) {
        SybidaJobExample sybidaJobExample = new SybidaJobExample();
        sybidaJobExample.createCriteria().andJobStudentIdEqualTo(jobStudentId);
        List<SybidaJob> sybidaJobList = sybidaJobMapper.selectByExample(sybidaJobExample);

        ResponseResult responseResult = new ResponseResult();
        if(null != sybidaJobList && sybidaJobList.size()>0){
            responseResult.setCode(0);
            responseResult.setMessage("登记表已填写");
        } else {
            responseResult.setMessage("登记表未填写");
        }
        return responseResult;
    }


    @Transactional
    @Override
    public ResponseResult selectstudentJobbyJobStudentId(Integer jobStudentId) {
        ResponseResult responseResult = new ResponseResult();
        JobForTeacher jobForTeacher = sybidaJobMapper.selectstudentJobbyJobStudentId(jobStudentId);
        System.out.println(jobForTeacher);
        responseResult.setData(jobForTeacher);
        responseResult.setCode(1);
        responseResult.setMessage("查询成功！");
        return responseResult;
    }

    @Transactional
    @Override
    public ResponseResult updateSybidaJob(SybidaJob sybidaJob) {
        ResponseResult responseResult = new ResponseResult();
        int affectedRows = sybidaJobMapper.updateByPrimaryKeySelective(sybidaJob);
        if (affectedRows > 0) {
            responseResult.setCode(1);
            responseResult.setMessage("成功！");
        } else {
            responseResult.setCode(0);
            responseResult.setMessage("失败!");
        }
        System.out.println(sybidaJob);
        return responseResult;
    }



    @Transactional
    @Override
    public ResponseResult selectPage(int pageSize, int pageNum, String classNum, int userid) {

        ResponseResult responseResult = new ResponseResult();
        List<SybidaStudent> studentList1 = new ArrayList<>();
        List<SybidaStudent> studentList2 = new ArrayList<>();
        List<Integer> studentIdList = new ArrayList<>();
        List<SybidaClass> classlist1 = new ArrayList<>();
        List<JobForTeacher> jobList1 = new ArrayList<>();
        List<JobForTeacher> jobList2 = new ArrayList<>();

        PageHelper.startPage(pageNum, pageSize);


        if ("-1".equals(classNum)) {
            System.out.println("======");
            SybidaClassExample sybidaClassExample = new SybidaClassExample();
            sybidaClassExample.createCriteria().andClassTeachIdEqualTo(Integer.valueOf(userid));
            classlist1 = sybidaClassMapper.selectByExample(sybidaClassExample);
            System.out.println(classlist1);
            if (null != classlist1 && classlist1.size() > 0) {
                responseResult.setCode(1);
            } else {
                responseResult.setCode(0);
                return responseResult;
            }


            for (int i = 0; i < classlist1.size(); i++) {
                SybidaStudentExample sybidaStudentExample = new SybidaStudentExample();
                sybidaStudentExample.createCriteria().andStudentClassIdEqualTo(classlist1.get(i).getClassId());
                studentList1 = sybidaStudentMapper.selectByExample(sybidaStudentExample);
                for (int j = 0; j < studentList1.size(); j++) {
                    studentList2.add(studentList1.get(j));
                }
            }


            for (int i = 0; i < studentList2.size(); i++) {
                jobList1 = sybidaJobMapper.selectJobByJobStudentIdForTeacher(studentList2.get(i).getStudentId());
                for (int j = 0; j < jobList1.size(); j++) {
                    jobList2.add(jobList1.get(j));
                }
            }



        }else{
            SybidaStudentExample sybidaStudentExample = new SybidaStudentExample();
            sybidaStudentExample.createCriteria().andStudentClassIdEqualTo(Integer.valueOf(classNum));
            studentList1 = sybidaStudentMapper.selectByExample(sybidaStudentExample);

            for (int i = 0; i < studentList1.size(); i++) {
                jobList1 = sybidaJobMapper.selectJobByJobStudentIdForTeacher(studentList1.get(i).getStudentId());
                for (int j = 0; j < jobList1.size(); j++) {
                    jobList2.add(jobList1.get(j));
                }
            }


        }


        //手动分页
        //创建Page类
        Page page = new Page(pageNum, pageSize);
//为Page类中的total属性赋值
        int total = jobList2.size();
        page.setTotal(total);
//计算当前需要显示的数据下标起始值
        int startIndex = (pageNum - 1) * pageSize;
        int endIndex = Math.min(startIndex + pageSize,total);
//从链表中截取需要显示的子链表，并加入到Page
        page.addAll(jobList2.subList(startIndex,endIndex));
//以Page创建PageInfo
        PageInfo pageInfo = new PageInfo<>(page);
//将数据传回前端
        responseResult.setData(pageInfo);
        responseResult.setCode(1);
        responseResult.setMessage("查询成功！");
        return responseResult;

    }




    //删除单选简历
    @Transactional
    @Override
    public ResponseResult deleteStudentJob(Integer deleteJobId) {

        SybidaJob sybidaJob = new SybidaJob();
        sybidaJob.setJobId(deleteJobId);
        sybidaJob.setJobNull1("0");
        sybidaJob.setJobAlterTime(new Date());
        int row = sybidaJobMapper.updateByPrimaryKeySelective(sybidaJob);
        ResponseResult responseResult = new ResponseResult();
        if (row > 0) {
            responseResult.setCode(1);
        } else {
            responseResult.setCode(0);

        }
        return responseResult;

    }



    //删除多选简历
    @Transactional
    @Override
    public ResponseResult deleteAllStudentJob(List<Integer> list) {
        int row = 0;
        for (int i = 0; i < list.size(); i++) {
            SybidaJob sybidaJob = new SybidaJob();
            sybidaJob.setJobId(list.get(i));
            sybidaJob.setJobNull1("0");
            sybidaJob.setJobAlterTime(new Date());
            row +=sybidaJobMapper.updateByPrimaryKeySelective(sybidaJob);
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
    public ResponseResult selectstudentJobbyJobId(int jobId) {
        ResponseResult responseResult = new ResponseResult();
        JobForTeacher jobForTeacher = sybidaJobMapper.selectstudentJobbyJobId(jobId);
        responseResult.setData(jobForTeacher);
        responseResult.setCode(1);
        responseResult.setMessage("查询成功！");
        System.out.println(responseResult+"====================");
        System.out.println(responseResult.getData().toString());
        return responseResult;
    }



}
