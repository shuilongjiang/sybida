package com.sy.service;

import com.sy.vo.ResponseResult;

public interface NewsService {
    public ResponseResult hadSendMessage(String userId,Integer pagesize,Integer pagenum);
    public ResponseResult receiveMessage(Integer userId,Integer pagesize,Integer pagenum);
    public ResponseResult messageSendCount(String userId);
    public ResponseResult receiveMessageCount(String userId);
}
