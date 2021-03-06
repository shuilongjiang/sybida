package com.sy.filter;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "EcondFilter",urlPatterns = "/*")
public class EcondFilter implements Filter {
    @Override
    public void destroy() {
    }
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {


        System.out.println("filter");
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        response.setHeader("Access-control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,content-type,token");
        response.setHeader("Access-Control-Expose-Headers", "token");
        response.addHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT");
        if ("OPTIONS".equals(request.getMethod())) {
            System.out.println("options");
            response.setStatus(HttpStatus.ACCEPTED.value());
            return;
        } else {
            chain.doFilter(request, response);
        }
//对于一些跨域请求，会先发一个OPTIONS请求（预检请求），来看目的站点是否接受，以确保请求对于目的站点服务器是安全的。


    }
    @Override
    public void init(FilterConfig config) throws ServletException {

    }

}
