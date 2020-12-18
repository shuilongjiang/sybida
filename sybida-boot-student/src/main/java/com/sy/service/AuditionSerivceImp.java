package com.sy.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.dto.AuditionForTeacher;
import com.sy.mapper.*;
import com.sy.pojo.*;
import com.sy.redis.RedisOpsUtil;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuditionSerivceImp implements AuditionSerivce {
    @Autowired
    SybidaAuditionMapper sybidaAuditionMapper;
    @Autowired
    SybidaStudyMapper sybidaStudyMapper;
    @Autowired
    RedisOpsUtil redisOpsUtil;

    @Autowired
    SybidaClassMapper sybidaClassMapper;

    @Autowired
    SybidaStudentMapper sybidaStudentMapper;


    @Override
    public ResponseResult selectClass(String userId) {
        ResponseResult responseResult = new ResponseResult();
        SybidaClassExample sybidaClassExample = new SybidaClassExample();
        sybidaClassExample.createCriteria().andClassTeachIdEqualTo(Integer.valueOf(userId));
        List<SybidaClass> list = sybidaClassMapper.selectByExample(sybidaClassExample);
        if (null != list && list.size() > 0) {
            responseResult.setCode(1);
        } else {
            responseResult.setCode(0);
        }

        List<SybidaClass> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list1.add(list.get(i));
        }
        responseResult.setData(list1);
        return responseResult;
    }



    @Override
    public ResponseResult selectPage(int pageSize, int pageNum, String classNum, int userid) {

        ResponseResult responseResult = new ResponseResult();
        System.out.println("++++++++++");
        List<SybidaStudent> studentList1 = new ArrayList<>();
        List<SybidaStudent> studentList2 = new ArrayList<>();
        List<Integer> studentIdList = new ArrayList<>();
        List<SybidaClass> classlist1 = new ArrayList<>();
        List<AuditionForTeacher> auditionList1 = new ArrayList<>();
        List<AuditionForTeacher> auditionList2 = new ArrayList<>();

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
//                SybidaAuditionExample sybidaAuditionExample = new SybidaAuditionExample();
//                sybidaAuditionExample.createCriteria().andAuditionStudentIdEqualTo( studentList2.get(i).getStudentId());
//                auditionList1 = sybidaAuditionMapper.selectByExample(sybidaAuditionExample);

                auditionList1 = sybidaAuditionMapper.selectAuditionByauditionStudentIdForTeacher(studentList2.get(i).getStudentId());
                for (int j = 0; j < auditionList1.size(); j++) {
                    auditionList2.add(auditionList1.get(j));
                }
            }



        }else{
            SybidaStudentExample sybidaStudentExample = new SybidaStudentExample();
            sybidaStudentExample.createCriteria().andStudentClassIdEqualTo(Integer.valueOf(classNum));
            studentList1 = sybidaStudentMapper.selectByExample(sybidaStudentExample);

            for (int i = 0; i < studentList1.size(); i++) {
                auditionList1 = sybidaAuditionMapper.selectAuditionByauditionStudentIdForTeacher(studentList1.get(i).getStudentId());
                for (int j = 0; j < auditionList1.size(); j++) {
                    auditionList2.add(auditionList1.get(j));
                }
            }


        }


        //手动分页
        //创建Page类
        Page page = new Page(pageNum, pageSize);
//为Page类中的total属性赋值
        int total = auditionList2.size();
        page.setTotal(total);
//计算当前需要显示的数据下标起始值
        int startIndex = (pageNum - 1) * pageSize;
        int endIndex = Math.min(startIndex + pageSize,total);
//从链表中截取需要显示的子链表，并加入到Page
        page.addAll(auditionList2.subList(startIndex,endIndex));
//以Page创建PageInfo
        PageInfo pageInfo = new PageInfo<>(page);
//将数据传回前端
        responseResult.setData(pageInfo);
        responseResult.setCode(1);
        responseResult.setMessage("查询成功！");
        return responseResult;

    }

    @Override
    public ResponseResult selectstudentInterviewbyauditionId(int auditionId) {
        ResponseResult responseResult = new ResponseResult();
        AuditionForTeacher auditionForTeacher = sybidaAuditionMapper.selectstudentInterviewbyauditionId(auditionId);
        responseResult.setData(auditionForTeacher);
        responseResult.setCode(1);
        responseResult.setMessage("查询成功！");
        System.out.println(responseResult+"====================");
        return responseResult;

    }





}
