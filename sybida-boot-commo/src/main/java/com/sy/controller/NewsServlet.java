package com.sy.controller;

import com.sy.redis.RedisUtil;
import com.sy.service.NewsService;
import com.sy.vo.ResponseResult;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("news")
@RestController
public class NewsServlet {
    @Autowired
    RedisUtil redisUtil;
    @Autowired
    NewsService newsService;
    @RequestMapping("hadsendmessage")
    public ResponseResult hadSendMessage(String userid,String pagesize,String pagenum){
        String userId = String.valueOf(redisUtil.getObj(userid));
        redisUtil.expire(userId,60);
        return newsService.hadSendMessage(userId,Integer.valueOf(pagesize),Integer.valueOf(pagenum));
    }


    @RequestMapping("hadSendmessagecount")
    public ResponseResult messageSendCount(String userid){
        String userId = String.valueOf(redisUtil.getObj(userid));
        redisUtil.expire(userId,60);
        return newsService.messageSendCount(userId);
    }
    @RequestMapping("receivemessagecount")
    public ResponseResult receiveMessageCount(String userid){
        String userId = String.valueOf(redisUtil.getObj(userid));
        redisUtil.expire(userId,60);
        return newsService.receiveMessageCount(userId);
    }
    @RequestMapping("receivemessage")
    public ResponseResult receiveMessage(String userid,String pagesize,String pagenum){
        String userId = String.valueOf(redisUtil.getObj(userid));
        redisUtil.expire(userId,60);
        return newsService.receiveMessage(Integer.valueOf(userId),Integer.valueOf(pagesize),Integer.valueOf(pagenum));
    }

    @RequestMapping("delectonereceive")
    public ResponseResult delectOneReceive(String receiveId){
        return  newsService.delectOneReceive(receiveId);
    }
    @RequestMapping("isread")
    public ResponseResult isRead(String receiveId){
     return  newsService.isRead(receiveId);
    }

    @RequestMapping("delectonesend")
    public ResponseResult delectOneSend(String newsId){
       return newsService.delectOneSend(newsId);
    }
    @RequestMapping("deleteallnews")
    public ResponseResult deleteAllNews(@RequestBody List<Integer> list) {
        return   newsService.deleteAllNews(list);
    }
    @RequestMapping("deleteallreceive")
    public ResponseResult deleteAllReceive(@RequestBody List<Integer> list) {
        return newsService.deleteAllReceive(list);
    }
}
