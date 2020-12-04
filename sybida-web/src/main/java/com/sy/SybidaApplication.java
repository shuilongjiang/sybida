package com.sy;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.sy.filter")
@MapperScan(basePackages = "com.sy.mapper")
public class SybidaApplication {
   private static Logger logger = LoggerFactory.getLogger(SybidaApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(SybidaApplication.class, args);
        logger.trace("启动--------------------------");
//        logger.debug("debug--------------------------");
//        logger.info("info--------------------------");
//        logger.warn("warn--------------------------");
//        logger.error("error--------------------------");
    }
}
