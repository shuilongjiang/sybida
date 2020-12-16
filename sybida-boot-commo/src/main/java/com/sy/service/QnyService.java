package com.sy.service;

import com.sy.vo.ResponseResult;
import org.springframework.web.multipart.MultipartFile;

public interface QnyService {
    public ResponseResult test(MultipartFile file);
    public  ResponseResult  delete(String fileKey);
}
