package com.sy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.sy.filter")
@MapperScan(basePackages = "com.sy.mapper")
public class SybidaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SybidaApplication.class, args);
    }
}
