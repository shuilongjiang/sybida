package com.sy.service;

import com.sy.vo.ResponseResult;

import java.util.Map;

public interface DownLoadVitaeService {
    String  downloadVitaeZip(Map<String , String> map);
    ResponseResult selectEvaForVitae(String vitaeId);
    ResponseResult selectComment(String userid);
}
