package com.sy.service;

import com.sy.vo.ResponseResult;

public interface StudentUploadVitaeService {
    public  Integer UploadVitae(String userId,String studyId,String filename);
    public ResponseResult personalVitae(String userId, String isDelete);
}
