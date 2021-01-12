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
    public List<SybidaUser> selectTeacher() {
        SybidaUserExample sybidaUserExample=new SybidaUserExample();
        SybidaUserExample.Criteria criteria = sybidaUserExample.createCriteria();
        criteria.andUserAuthorityEqualTo((byte)1);
         List<SybidaUser> userList=  sybidaUserMapper.selectByExample(sybidaUserExample);
        return userList;
    }


    @Transactional(rollbackFor = { Exception.class })//让checked例外也回滚：在整个方法前加上
    @Override
    public ResponseResult inserSelectMulTable(List<RegisterExcel> registerExcels, PartStudent partStudent) throws  Exception {
        ResponseResult responseResult = new ResponseResult();
        for (int j = 0; j < registerExcels.size(); j++) {
            String phone= registerExcels.get(j).getPhone().replace(",", "");
            int phone1 = RegularUtil.regularPhone(registerExcels.get(j).getName(),phone);
            if (phone1 == 0) {
                IOxlsl.deleteFile();
                responseResult.setCode(100000);
                int n = j + 1;
                responseResult.setMessage("第" + n + "条姓名或手机号错误");
                return responseResult;
            }
        }
        int num=0;
        for (int k=0;k<registerExcels.size();k++){
            String phone2= registerExcels.get(k).getPhone().replace(",", "");
            SybidaUserExample sybidaUserExample = new SybidaUserExample();
            SybidaUserExample.Criteria criteria = sybidaUserExample.createCriteria();
            criteria.andUserPhoneEqualTo(phone2);
            List<SybidaUser> listUser = sybidaUserMapper.selectByExample(sybidaUserExample);
            if (listUser.size()!=0){
                num+=1;
                responseResult.setCode(99999);
                responseResult.setMessage("第" + num + "条重复");
                return responseResult;
            }
        }
        //创建班级
        Date date=new Date();
        SybidaClass sybidaClass = new SybidaClass();
        sybidaClass.setClassNum(partStudent.getClassCreate());
        sybidaClass.setClassTeachId(Integer.valueOf(partStudent.getSelectTeacher()));
        sybidaClass.setClassManagerId(Integer.valueOf(partStudent.getInsetManager()));
        sybidaClass.setClassStudyId(Integer.valueOf(partStudent.getSelectStudy()));
        sybidaClass.setClassNull1("1");
        sybidaClass.setClassTime(date);
        sybidaClass.setClassAlterTime(date);
        int row2 = sybidaClassMapper.insertSelective(sybidaClass);
        if (row2==1){
        int row=0;
        int row3=0;
        for (int i = 0; i < registerExcels.size(); i++) {
            String phone2= registerExcels.get(i).getPhone().replace(",", "");
                    SybidaUser sybidaUser = new SybidaUser();
                    sybidaUser.setUserName(registerExcels.get(i).getName());
                    sybidaUser.setUserPassword("123456");
                    sybidaUser.setUserPhone(phone2);
                    sybidaUser.setUserNote(1);
                    sybidaUser.setUserAuthority((byte) 2);
                    sybidaUser.setUserAlterTime(new Date());
                    row = sybidaUserMapper.insertSelective(sybidaUser);

            if (row==1) {
                SybidaStudent sybidaStudent = new SybidaStudent();
                sybidaStudent.setStudentId(sybidaUser.getUserId());
                sybidaStudent.setStudentName(registerExcels.get(i).getName());
                sybidaStudent.setStudentPhone(sybidaUser.getUserPhone());
                sybidaStudent.setStudentClassId(sybidaClass.getClassId());
                sybidaStudent.setStudentStudyId(Integer.valueOf(partStudent.getSelectStudy()));
                sybidaStudent.setStudentPhoto("defaultpicture.jpg");
                sybidaStudent.setStudentNull1("B");
                sybidaStudent.setStudentNull2("1");
                sybidaStudent.setStudentAlterTime(new Date());
                row3 += sybidaStudentMapper.insertSelective(sybidaStudent);
            }
         }
            if (row3==registerExcels.size()){
                IOxlsl.deleteFile();
                responseResult.setCode(666);
                responseResult.setMessage("所有表插入成功");
                return responseResult;
            }else {
                responseResult.setCode(0);
                responseResult.setMessage("出现异常");
                return responseResult;
            }
        }

        return null;
 }
//重新add


        @Override
        public List<SybidaClass> selectClassName (String name){
            SybidaClassExample sybidaClassExample = new SybidaClassExample();
            SybidaClassExample.Criteria criteria = sybidaClassExample.createCriteria();
            criteria.andClassNumEqualTo(name);
            List<SybidaClass> classList = sybidaClassMapper.selectByExample(sybidaClassExample);
            return classList;
        }
    }

