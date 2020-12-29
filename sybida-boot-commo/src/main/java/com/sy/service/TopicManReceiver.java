package com.sy.service;



import com.sy.dto.MessageInfo;
import com.sy.mapper.SybidaNewsMapper;
import com.sy.mapper.SybidaReceiveMapper;
import com.sy.pojo.SybidaNews;
import com.sy.pojo.SybidaReceive;
import com.sy.redis.RedisUtil;
import org.checkerframework.checker.units.qual.A;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
@RabbitListener(queues = "man")
public class TopicManReceiver {
     @Autowired
     SybidaNewsMapper sybidaNewsMapper;
     @Autowired
    RedisUtil redisUtil;
     @Autowired
    SybidaReceiveMapper sybidaReceiveMapper;
    @RabbitHandler
    public void process(MessageInfo messageInfo) {
        System.out.println("我是消息队列");
        Date data = new Date();
        String UserId= String.valueOf(redisUtil.getObj(messageInfo.getUserId()));
        SybidaNews sybidaNews=new SybidaNews();
        sybidaNews.setNewsNull1("1");
        sybidaNews.setNewsReadPeople(0);
        sybidaNews.setNewsTest(messageInfo.getMessageInfo());
        sybidaNews.setNewsAlterTime(data);
        sybidaNews.setNewsSendTime(data);
        sybidaNews.setNewsUserId(Integer.valueOf(UserId));
        sybidaNewsMapper.insertSelective(sybidaNews);

        List<Integer> list=messageInfo.getList();
        List<SybidaReceive> listRE=new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            SybidaReceive sybidaReceive=new SybidaReceive();
            sybidaReceive.setReceiveNull1("1");
            sybidaReceive.setReceiveIsRead((byte) 0);
            sybidaReceive.setReceiveUserId(list.get(i));
            sybidaReceive.setReceiveAlterTime(data);

            sybidaReceive.setReceiveId(sybidaNews.getNewsId());
            listRE.add(sybidaReceive);
        }
        sybidaReceiveMapper.insertManyMessage(listRE);
        System.out.println("信息插入成功--->我是消息队列");
    }
}
