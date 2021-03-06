package com.sy.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.dto.ClassAndStudyTeacher;
import com.sy.dto.ShowClassInfo;
import com.sy.dto.TendencyParam;
import com.sy.mapper.*;
import com.sy.pojo.*;
import com.sy.vo.ResponseResult;
import org.apache.poi.ss.formula.functions.T;
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
            //??????????????????
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
            responseResult.setMessage("????????????");
        } else {
            responseResult.setCode(0);
            responseResult.setMessage("????????????");
        }
        return responseResult;
    }

    @Override
    public ResponseResult selectTeachId(String teachId) {
      SybidaTeach teacher=sybidaTeachMapper.selectByPrimaryKey(Integer.valueOf(teachId));
       ResponseResult responseResult=new ResponseResult();
       responseResult.setCode(1);
       responseResult.setMessage("??????");
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
            responseResult.setMessage("??????");
        } else {
            responseResult.setCode(0);
            responseResult.setMessage("??????");
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
          responseResult.setMessage("????????????");
          return responseResult;
      }else {
          responseResult.setCode(0);
          responseResult.setMessage("????????????");
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
            responseResult.setMessage("????????????");
        }
        return responseResult;
    }

    @Transactional
    @Override
    public ResponseResult teacherIdFindClass2(String pageSize, String pageNum, String classId) {
        ResponseResult responseResult=new ResponseResult();
        PageHelper.startPage(Integer.valueOf(pageNum), Integer.valueOf(pageSize));
        SybidaStudentExample sybidaStudentExample=new SybidaStudentExample();
        SybidaStudentExample.Criteria criteria = sybidaStudentExample.createCriteria();
        criteria.andStudentClassIdEqualTo(Integer.valueOf(classId));
        criteria.andStudentNull2EqualTo("1");
        List<SybidaStudent> studentList= sybidaStudentMapper.selectByExample(sybidaStudentExample);
        PageInfo<SybidaStudent> pageInfo = new PageInfo<>(studentList);
        if (studentList.size()>0){
            responseResult.setCode(1);
            responseResult.setMessage("??????????????????");
            responseResult.setData(pageInfo);
        }else {
            responseResult.setCode(0);
            responseResult.setMessage("??????????????????");
        }
        return responseResult;
    }
