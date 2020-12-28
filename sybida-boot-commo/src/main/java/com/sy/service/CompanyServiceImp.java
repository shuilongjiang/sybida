package com.sy.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.MD5.MD5Utils;
import com.sy.dto.CompanyAndTeach;
import com.sy.dto.CompanyTeacherStudy;
import com.sy.mapper.SybidaCompanyMapper;
import com.sy.mapper.SybidaCompanyMarkMapper;
import com.sy.mapper.SybidaTeachMapper;
import com.sy.pojo.*;
import com.sy.redis.RedisOpsUtil;
import com.sy.redis.RedisUtil;
import com.sy.register.DateUtil;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.ElementType;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class CompanyServiceImp implements CompanyService{
    @Autowired
    RedisOpsUtil redisOpsUtil;
    @Autowired
    SybidaCompanyMarkMapper sybidaCompanyMarkMapper;
    @Autowired
    SybidaCompanyMapper sybidaCompanyMapper;
    @Autowired
    SybidaTeachMapper sybidaTeachMapper;
    @Autowired
    RedisUtil redisUtil;
    @Override
    public ResponseResult ecode(String userId) {
        ResponseResult responseResult=new ResponseResult();
        SybidaCompanyMark sybidaCompanyMark=new SybidaCompanyMark();
        sybidaCompanyMark.setMarkAlterDate(new Date());
        sybidaCompanyMark.setMarkTeacherId(userId);
        String tCode=UUID.randomUUID().toString();
        sybidaCompanyMark.setMarkErcodeId(tCode);
        int row=sybidaCompanyMarkMapper.insertSelective(sybidaCompanyMark);
        if(row>0){
            responseResult.setCode(1);
        }else{
            responseResult.setCode(0);
        }
        responseResult.setMessage(String.valueOf(sybidaCompanyMark.getMarkId()));
        return responseResult;
    }

    @Override
    public ResponseResult insertCompany(SybidaCompany sybidaCompany) {
        int row=0;
        ResponseResult responseResult=new ResponseResult();
        String userId=sybidaCompany.getCompanyNull2();
        redisUtil.expire(userId,60);
        String classManagerId = String.valueOf(redisUtil.getObj(userId));
        System.out.println(classManagerId+"=================");
        Integer markId=sybidaCompany.getCompanyMarkId();
        System.out.println(markId+"==================markId");
        if (markId==0){
            sybidaCompany.setCompanyUserId(Integer.valueOf(classManagerId));
            row= sybidaCompanyMapper.insertSelective(sybidaCompany);
        }else {
            System.out.println(markId+"马克");
            SybidaCompanyMark sybidaCompanyMark = sybidaCompanyMarkMapper.selectMark(markId);
            System.out.println(sybidaCompanyMark+"整个集合");
            Integer teacherId=Integer.valueOf(sybidaCompanyMark.getMarkTeacherId());
            System.out.println(teacherId+"============teacherId");
            sybidaCompany.setCompanyUserId(teacherId);
            System.out.println(sybidaCompany.getCompanyUserId()+"================酷酷酷");
            row= sybidaCompanyMapper.insertSelective(sybidaCompany);
        }


       if (row==1){
           responseResult.setCode(1);
           responseResult.setMessage("插入成功");
           return responseResult;
       }else {
           responseResult.setCode(0);
           responseResult.setMessage("插入失败");
       }
        return responseResult;
    }

    @Override
    public ResponseResult selectCompanyInfo(String pageSize,String pageNum) {

        ResponseResult responseResult=new ResponseResult();
        PageHelper.startPage(Integer.valueOf(pageSize),Integer.valueOf(pageNum));
//        SybidaCompanyExample sybidaCompanyExample=new SybidaCompanyExample();
//        SybidaCompanyExample.Criteria criteria = sybidaCompanyExample.createCriteria();
//        criteria.andCompanyNull1EqualTo("1");
//        List<SybidaCompany> sybidaCompanyList= sybidaCompanyMapper.selectByExample(sybidaCompanyExample);
        List<CompanyAndTeach> sybidaCompanyList= sybidaCompanyMapper.selectCompanyAndTeach();
        PageInfo<CompanyAndTeach> pageInfo = new PageInfo<>(sybidaCompanyList);
        if (sybidaCompanyList.size()>0){
            responseResult.setCode(1);
            responseResult.setMessage("查询成功");
            responseResult.setData(pageInfo);
            return  responseResult;
        }else {
            responseResult.setCode(0);
            responseResult.setMessage("查询失败");
        }
        return responseResult;
    }

    @Override
    public ResponseResult deleteOneCompany(String companyId) {
        System.out.println(companyId+"===================");
        ResponseResult responseResult =new ResponseResult();
        SybidaCompany sybidaCompany=new SybidaCompany();
        sybidaCompany.setCompanyId(Integer.valueOf(companyId));
        sybidaCompany.setCompanyNull1("0");
      int row= sybidaCompanyMapper.updateByPrimaryKeySelective(sybidaCompany);
        System.out.println(row+"-----------------------------");
      if (row>0){
          responseResult.setCode(1);
          responseResult.setMessage("删除成功");
          return responseResult;
      }else {
          responseResult.setCode(0);
          responseResult.setMessage("删除失败");
      }
        return responseResult;
    }

    @Override
    public ResponseResult deleteAllCompany(List<Integer> list) {
        int row=0;
        ResponseResult responseResult=new ResponseResult();
        for (int i=0;i<list.size();i++){
            SybidaCompany sybidaCompany=new SybidaCompany();
            sybidaCompany.setCompanyId(list.get(i));
            sybidaCompany.setCompanyNull1("0");
           row+= sybidaCompanyMapper.updateByPrimaryKeySelective(sybidaCompany);
        }
        if (list.size()==row){
            responseResult.setCode(1);
            responseResult.setMessage("全部删除成功");
            return responseResult;
        }else {
            responseResult.setCode(0);
            responseResult.setMessage("全部删除失败");
        }
        return responseResult;
    }

    @Override
    public ResponseResult selectTeacherName(String companyUserId) {
        ResponseResult responseResult=new ResponseResult();
      SybidaTeach sybidaTeach= sybidaTeachMapper.selectByPrimaryKey(Integer.valueOf(companyUserId));
      if (sybidaTeach!=null) {
          responseResult.setCode(1);
          responseResult.setMessage("查询成功");
          responseResult.setData(sybidaTeach);
          return responseResult;
      }else {
          responseResult.setCode(0);
          responseResult.setMessage("查询失败");
      }
      return responseResult;
    }


    @Transactional
    @Override
    public ResponseResult selectCompanyByCompanyId(Integer companyId) {
        ResponseResult responseResult=new ResponseResult();
        CompanyTeacherStudy companyTeacherStudy = sybidaCompanyMapper.selectCompanyByCompanyId(companyId);
        if (companyTeacherStudy!=null) {
            responseResult.setCode(1);
            responseResult.setMessage("查询成功");
            responseResult.setData(companyTeacherStudy);
            return responseResult;
        }else {
            responseResult.setCode(0);
            responseResult.setMessage("查询失败");
        }
        return responseResult;
    }

    @Override
    public ResponseResult selectByCompanyName(String stuName) {
        ResponseResult responseResult=new ResponseResult();
        SybidaCompanyExample sybidaCompanyExample=new SybidaCompanyExample();
        SybidaCompanyExample.Criteria criteria = sybidaCompanyExample.createCriteria();
        criteria.andCompanyNameEqualTo(stuName);
        List<SybidaCompany> companyList= sybidaCompanyMapper.selectByExample(sybidaCompanyExample);
        Integer companyId=companyList.get(0).getCompanyId();
        CompanyTeacherStudy companyTeacherStudy = sybidaCompanyMapper.selectCompanyByCompanyId(companyId);
        if (companyTeacherStudy!=null) {
            responseResult.setCode(1);
            responseResult.setMessage("查询成功");
            responseResult.setData(companyTeacherStudy);
            return responseResult;
        }else {
            responseResult.setCode(0);
            responseResult.setMessage("查询失败");
        }
        return responseResult;
    }
}
