package com.sy.service;

import com.sy.pojo.SybidaCompany;
import com.sy.vo.ResponseResult;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CompanyService {
    ResponseResult ecode(String userId);
    ResponseResult insertCompany(SybidaCompany sybidaCompany);
    ResponseResult selectCompanyInfo(String pageSize,String pageNum);
    ResponseResult deleteOneCompany(String companyId);
    ResponseResult deleteAllCompany(List<Integer> list);
    ResponseResult selectTeacherName(String companyUserId);
    ResponseResult selectCompanyByCompanyId(Integer companyUserId);
    public ResponseResult selectByCompanyName(String stuName);
}
