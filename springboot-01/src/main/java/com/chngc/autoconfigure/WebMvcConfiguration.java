package com.chngc.autoconfigure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

/*    @Bean
    public LogInterceptor getLogInterceptor() {
        return new LogInterceptor();
    }

    @Bean
    public LoginInterceptor getLoginInterceptor() {
        return new LoginInterceptor();
    }

    *//**
     * 增加拦截
     * @param registry
     *//*
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getLogInterceptor()).addPathPatterns("*//**");
     registry.addInterceptor(getLoginInterceptor()).addPathPatterns("/member*//**");
     }*/
}
