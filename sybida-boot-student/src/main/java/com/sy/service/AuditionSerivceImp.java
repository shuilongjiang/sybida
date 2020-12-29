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
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
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

    @Autowired
    SybidaUserMapper sybidaUserMapper;


    @Transactional
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









    @Transactional
    @Override
    public ResponseResult selectstudentInterviewbyauditionId(int auditionId) {
        ResponseResult responseResult = new ResponseResult();
        AuditionForTeacher auditionForTeacher = sybidaAuditionMapper.selectstudentInterviewbyauditionId(auditionId);
        responseResult.setData(auditionForTeacher);
        responseResult.setCode(1);
        responseResult.setMessage("查询成功！");
        return responseResult;

    }





    @Transactional
    @Override
    public ResponseResult selectAllClass() {
        ResponseResult responseResult = new ResponseResult();
        List<SybidaClass> list = sybidaClassMapper.selectByExample(null);
        if (null != list && list.size() > 0) {
            responseResult.setCode(1);
            responseResult.setData(list);
        } else {
            responseResult.setCode(0);
        }
        return responseResult;
    }

    @Transactional
    @Override
    public ResponseResult selectStudentById(String userId) {
        ResponseResult responseResult = new ResponseResult();
        SybidaStudent sybidaStudent = sybidaStudentMapper.selectByPrimaryKey(Integer.valueOf(userId));
        responseResult.setData(sybidaStudent);
        responseResult.setCode(1);
        responseResult.setMessage("查询成功！");
        return responseResult;
    }

    @Transactional
    @Override
    public ResponseResult selectClassByClassId(String classId) {
        ResponseResult responseResult = new ResponseResult();
        SybidaClass sybidaClass = sybidaClassMapper.selectByPrimaryKey(Integer.valueOf(classId));
        responseResult.setData(sybidaClass);
        responseResult.setCode(1);
        responseResult.setMessage("查询成功！");
        return responseResult;

    }

    @Transactional
    @Override
    public ResponseResult addSybidaAudition(SybidaAudition object){
        ResponseResult responseResult = new ResponseResult();
        int affectedRows = sybidaAuditionMapper.insertSelective(object);
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


    //删除单选简历
    @Transactional
    @Override
    public ResponseResult deleteStudentAudition(Integer deleteAuditionId) {
        SybidaAudition sybidaAudition = new SybidaAudition();
        sybidaAudition.setAuditionId(deleteAuditionId);
        sybidaAudition.setAuditionNull1("0");
        sybidaAudition.setAuditionAlterTime(new Date());
        int row = sybidaAuditionMapper.updateByPrimaryKeySelective(sybidaAudition);
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
    public ResponseResult deleteAllStudentAudition(List<Integer> list) {
        int row = 0;
        for (int i = 0; i < list.size(); i++) {
            SybidaAudition sybidaAudition = new SybidaAudition();
            sybidaAudition.setAuditionId(list.get(i));
            sybidaAudition.setAuditionNull1("0");
            sybidaAudition.setAuditionAlterTime(new Date());
            row +=sybidaAuditionMapper.updateByPrimaryKeySelective(sybidaAudition);
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
    public ResponseResult selectpageStudentAudition(int pageSize, int pageNum, int userid) {
        ResponseResult responseResult = new ResponseResult();
        List<AuditionForTeacher> list;
        PageHelper.startPage(pageNum, pageSize);
        list = sybidaAuditionMapper.selectAuditionByauditionStudentIdForTeacher(userid);
        PageInfo<AuditionForTeacher> pageInfo = new PageInfo<>(list);
        responseResult.setData(pageInfo);
        responseResult.setCode(1);
        responseResult.setMessage("查询成功！");
        return responseResult;
    }




    @Transactional
    @Override
    public ResponseResult updateSybidaAudition(SybidaAudition sybidaAudition){
        ResponseResult responseResult = new ResponseResult();
        int affectedRows = sybidaAuditionMapper.updateByPrimaryKeySelective(sybidaAudition);
        if (affectedRows > 0) {
            responseResult.setCode(1);
            responseResult.setMessage("成功！");
        } else {
            responseResult.setCode(0);
            responseResult.setMessage("失败!");
        }
        System.out.println(sybidaAudition);
        return responseResult;
    }





    @Transactional
    @Override
    public ResponseResult selectPage2(int pageSize, int pageNum, String classNum, int userid) {
        ResponseResult responseResult = new ResponseResult();
        List<SybidaStudent> studentList1 = new ArrayList<>();
        List<SybidaClass> classList1 = null;
        List<AuditionForTeacher> oneStudentAuditionList;
        List<AuditionForTeacher> allStudentAuditionList = new ArrayList<>();
        if ("-1".equals(classNum)) {
            SybidaUser sybidaUser = sybidaUserMapper.selectByPrimaryKey(userid);
            Byte userAuthority = sybidaUser.getUserAuthority();
            //根据权限去查询名下存在的班级
            if (1 == userAuthority) {
                SybidaClassExample sybidaClassExample1 = new SybidaClassExample();
                sybidaClassExample1.createCriteria().andClassTeachIdEqualTo(Integer.valueOf(userid));
                classList1 = sybidaClassMapper.selectByExample(sybidaClassExample1);
            } else if (0 == userAuthority){
                SybidaClassExample sybidaClassExample2 = new SybidaClassExample();
                sybidaClassExample2.createCriteria().andClassManagerIdEqualTo(Integer.valueOf(userid));
                classList1 = sybidaClassMapper.selectByExample(sybidaClassExample2);
            }  else if (9 == userAuthority){
                classList1 = sybidaClassMapper.selectByExample(null);
            }

            //判断名下是否存在班级
            if (null != classList1 && classList1.size() > 0) {
                responseResult.setCode(1);
            } else {
                responseResult.setCode(0);
                return responseResult;
            }
            //遍历所查到的班级数，获取名下第一个班级的id,并根据班级id去查此班级有哪些学生
            SybidaStudentExample sybidaStudentExample = new SybidaStudentExample();
            sybidaStudentExample.createCriteria().andStudentClassIdEqualTo(classList1.get(0).getClassId());
            studentList1 = sybidaStudentMapper.selectByExample(sybidaStudentExample);
            for (int i = 0; i < studentList1.size(); i++) {
                oneStudentAuditionList = sybidaAuditionMapper.selectAuditionByStudentIdForTeacher(studentList1.get(i).getStudentId());
                for (int j = 0; j < oneStudentAuditionList.size(); j++) {
                   allStudentAuditionList.add(oneStudentAuditionList.get(j));
                }
            }
        }else {
            SybidaStudentExample sybidaStudentExample = new SybidaStudentExample();
            sybidaStudentExample.createCriteria().andStudentClassIdEqualTo(Integer.valueOf(classNum));
            studentList1 = sybidaStudentMapper.selectByExample(sybidaStudentExample);
            for (int i = 0; i < studentList1.size(); i++) {
                oneStudentAuditionList = sybidaAuditionMapper.selectAuditionByStudentIdForTeacher(studentList1.get(i).getStudentId());
                for (int j = 0; j < oneStudentAuditionList.size(); j++) {
                    allStudentAuditionList.add(oneStudentAuditionList.get(j));
                }
            }

        }

//        手动分页
//        创建Page类
        Page page = new Page(pageNum, pageSize);
//为Page类中的total属性赋值
        int total = allStudentAuditionList.size();
        page.setTotal(total);
//计算当前需要显示的数据下标起始值
        int startIndex = (pageNum - 1) * pageSize;
        int endIndex = Math.min(startIndex + pageSize,total);
//从链表中截取需要显示的子链表，并加入到Page
        page.addAll(allStudentAuditionList.subList(startIndex,endIndex));
//以Page创建PageInfo
        PageInfo pageInfo = new PageInfo<>(page);
//将数据传回前端
        responseResult.setData(pageInfo);
        responseResult.setCode(1);
        responseResult.setMessage("查询成功！");
        return responseResult;
    }
}
