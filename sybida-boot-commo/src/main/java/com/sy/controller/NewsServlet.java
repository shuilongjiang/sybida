package com.sy.controller;

import com.sy.dto.ClassAndStudent;
import com.sy.dto.MessageInfo;
import com.sy.pojo.SybidaClass;
import com.sy.pojo.SybidaStudent;
import com.sy.redis.RedisUtil;
import com.sy.service.NewsService;
import com.sy.vo.ResponseResult;
import org.checkerframework.checker.units.qual.A;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.sql.ResultSet;
import java.util.ArrayList;
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
        return newsService.hadSendMessage(userId,Integer.valueOf(pagesize),Integer.valueOf(pagenum));
    }
    @RequestMapping("hadSendmessagecount")
    public ResponseResult messageSendCount(String userid){
        String userId = String.valueOf(redisUtil.getObj(userid));
        return newsService.messageSendCount(userId);
    }
    @RequestMapping("receivemessagecount")
    public ResponseResult receiveMessageCount(String userid){
        String userId = String.valueOf(redisUtil.getObj(userid));
        return newsService.receiveMessageCount(userId);
    }
    @RequestMapping("receivemessage")
    public ResponseResult receiveMessage(String userid,String pagesize,String pagenum){
        String userId = String.valueOf(redisUtil.getObj(userid));
        return newsService.receiveMessage(Integer.valueOf(userId),Integer.valueOf(pagesize),Integer.valueOf(pagenum));
    }

    @RequestMapping("delectonereceive")
    public ResponseResult delectOneReceive(String receiveId,String userid){
        String userId = String.valueOf(redisUtil.getObj(userid));
        return  newsService.delectOneReceive(receiveId,userId);
    }
    @RequestMapping("isread")
    public ResponseResult isRead(String receiveId,String userid){
        String userId = String.valueOf(redisUtil.getObj(userid));
        return  newsService.isRead(receiveId,userId);
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
    public ResponseResult deleteAllReceive(@RequestBody MessageInfo messageInfo) {
        String userid=messageInfo.getUserId();
        String userId = String.valueOf(redisUtil.getObj(userid));
        List<Integer> list=messageInfo.getList();
        return newsService.deleteAllReceive(list,userId);
    }

    @RequestMapping("selectallstudentbyclass")
    public ResponseResult selectAllStudentByClass(String userid){
        String userId = String.valueOf(redisUtil.getObj(userid));
        List<SybidaClass> sybidaClasses = newsService.selectClass();
        ResponseResult responseResult=new ResponseResult();
        responseResult.setData(newsService.selectStudentOfclass(Integer.parseInt(userId),sybidaClasses));
        return responseResult;
    }
    @Autowired
    RabbitTemplate rabbitTemplate;
    @RequestMapping("sendmessagetomanypeople")
    public ResponseResult SendMessageToManyPeople(@RequestBody MessageInfo messageInfo){
        ResponseResult responseResult=new ResponseResult();
        responseResult.setCode(1);
        rabbitTemplate.convertAndSend("topicExchange", "topic.man", messageInfo);
        return responseResult;
    }
}
