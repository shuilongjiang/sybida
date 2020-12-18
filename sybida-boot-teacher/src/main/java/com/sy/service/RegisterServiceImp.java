package com.sy.service;

import com.sy.mapper.*;
import com.sy.pojo.*;
import com.sy.register.RegularUtil;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
        List<SybidaClass> listClass = sybidaClassMapper.selectByExample(null);
        return listClass;
    }

    @Transactional
    @Override
    public List<SybidaStudy> selectStudy() {
        List<SybidaStudy> listStudy = sybidaStudyMapper.selectByExample(null);
        return listStudy;
    }

    @Transactional
    @Override
    public List<SybidaTeach> selectTeacher() {
        List<SybidaTeach> listTeacher = sybidaTeachMapper.selectByExample(null);
        return listTeacher;
    }

    @Transactional(rollbackFor = Exception.class)//让checked例外也回滚：在整个方法前加上
    @Override
    public int insertSelective(RegisterExcel record, PartStudent partStudent) {
        ResponseResult responseResult = new ResponseResult();
        String phone = record.getPhone().replace(",", "");
        //查询班级中是否有重复的学生
        SybidaUserExample sybidaUserExample = new SybidaUserExample();
        SybidaUserExample.Criteria criteria = sybidaUserExample.createCriteria();
        criteria.andUserNameEqualTo(record.getName());
        criteria.andUserPhoneEqualTo(phone);
        List<SybidaUser> listUser = sybidaUserMapper.selectByExample(sybidaUserExample);
        if (listUser.size() == 0) {
            //插入用户表将获取的信息
            SybidaUser sybidaUser = new SybidaUser();
            sybidaUser.setUserName(record.getName());
            sybidaUser.setUserPassword("123456");
            sybidaUser.setUserPhone(phone);
            sybidaUser.setUserNote(1);
            sybidaUser.setUserAuthority((byte) 2);
            sybidaUser.setUserAlterTime(new Date());
            int row1 = sybidaUserMapper.insertSelective(sybidaUser);
            //根据班级名获取 班级id 插入学生表中的  班级id
            SybidaClassExample sybidaClassExample = new SybidaClassExample();
            SybidaClassExample.Criteria criteria1 = sybidaClassExample.createCriteria();
            criteria1.andClassNumEqualTo(partStudent.getClassCreate());
            List<SybidaClass> listClass = sybidaClassMapper.selectByExample(sybidaClassExample);
            //插入学生表 用户id  用户姓名， 用户电话， 班级的id 学习方向等插入表
            SybidaStudent sybidaStudent = new SybidaStudent();
            sybidaStudent.setStudentId(sybidaUser.getUserId());
            sybidaStudent.setStudentName(sybidaUser.getUserName());
            sybidaStudent.setStudentPhone(sybidaUser.getUserPhone());
            sybidaStudent.setStudentClassId(Integer.valueOf(listClass.get(0).getClassId()));
            sybidaStudent.setStudentStudyId(Integer.valueOf(partStudent.getSelectStudy()));
            sybidaStudent.setStudentNull1("B");
            sybidaStudent.setStudentAlterTime(new Date());
            int row2 = sybidaStudentMapper.insertSelective(sybidaStudent);
            if (row1 > 0 && row2 > 0) {
                return 1;
            } else {
                return 0;
            }
        }
        return 0;
    }
    @Transactional(rollbackFor = { Exception.class })//让checked例外也回滚：在整个方法前加上
    @Override
    public ResponseResult inserSelectMulTable(List<RegisterExcel> registerExcels, PartStudent partStudent) throws  Exception{


        ResponseResult responseResult=new ResponseResult();
        System.out.println(registerExcels+"=====================");
        System.out.println(partStudent+"=================");
        List<Integer> userIdList= new ArrayList<>();
        List<Integer> classIdList=new ArrayList<>();
        int row = 0;
        int row3=0;
        for (int i = 0; i < registerExcels.size(); i++) {
            String phone = registerExcels.get(i).getPhone().replace(",", "");
            int phone1= RegularUtil.regularPhone(phone);
            if (phone1==0){
                responseResult.setCode(10000);
                int n=i+1;
                responseResult.setMessage("第"+n+"条手机号错误");
                return responseResult;
            }
            //查询班级中是否有重复的学生
            SybidaUserExample sybidaUserExample = new SybidaUserExample();
            SybidaUserExample.Criteria criteria = sybidaUserExample.createCriteria();
            criteria.andUserNameEqualTo(registerExcels.get(i).getName());
            criteria.andUserPhoneEqualTo(phone);
            List<SybidaUser> listUser = sybidaUserMapper.selectByExample(sybidaUserExample);
            if (listUser.size() == 0) {
                //插入用户表将获取的信息
                SybidaUser sybidaUser = new SybidaUser();
                sybidaUser.setUserName(registerExcels.get(i).getName());
                sybidaUser.setUserPassword("123456");
                sybidaUser.setUserPhone(phone);
                sybidaUser.setUserNote(1);
                sybidaUser.setUserAuthority((byte) 2);
                sybidaUser.setUserAlterTime(new Date());
                row += sybidaUserMapper.insertSelective(sybidaUser);
                userIdList.add(sybidaUser.getUserId());
            } else {
//                responseResult.setCode(i);
//                    responseResult.setMessage("第"+i+"条重复");
//                    responseResult.setData(registerExcels.get(i));
//                    return responseResult;
//                  int w = 10 / 0;
                try {
                    System.out.println("异常前");
                    int w = 10 / 0;
                    System.out.println("异常后");

                }catch (Exception e){
                    System.out.println("异常能抛出吗");
                    responseResult.setCode(i);
                    responseResult.setMessage("第"+i+"条重复");
                    responseResult.setData(registerExcels.get(i));
                    return responseResult;
                }
                finally {
//                    System.out.println("异常能抛出吗");
//                    responseResult.setCode(i);
//                    responseResult.setMessage("第"+i+"条重复");
//                    responseResult.setData(registerExcels.get(i));
//                    return responseResult;
                    int ww=10/0;
                }
            }
        }
        //用户表已经插入成功，创建一个班级表
        SybidaClass sybidaClass = new SybidaClass();
        sybidaClass.setClassNum(partStudent.getClassCreate());
        sybidaClass.setClassTeachId(Integer.valueOf(partStudent.getSelectTeacher()));
        sybidaClass.setClassManagerId(Integer.valueOf(partStudent.getInsetManager()));
        sybidaClass.setClassStudyId(Integer.valueOf(partStudent.getSelectStudy()));
        sybidaClass.setClassNull1("1");
        sybidaClass.setClassAlterTime(new Date());
        int row2 = sybidaClassMapper.insertSelective(sybidaClass);
        classIdList.add(sybidaClass.getClassId());
        if (row2==1){
            //根据班级表的名字得到，班级表的id准备插入到学习表里面
//            SybidaClassExample sybidaClassExample = new SybidaClassExample();
//            SybidaClassExample.Criteria criteria1 = sybidaClassExample.createCriteria();
//            criteria1.andClassNumEqualTo(partStudent.getClassCreate());
//            List<SybidaClass> listClass = sybidaClassMapper.selectByExample(sybidaClassExample);
            //准备插入学生表，通过用户表的信息，插到学生表里面
            for (int i = 0; i < registerExcels.size(); i++) {
                //每循环一次将，通过Excel表的的信息，查询用户表
                //将返回的信息，插入到学生表里
                String phone = registerExcels.get(i).getPhone().replace(",", "");
//                SybidaUserExample sybidaUserExample=new SybidaUserExample();
//                SybidaUserExample.Criteria criteria = sybidaUserExample.createCriteria();
//                criteria.andUserNameEqualTo(registerExcels.get(i).getName());
//                System.out.println(registerExcels.get(i).getName()+"==11111111111111111111");
//                criteria.andUserPhoneEqualTo(phone);
//                System.out.println(phone+"===2222222222222222222222222");
//
//                userList=sybidaUserMapper.selectByExample(sybidaUserExample);
//                System.out.println(userList+"==000000000000000000000000000");
                //插入学生表 用户id  用户姓名， 用户电话， 班级的id 学习方向等插入表
            SybidaStudent sybidaStudent = new SybidaStudent();
            sybidaStudent.setStudentId(userIdList.get(i));
            sybidaStudent.setStudentName(registerExcels.get(i).getName());
            sybidaStudent.setStudentPhone(phone);
            sybidaStudent.setStudentClassId(Integer.valueOf(classIdList.get(0)));
            sybidaStudent.setStudentStudyId(Integer.valueOf(partStudent.getSelectStudy()));
            sybidaStudent.setStudentPhoto("defaultpicture4.jpg");
            sybidaStudent.setStudentNull1("B");
            sybidaStudent.setStudentAlterTime(new Date());
             row3 += sybidaStudentMapper.insertSelective(sybidaStudent);
           }
        }
        if (row3==registerExcels.size()) {
            responseResult.setCode(666);
            responseResult.setMessage("所有表插入成功");
            return responseResult;
        }
        responseResult.setCode(0);
        responseResult.setMessage("出现异常");
        return responseResult;
    }

        @Override
        public int createClass (PartStudent partStudent){
//        SybidaClassExample sybidaClassExample=new SybidaClassExample();
//        SybidaClassExample.Criteria criteria = sybidaClassExample.createCriteria();
//        criteria.andClassNumEqualTo()
//        sybidaClassMapper.selectByExample();

            SybidaClass sybidaClass = new SybidaClass();
            sybidaClass.setClassNum(partStudent.getClassCreate());
            sybidaClass.setClassTeachId(Integer.valueOf(partStudent.getSelectTeacher()));
            sybidaClass.setClassManagerId(Integer.valueOf(partStudent.getInsetManager()));
            sybidaClass.setClassStudyId(Integer.valueOf(partStudent.getSelectStudy()));
            sybidaClass.setClassNull1("1");
            sybidaClass.setClassAlterTime(new Date());
            int row3 = sybidaClassMapper.insertSelective(sybidaClass);
            if (row3 > 0) {
                return 1;
            }
            return 0;
        }

        @Override
        public List<SybidaClass> selectClassName (String name){
            SybidaClassExample sybidaClassExample = new SybidaClassExample();
            SybidaClassExample.Criteria criteria = sybidaClassExample.createCriteria();
            criteria.andClassNumEqualTo(name);
            List<SybidaClass> classList = sybidaClassMapper.selectByExample(sybidaClassExample);
            return classList;
        }
    }

