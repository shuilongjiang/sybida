package com.sy.service;

import com.sy.mapper.*;
import com.sy.pojo.*;
import com.sy.register.IOxlsl;
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


    @Transactional(rollbackFor = { Exception.class })//让checked例外也回滚：在整个方法前加上
    @Override
    public ResponseResult inserSelectMulTable(List<RegisterExcel> registerExcels, PartStudent partStudent) throws  Exception {
        ResponseResult responseResult = new ResponseResult();
        for (int j = 0; j < registerExcels.size(); j++) {
            String phone = registerExcels.get(j).getPhone().replace(",", "");
            int phone1 = RegularUtil.regularPhone(registerExcels.get(j).getName(),phone);
            if (phone1 == 0) {
                IOxlsl.deleteFile();
                responseResult.setCode(100000);
                int n = j + 1;
                responseResult.setMessage("第" + n + "条姓名或手机号错误");
                return responseResult;
            }
        }
            List<Integer> userIdList = new ArrayList<>();
            List<Integer> classIdList = new ArrayList<>();
            int row = 0;
            int row3 = 0;
            for (int i = 0; i < registerExcels.size(); i++) {
                String phone2 = registerExcels.get(i).getPhone().replace(",", "");
                //查询班级中是否有重复的学生
                SybidaUserExample sybidaUserExample = new SybidaUserExample();
                SybidaUserExample.Criteria criteria = sybidaUserExample.createCriteria();
                criteria.andUserPhoneEqualTo(phone2);
                List<SybidaUser> listUser = sybidaUserMapper.selectByExample(sybidaUserExample);
                if (listUser.size() == 0) {
                    //插入用户表将获取的信息
                    SybidaUser sybidaUser = new SybidaUser();
                    sybidaUser.setUserName(registerExcels.get(i).getName());
                    sybidaUser.setUserPassword("123456");
                    sybidaUser.setUserPhone(phone2);
                    sybidaUser.setUserNote(1);
                    sybidaUser.setUserAuthority((byte) 2);
                    sybidaUser.setUserAlterTime(new Date());
                    row += sybidaUserMapper.insertSelective(sybidaUser);
                    userIdList.add(sybidaUser.getUserId());
                } else {
             //制造异常让事务回滚
                    try {
                        int w = 10 / 0;
                    } catch (Exception e) {
                        int num = i + 1;
                        responseResult.setCode(num);
                        responseResult.setMessage("第" + num + "条重复");
                        responseResult.setData(registerExcels.get(i));
                        return responseResult;
                    } finally {
                        IOxlsl.deleteFile();
                        int ww = 10 / 0;
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
            if (row2 == 1) {
                //准备插入学生表，通过用户表的信息，插到学生表里面
                for (int i = 0; i < registerExcels.size(); i++) {
                    //每循环一次将，通过Excel表的的信息，查询用户表
                    //将返回的信息，插入到学生表里
                    String phonestr = registerExcels.get(i).getPhone().replace(",", "");
                    //插入学生表 用户id  用户姓名， 用户电话， 班级的id 学习方向等插入表
                    SybidaStudent sybidaStudent = new SybidaStudent();
                    sybidaStudent.setStudentId(userIdList.get(i));
                    sybidaStudent.setStudentName(registerExcels.get(i).getName());
                    sybidaStudent.setStudentPhone(phonestr);
                    sybidaStudent.setStudentClassId(Integer.valueOf(classIdList.get(0)));
                    sybidaStudent.setStudentStudyId(Integer.valueOf(partStudent.getSelectStudy()));
                    sybidaStudent.setStudentPhoto("defaultpicture4.jpg");
                    sybidaStudent.setStudentNull1("B");
                    sybidaStudent.setStudentAlterTime(new Date());
                    row3 += sybidaStudentMapper.insertSelective(sybidaStudent);
                }
            }
            if (row3 == registerExcels.size()) {
                //删除文件
                IOxlsl.deleteFile();
                responseResult.setCode(666);
                responseResult.setMessage("所有表插入成功");
                return responseResult;
            }
            responseResult.setCode(0);
            responseResult.setMessage("出现异常");
            return responseResult;
        }
//重新add

        @Override
        public int createClass (PartStudent partStudent){
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

