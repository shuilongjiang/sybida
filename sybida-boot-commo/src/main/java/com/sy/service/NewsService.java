package com.sy.service;

import com.sy.vo.ResponseResult;

public interface NewsService {
    ResponseResult hadSendMessage(String userid,Integer pagesize,Integer pagenum);
}