//    public ResponseResult teacherIdFindClass2(String pageSize, String pageNum, String classManagerId) {
//        SybidaUser sybidaUser = sybidaUserMapper.selectByPrimaryKey(Integer.valueOf(classManagerId));
//        Byte userAuthority = sybidaUser.getUserAuthority();
//        System.out.println(userAuthority+"????????????=========================================");
//        ResponseResult responseResult = new ResponseResult();
//        if (userAuthority == 0) {
//            SybidaClassExample sybidaClassExample = new SybidaClassExample();
//            SybidaClassExample.Criteria criteria = sybidaClassExample.createCriteria();
//            criteria.andClassManagerIdEqualTo(Integer.valueOf(classManagerId));
//            criteria.andClassNull1EqualTo("1");
//            List<SybidaClass> sybidaClassList = sybidaClassMapper.selectByExample(sybidaClassExample);
//
//            System.out.println(sybidaClassList+"??????????????????==============");
//            PageHelper.startPage(Integer.valueOf(pageNum), Integer.valueOf(pageSize));
//            SybidaStudentExample sybidaStudentExample = new SybidaStudentExample();
//            SybidaStudentExample.Criteria criteria1 = sybidaStudentExample.createCriteria();
//            System.out.println(sybidaClassList.get(0).getClassId()+"====================");
//            criteria1.andStudentClassIdEqualTo(sybidaClassList.get(0).getClassId());
//            criteria1.andStudentNull2EqualTo("1");
//            List<SybidaStudent> studentList = sybidaStudentMapper.selectByExample(sybidaStudentExample);
//
//            PageInfo<SybidaStudent> pageInfo = new PageInfo<>(studentList);
//
//            String classId = String.valueOf(sybidaClassList.get(0).getClassId());
//
//            if (studentList.size() > 0) {
//                responseResult.setCode(1);
//                responseResult.setMessage(classId);
//                responseResult.setData(pageInfo);
//                return responseResult;
//            } else {
//                responseResult.setCode(0);
//                responseResult.setMessage("????????????");
//                return responseResult;
//            }
//
//        }else if (userAuthority==1){
//            SybidaClassExample sybidaClassExample = new SybidaClassExample();
//            SybidaClassExample.Criteria criteria = sybidaClassExample.createCriteria();
//            criteria.andClassTeachIdEqualTo(Integer.valueOf(classManagerId));
//            criteria.andClassNull1EqualTo("1");
//            List<SybidaClass> sybidaClassList = sybidaClassMapper.selectByExample(sybidaClassExample);
//            System.out.println(sybidaClassList+"????????????????????????==============");
//
//            PageHelper.startPage(Integer.valueOf(pageNum), Integer.valueOf(pageSize));
//            SybidaStudentExample sybidaStudentExample = new SybidaStudentExample();
//            SybidaStudentExample.Criteria criteria1 = sybidaStudentExample.createCriteria();
//            System.out.println(sybidaClassList.get(0).getClassId()+"===============??????=====");
//            criteria1.andStudentClassIdEqualTo(sybidaClassList.get(0).getClassId());
//            criteria1.andStudentNull2EqualTo("1");
//            List<SybidaStudent> studentList= sybidaStudentMapper.selectByExample(sybidaStudentExample);
//            PageInfo<SybidaStudent> pageInfo = new PageInfo<>(studentList);
//
//            String classId = String.valueOf(sybidaClassList.get(0).getClassId());
//
//            if (studentList.size() > 0) {
//                responseResult.setCode(1);
//                responseResult.setMessage(classId);
//                responseResult.setData(pageInfo);
//                return responseResult;
//            } else {
//                responseResult.setCode(0);
//                responseResult.setMessage("????????????");
//            }
//            return responseResult;
//        }else if (userAuthority==9){
//
//        }
//        return null;
//    }

    @Override
    public ResponseResult selectTeacherMutiClass(String classManagerId) {
        ResponseResult responseResult=new ResponseResult();
        SybidaClassExample sybidaClassExample = new SybidaClassExample();
        SybidaUser sybidaUser = sybidaUserMapper.selectByPrimaryKey(Integer.valueOf(classManagerId));
        Byte userAuthority = sybidaUser.getUserAuthority();
        if (userAuthority==0){
            SybidaClassExample.Criteria criteria = sybidaClassExample.createCriteria();
            criteria.andClassManagerIdEqualTo(Integer.valueOf(classManagerId));
            criteria.andClassNull1EqualTo("1");
            List<SybidaClass> sybidaClassList = sybidaClassMapper.selectByExample(sybidaClassExample);
            if (sybidaClassList.size()>0){
                responseResult.setCode(1);
                responseResult.setMessage("??????ID????????????");
                responseResult.setData(sybidaClassList);
                return responseResult;
            }else {
                responseResult.setCode(0);
                responseResult.setMessage("??????ID????????????");
                return responseResult;
            }

        }else if (userAuthority==1){
            SybidaClassExample.Criteria criteria = sybidaClassExample.createCriteria();
            criteria.andClassTeachIdEqualTo(Integer.valueOf(classManagerId));
            criteria.andClassNull1EqualTo("1");
            List<SybidaClass> sybidaClassList = sybidaClassMapper.selectByExample(sybidaClassExample);
            if (sybidaClassList.size()>0){
                responseResult.setCode(1);
                responseResult.setMessage("??????ID????????????");
                responseResult.setData(sybidaClassList);
                return responseResult;
            }else {
                responseResult.setCode(0);
                responseResult.setMessage("??????ID????????????");
                return responseResult;
            }
        }else if (userAuthority==9){
            List<SybidaClass> sybidaClassList = sybidaClassMapper.selectByExample(null);
            if (sybidaClassList.size()>0){
                responseResult.setCode(1);
                responseResult.setMessage("??????ID????????????");
                responseResult.setData(sybidaClassList);
                return responseResult;
        }else {
                responseResult.setCode(0);
                responseResult.setMessage("??????ID????????????");
                return responseResult;
            }
        }
        return responseResult;
    }

    @Override
    public ResponseResult selectAllClass(String classManagerId) {
        ResponseResult responseResult=new ResponseResult();
            List<SybidaClass> sybidaClassList = sybidaClassMapper.selectByExample(null);
            if (sybidaClassList.size()>0){
                responseResult.setCode(1);
                responseResult.setMessage("??????ID????????????");
                responseResult.setData(sybidaClassList);
                return responseResult;
            }else {
                responseResult.setCode(0);
                responseResult.setMessage("??????ID????????????");
                return responseResult;
            }


    }

    @Override
    public ResponseResult selectUserByIdClass(String userId,String pageNum,String pageSize,String selectClass) {
        ResponseResult responseResult = new ResponseResult();
        List<SybidaClass> sybidaClassList;
        SybidaClassExample sybidaClassExample = new SybidaClassExample();
        SybidaUser sybidaUser = sybidaUserMapper.selectByPrimaryKey(Integer.valueOf(userId));
        Byte userAuthority = sybidaUser.getUserAuthority();
        if (userAuthority == 0) {
            PageHelper.startPage(Integer.valueOf(pageNum),Integer.valueOf(pageSize));
            if ("-1".equals(selectClass)) {
                SybidaClassExample.Criteria criteria = sybidaClassExample.createCriteria();
                criteria.andClassManagerIdEqualTo(Integer.valueOf(userId));
                criteria.andClassNull1EqualTo("1");
                sybidaClassList= sybidaClassMapper.selectByExample(sybidaClassExample);
            }else {
                SybidaClassExample.Criteria criteria = sybidaClassExample.createCriteria();
                criteria.andClassManagerIdEqualTo(Integer.valueOf(userId));
                criteria.andClassNull1EqualTo("1");
                criteria.andClassIdEqualTo(Integer.valueOf(selectClass));
                sybidaClassList = sybidaClassMapper.selectByExample(sybidaClassExample);
            }
            PageInfo<SybidaClass> pageInfo = new PageInfo<>(sybidaClassList);
            if (sybidaClassList.size()>0){
                responseResult.setCode(1);
                //??????????????????
                responseResult.setData(pageInfo);
                return responseResult;
            }else {
                responseResult.setCode(0);
                responseResult.setMessage("????????????");
                return  responseResult;
            }


        }else if (userAuthority==1){
            PageHelper.startPage(Integer.valueOf(pageNum),Integer.valueOf(pageSize));
            if ("-1".equals(selectClass)) {
                SybidaClassExample.Criteria criteria = sybidaClassExample.createCriteria();
                criteria.andClassTeachIdEqualTo(Integer.valueOf(userId));
                criteria.andClassNull1EqualTo("1");
                sybidaClassList = sybidaClassMapper.selectByExample(sybidaClassExample);
            }else {
                SybidaClassExample.Criteria criteria = sybidaClassExample.createCriteria();
                criteria.andClassTeachIdEqualTo(Integer.valueOf(userId));
                criteria.andClassNull1EqualTo("1");
                criteria.andClassIdEqualTo(Integer.valueOf(selectClass));
                sybidaClassList = sybidaClassMapper.selectByExample(sybidaClassExample);
            }
            PageInfo<SybidaClass> pageInfo = new PageInfo<>(sybidaClassList);
            if (sybidaClassList.size()>0){
                responseResult.setCode(1);
                //??????????????????
                responseResult.setData(pageInfo);
                return responseResult;
            }else {
                responseResult.setCode(0);
                responseResult.setMessage("????????????");
                return  responseResult;
            }

        }else if (userAuthority==9){
            PageHelper.startPage(Integer.valueOf(pageNum),Integer.valueOf(pageSize));
            if ("-1".equals(selectClass)) {
                sybidaClassList = sybidaClassMapper.selectByExample(null);
            }else {
                SybidaClassExample.Criteria criteria = sybidaClassExample.createCriteria();
                criteria.andClassIdEqualTo(Integer.valueOf(selectClass));
                sybidaClassList = sybidaClassMapper.selectByExample(sybidaClassExample);
            }
            PageInfo<SybidaClass> pageInfo = new PageInfo<>(sybidaClassList);
            if (sybidaClassList.size()>0){
                responseResult.setCode(1);
                //??????????????????
                responseResult.setData(pageInfo);
                return responseResult;
            }else {
                responseResult.setCode(0);
                responseResult.setMessage("????????????");
                return  responseResult;
            }

        }
        return responseResult;
    }

    @Override
    public ResponseResult selectTeacher() {
        ResponseResult responseResult=new ResponseResult();
        SybidaUserExample sybidaUserExample=new SybidaUserExample();
        SybidaUserExample.Criteria criteria = sybidaUserExample.createCriteria();
        criteria.andUserAuthorityEqualTo((byte)1);
        List<SybidaUser> teachList=  sybidaUserMapper.selectByExample(sybidaUserExample);
      if(teachList.size()>0){
          responseResult.setCode(1);
          responseResult.setMessage("??????");
          responseResult.setData(teachList);
          return responseResult;
      }else {
          responseResult.setCode(0);
          responseResult.setMessage("??????");
      }
        return responseResult;
    }

    @Override
    public ResponseResult selectmanager() {
        ResponseResult responseResult=new ResponseResult();
        SybidaUserExample sybidaUserExample=new SybidaUserExample();
        SybidaUserExample.Criteria criteria = sybidaUserExample.createCriteria();
        criteria.andUserAuthorityEqualTo((byte)0);
        List<SybidaUser> teachList=  sybidaUserMapper.selectByExample(sybidaUserExample);
        if(teachList.size()>0){
            responseResult.setCode(1);
            responseResult.setMessage("??????");
            responseResult.setData(teachList);
            return responseResult;
        }else {
            responseResult.setCode(0);
            responseResult.setMessage("??????");
        }
        return responseResult;
    }

    @Override
    public ResponseResult selectUserByIdClass2(String userId, String pageNum, String pageSize, String selectClass) {
        ResponseResult responseResult = new ResponseResult();
        List<ClassAndStudyTeacher> sybidaClassList;
        SybidaClassExample sybidaClassExample = new SybidaClassExample();
        SybidaUser sybidaUser = sybidaUserMapper.selectByPrimaryKey(Integer.valueOf(userId));
        Byte userAuthority = sybidaUser.getUserAuthority();
        if (userAuthority == 0) {
            PageHelper.startPage(Integer.valueOf(pageNum),Integer.valueOf(pageSize));
            if ("-1".equals(selectClass)) {
                TendencyParam tendencyParam=new TendencyParam();
                tendencyParam.setClassNull1("1");
                tendencyParam.setmName(Integer.valueOf(userId));
                sybidaClassList= sybidaClassMapper.classAndStudyTeacher(tendencyParam);
            }else {
//                SybidaClassExample.Criteria criteria = sybidaClassExample.createCriteria();
//                criteria.andClassManagerIdEqualTo(Integer.valueOf(userId));
//                criteria.andClassNull1EqualTo("1");
//                criteria.andClassIdEqualTo(Integer.valueOf(selectClass));
                TendencyParam tendencyParam=new TendencyParam();
                tendencyParam.setClassNull1("1");
                tendencyParam.setmName(Integer.valueOf(userId));
                tendencyParam.setStudyId(Integer.valueOf(selectClass));
                sybidaClassList = sybidaClassMapper.classAndStudyTeacher(tendencyParam);
            }
            PageInfo<ClassAndStudyTeacher> pageInfo = new PageInfo<>(sybidaClassList);
            if (sybidaClassList.size()>0){
                responseResult.setCode(1);
                //??????????????????
                responseResult.setData(pageInfo);
                return responseResult;
            }else {
                responseResult.setCode(0);
                responseResult.setMessage("????????????");
                return  responseResult;
            }


        }else if (userAuthority==1){
            PageHelper.startPage(Integer.valueOf(pageNum),Integer.valueOf(pageSize));
            if ("-1".equals(selectClass)) {
//                SybidaClassExample.Criteria criteria = sybidaClassExample.createCriteria();
//                criteria.andClassTeachIdEqualTo(Integer.valueOf(userId));
//                criteria.andClassNull1EqualTo("1");
//                sybidaClassList = sybidaClassMapper.selectByExample(sybidaClassExample);
                TendencyParam tendencyParam=new TendencyParam();
                tendencyParam.setClassNull1("1");
                tendencyParam.settName(Integer.valueOf(userId));
                sybidaClassList= sybidaClassMapper.classAndStudyTeacher(tendencyParam);
            }else {
//                SybidaClassExample.Criteria criteria = sybidaClassExample.createCriteria();
//                criteria.andClassTeachIdEqualTo(Integer.valueOf(userId));
//                criteria.andClassNull1EqualTo("1");
//                criteria.andClassIdEqualTo(Integer.valueOf(selectClass));
//                sybidaClassList = sybidaClassMapper.selectByExample(sybidaClassExample);
                TendencyParam tendencyParam=new TendencyParam();
                tendencyParam.setClassNull1("1");
                tendencyParam.settName(Integer.valueOf(userId));
                tendencyParam.setStudyId(Integer.valueOf(selectClass));
                sybidaClassList = sybidaClassMapper.classAndStudyTeacher(tendencyParam);
            }
            PageInfo<ClassAndStudyTeacher> pageInfo = new PageInfo<>(sybidaClassList);
            if (sybidaClassList.size()>0){
                responseResult.setCode(1);
                //??????????????????
                responseResult.setData(pageInfo);
                return responseResult;
            }else {
                responseResult.setCode(0);
                responseResult.setMessage("????????????");
                return  responseResult;
            }

        }else if (userAuthority==9){
            PageHelper.startPage(Integer.valueOf(pageNum),Integer.valueOf(pageSize));
            if ("-1".equals(selectClass)) {
                sybidaClassList = sybidaClassMapper.classAndStudyTeacher(null);
            }else {
//                SybidaClassExample.Criteria criteria = sybidaClassExample.createCriteria();
//                criteria.andClassIdEqualTo(Integer.valueOf(selectClass));
                TendencyParam tendencyParam=new TendencyParam();
                tendencyParam.setStudyId(Integer.valueOf(selectClass));
                sybidaClassList = sybidaClassMapper.classAndStudyTeacher(tendencyParam);
            }
            PageInfo<ClassAndStudyTeacher> pageInfo = new PageInfo<>(sybidaClassList);
            if (sybidaClassList.size()>0){
                responseResult.setCode(1);
                //??????????????????
                responseResult.setData(pageInfo);
                return responseResult;
            }else {
                responseResult.setCode(0);
                responseResult.setMessage("????????????");
                return  responseResult;
            }
//
        }
        return responseResult;
    }
}
