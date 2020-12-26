package com.sy.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.dto.ShowClassInfo;
import com.sy.mapper.*;
import com.sy.pojo.*;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ClassInfoServiceImp implements ClassInfoService{
    @Autowired
    SybidaClassMapper sybidaClassMapper;
    @Autowired
    SybidaStudyMapper sybidaStudyMapper;
    @Autowired
    SybidaTeachMapper sybidaTeachMapper;
    @Autowired
    SybidaStudentMapper sybidaStudentMapper;
    @Autowired
    SybidaUserMapper sybidaUserMapper;
    @Transactional
    @Override
    public ResponseResult selectAllByPage(int pageNum, int pageSize,String selectClass) {
        ResponseResult responseResult=new ResponseResult();
        List<SybidaClass> classList;
        List<ShowClassInfo> classInfoList =new ArrayList<>();
        PageHelper.startPage(pageNum,pageSize);
        if ("-1".equals(selectClass)) {
            SybidaClassExample sybidaClassExample = new SybidaClassExample();
            SybidaClassExample.Criteria criteria = sybidaClassExample.createCriteria();
            criteria.andClassNull1EqualTo("1");
            classList = sybidaClassMapper.selectByExample(sybidaClassExample);
        }else {
            SybidaClassExample sybidaClassExample = new SybidaClassExample();
            SybidaClassExample.Criteria criteria = sybidaClassExample.createCriteria();
            criteria.andClassNull1EqualTo("1");
            criteria.andClassNumEqualTo(selectClass);
            classList = sybidaClassMapper.selectByExample(sybidaClassExample);
        }
             PageInfo<SybidaClass> pageInfo = new PageInfo<>(classList);
            //设置导航页数
            responseResult.setData(pageInfo);
            return responseResult;
    }
    @Transactional
    @Override
    public ResponseResult selectByclassName(String className) {
        return null;
    }
    @Transactional
    @Override
    public List<SybidaClass> selectClass() {
        SybidaClassExample sybidaClassExample=new SybidaClassExample();
        SybidaClassExample.Criteria criteria = sybidaClassExample.createCriteria();
        criteria.andClassNull1EqualTo("1");
        List<SybidaClass> listClass=sybidaClassMapper.selectByExample(sybidaClassExample);
        return listClass;
    }

    @Transactional
    @Override
    public List<SybidaStudy> selectStudy() {
        List<SybidaStudy> listStudy= sybidaStudyMapper.selectByExample(null);
        return listStudy;
    }


    @Transactional
    @Override
    public ResponseResult deleteClass(String classId) {

        SybidaClass sybidaClass = new SybidaClass();
        sybidaClass.setClassId(Integer.valueOf(classId));
        sybidaClass.setClassNull1("0");
        int row = sybidaClassMapper.updateByPrimaryKeySelective(sybidaClass);
        ResponseResult responseResult = new ResponseResult();
        if (row > 0) {
            responseResult.setCode(1);
            responseResult.setMessage("删除成功");
        } else {
            responseResult.setCode(0);
            responseResult.setMessage("删除失败");
        }
        return responseResult;
    }

    @Override
    public ResponseResult selectTeachId(String teachId) {
      SybidaTeach teacher=sybidaTeachMapper.selectByPrimaryKey(Integer.valueOf(teachId));
       ResponseResult responseResult=new ResponseResult();
       responseResult.setCode(1);
       responseResult.setMessage("成功");
       responseResult.setData(teacher);
       return responseResult;
    }

    @Override
    public ResponseResult deleteAllClass(List<Integer> list) {
        int row = 0;
        for (int i = 0; i < list.size(); i++) {
            SybidaClass sybidaClass =new SybidaClass();
            sybidaClass.setClassId(list.get(i));
            sybidaClass.setClassNull1("0");
            row += sybidaClassMapper.updateByPrimaryKeySelective(sybidaClass);
        }
        ResponseResult responseResult = new ResponseResult();
        if (row == list.size()) {
            responseResult.setCode(1);
            responseResult.setMessage("成功");
        } else {
            responseResult.setCode(0);
            responseResult.setMessage("错误");
        }
        return responseResult;
    }

    @Override
    public SybidaClass showOneClass(String classId) {
        SybidaClass classDemo= sybidaClassMapper.selectByPrimaryKey(Integer.valueOf(classId));
        return classDemo;
    }

    @Override
    public SybidaTeach selectTeacherName(String classTeachId) {
        return sybidaTeachMapper.selectByPrimaryKey(Integer.valueOf(classTeachId));
    }

    @Override
    public SybidaStudy selectStudyName(String classStudyId) {
        return  sybidaStudyMapper.selectByPrimaryKey(Integer.valueOf(classStudyId));
    }

    @Override
    public ResponseResult updateClassInfo(SybidaClass sybidaClass) {
        ResponseResult responseResult=new ResponseResult();
        sybidaClass.setClassAlterTime(new Date());
      int row= sybidaClassMapper.updateByPrimaryKeySelective(sybidaClass);
      if (row==1){
          responseResult.setCode(1);
          responseResult.setMessage("修改成功");
          return responseResult;
      }else {
          responseResult.setCode(0);
          responseResult.setMessage("修改失败");
      }
        return responseResult;
    }

    @Transactional
    @Override
    public ResponseResult teacherIdFindClass(String pageSize,String pageNum,String classManagerId) {
        ResponseResult responseResult=new ResponseResult();
        SybidaClassExample sybidaClassExample=new SybidaClassExample();
        SybidaClassExample.Criteria criteria = sybidaClassExample.createCriteria();
        criteria.andClassManagerIdEqualTo(Integer.valueOf(classManagerId));
        List<SybidaClass> sybidaClassList= sybidaClassMapper.selectByExample(sybidaClassExample);

        PageHelper.startPage(Integer.valueOf(pageNum),Integer.valueOf(pageSize));
        SybidaStudentExample sybidaStudentExample=new SybidaStudentExample();
        SybidaStudentExample.Criteria criteria1 = sybidaStudentExample.createCriteria();
        criteria1.andStudentClassIdEqualTo(sybidaClassList.get(0).getClassId());
        criteria1.andStudentNull2EqualTo("1");
        List<SybidaStudent>  studentList= sybidaStudentMapper.selectByExample(sybidaStudentExample);

        PageInfo<SybidaStudent> pageInfo = new PageInfo<>(studentList);

        String classId= String.valueOf(sybidaClassList.get(0).getClassId());
        if (studentList.size()>0){
            responseResult.setCode(1);
            responseResult.setMessage(classId);
            responseResult.setData(pageInfo);
            return responseResult;
        }else {
            responseResult.setCode(0);
            responseResult.setMessage("查询失败");
        }
        return responseResult;
    }

    @Transactional
    @Override
    public ResponseResult teacherIdFindClass2(String pageSize, String pageNum, String classManagerId) {
        SybidaUser sybidaUser = sybidaUserMapper.selectByPrimaryKey(Integer.valueOf(classManagerId));
        Byte userAuthority = sybidaUser.getUserAuthority();
        System.out.println(userAuthority+"用户权限=========================================");
        ResponseResult responseResult = new ResponseResult();
        if (userAuthority == 0) {
            SybidaClassExample sybidaClassExample = new SybidaClassExample();
            SybidaClassExample.Criteria criteria = sybidaClassExample.createCriteria();
            criteria.andClassManagerIdEqualTo(Integer.valueOf(classManagerId));
            criteria.andClassNull1EqualTo("1");
            List<SybidaClass> sybidaClassList = sybidaClassMapper.selectByExample(sybidaClassExample);
            System.out.println(sybidaClassList+"符合条件班级==============");
            PageHelper.startPage(Integer.valueOf(pageNum), Integer.valueOf(pageSize));
            SybidaStudentExample sybidaStudentExample = new SybidaStudentExample();
            SybidaStudentExample.Criteria criteria1 = sybidaStudentExample.createCriteria();
            System.out.println(sybidaClassList.get(0).getClassId()+"====================");
            criteria1.andStudentClassIdEqualTo(sybidaClassList.get(0).getClassId());
            criteria1.andStudentNull2EqualTo("1");
            List<SybidaStudent> studentList = sybidaStudentMapper.selectByExample(sybidaStudentExample);

            PageInfo<SybidaStudent> pageInfo = new PageInfo<>(studentList);

            String classId = String.valueOf(sybidaClassList.get(0).getClassId());

            if (studentList.size() > 0) {
                responseResult.setCode(1);
                responseResult.setMessage(classId);
                responseResult.setData(pageInfo);
                return responseResult;
            } else {
                responseResult.setCode(0);
                responseResult.setMessage("查询失败");
                return responseResult;
            }

        }else if (userAuthority==1){
            SybidaClassExample sybidaClassExample = new SybidaClassExample();
            SybidaClassExample.Criteria criteria = sybidaClassExample.createCriteria();
            criteria.andClassTeachIdEqualTo(Integer.valueOf(classManagerId));
            criteria.andClassNull1EqualTo("1");
            List<SybidaClass> sybidaClassList = sybidaClassMapper.selectByExample(sybidaClassExample);
            System.out.println(sybidaClassList+"符合条件班级老师==============");

            PageHelper.startPage(Integer.valueOf(pageNum), Integer.valueOf(pageSize));
            SybidaStudentExample sybidaStudentExample = new SybidaStudentExample();
            SybidaStudentExample.Criteria criteria1 = sybidaStudentExample.createCriteria();
            System.out.println(sybidaClassList.get(0).getClassId()+"===============老师=====");
            criteria1.andStudentClassIdEqualTo(sybidaClassList.get(0).getClassId());
            criteria1.andStudentNull2EqualTo("1");
            List<SybidaStudent> studentList= sybidaStudentMapper.selectByExample(sybidaStudentExample);
            PageInfo<SybidaStudent> pageInfo = new PageInfo<>(studentList);

            String classId = String.valueOf(sybidaClassList.get(0).getClassId());

            if (studentList.size() > 0) {
                responseResult.setCode(1);
                responseResult.setMessage(classId);
                responseResult.setData(pageInfo);
                return responseResult;
            } else {
                responseResult.setCode(0);
                responseResult.setMessage("查询失败");
            }
            return responseResult;
        }else if (userAuthority==9){

        }
        return null;
    }
}
