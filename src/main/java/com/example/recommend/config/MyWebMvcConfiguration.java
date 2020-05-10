package com.example.recommend.config;

import com.example.recommend.component.AdminLoginHandlerInterceptor;
import com.example.recommend.component.LoginHandlerInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebMvcConfiguration implements WebMvcConfigurer {

    @Autowired
    LoginHandlerInterceptor loginHandlerInterceptor;

    @Autowired
    AdminLoginHandlerInterceptor adminLoginHandlerInterceptor;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/login");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }

    //注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截所有的请求
        //registry.addInterceptor(loginHandlerInterceptor).addPathPatterns("/adminMovie");
        //registry.addInterceptor(loginHandlerInterceptor).addPathPatterns("/rating");

        registry.addInterceptor(adminLoginHandlerInterceptor).addPathPatterns("/adminMovie/deleteUser");

    }

}

