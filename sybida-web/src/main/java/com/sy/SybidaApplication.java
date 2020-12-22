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
        logger.trace("启动--------------------------");

    }
}
