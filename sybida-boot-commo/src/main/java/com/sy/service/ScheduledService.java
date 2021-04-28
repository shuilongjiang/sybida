package com.sy.service;

import com.sy.QNY.Qnyutil;
import com.sy.redis.RedisUtil;
import com.sy.zipdownload.DeleteFileAndPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.io.File;
import java.util.List;
import java.util.Set;

@Component
@EnableScheduling
public class ScheduledService {
//    @Scheduled(cron = "0/5 * * * * *")
//    public void scheduled(){
//        System.out.println("=====>>>>>使用cron  {}"+System.currentTimeMillis());
//    }
//    @Scheduled(fixedRate = 5000)
//    public void scheduled1() {
//        System.out.println("=====>>>>>使用fixedRate{}"+System.currentTimeMillis());
//    }
    @Autowired
    RedisUtil redisUtil;
    @Scheduled(fixedDelay = 1000*60*60*24*7)
    public void scheduled2() {
        System.out.println("定时删除开启"+ System.currentTimeMillis());
       DeleteFileAndPackage.deleteDir("D:\\upload\\zip");
        Set<String> keys = redisUtil.getAllkeys("zipdownload::*");
        for(String key : keys){
            System.out.println("定时删除七牛云"+key.substring(13));
            Qnyutil.delete(key.substring(13));
            System.out.println("定时删除redis"+key);
            redisUtil.del(key);
        }
        System.out.println("定时删除结束"+ System.currentTimeMillis());

    }

}
