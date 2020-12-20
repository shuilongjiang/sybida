package com.sy.service;

import com.sy.vo.ResponseResult;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface NewsService {
    public ResponseResult hadSendMessage(String userId,Integer pagesize,Integer pagenum);
    public ResponseResult receiveMessage(Integer userId,Integer pagesize,Integer pagenum);
    public ResponseResult messageSendCount(String userId);
    public ResponseResult receiveMessageCount(String userId);
    public ResponseResult isRead(String receiveId);
    public ResponseResult delectOneReceive(String receiveId);
    public ResponseResult delectOneSend(String newsId);
    public ResponseResult deleteAllNews( List<Integer> list);
    public ResponseResult deleteAllReceive(List<Integer> list);

}
