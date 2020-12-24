package com.sy.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sy.MD5.MD5Utils;
import com.sy.dto.CompanyAndTeach;
import com.sy.mapper.SybidaCompanyMapper;
import com.sy.mapper.SybidaCompanyMarkMapper;
import com.sy.mapper.SybidaTeachMapper;
import com.sy.pojo.*;
import com.sy.redis.RedisOpsUtil;
import com.sy.register.DateUtil;
import com.sy.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        ResponseResult responseResult=new ResponseResult();
       int row= sybidaCompanyMapper.insertSelective(sybidaCompany);
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
        ResponseResult responseResult =new ResponseResult();
        SybidaCompany sybidaCompany=new SybidaCompany();
        sybidaCompany.setCompanyId(Integer.valueOf(companyId));
        sybidaCompany.setCompanyNull1("0");
      int row= sybidaCompanyMapper.updateByPrimaryKeySelective(sybidaCompany);
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
}
