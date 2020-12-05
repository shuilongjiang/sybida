package com.sy.config;

import com.sy.inteceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;
@Configuration
public class WebAppConfigurer implements WebMvcConfigurer {
    //    @Autowired
//    LoginInterceptor loginInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/checkisfirst").excludePathPatterns(urlPass());
    }

    public List<String> urlPass(){
        List<String> list = new ArrayList<>();
        list.add("/login");
        // 。。。。
        return list;
    }
}