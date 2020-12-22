package com.sy;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


@SpringBootApplication
@ServletComponentScan(basePackages = "com.sy.filter")
@MapperScan(basePackages = "com.sy.mapper")
public class SybidaApplication {
   private static Logger logger = LoggerFactory.getLogger(SybidaApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(SybidaApplication.class, args);
//        Runnable runnable = new Runnable() {
//            //run方法中是定时执行的操作
//            @Override
//            public void run() {
//                System.out.println(new Date()+"我来了我来了");
//
//            }
//        };
//        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
//        /*
//         * 参数一:command：执行线程
//         * 参数二:initialDelay：初始化延时
//         * 参数三:period：两次开始执行最小间隔时间
//         * 参数四:unit：计时单位
//         */
//        service.scheduleAtFixedRate(runnable, 0, 60, TimeUnit.SECONDS);

        logger.trace("启动--------------------------");
//        logger.debug("debug--------------------------");
//        logger.info("info--------------------------");
//        logger.warn("warn--------------------------");
//        logger.error("error--------------------------");
    }
}
