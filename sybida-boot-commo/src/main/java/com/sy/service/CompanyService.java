package com.sy.service;

import com.sy.pojo.SybidaCompany;
import com.sy.vo.ResponseResult;

public interface CompanyService {
    ResponseResult ecode(String userId);
    ResponseResult insertCompany(SybidaCompany sybidaCompany);
}
