package com.chngc;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Hello world!
 */
@SpringBootApplication(scanBasePackages = {"com.chngc"})
@ImportResource(/*{"classpath:conf/dubbo-consumer.xml"}*/)
@MapperScan(basePackages = {"com.chngc.dao"})
@EnableTransactionManagement
@Slf4j
public class App {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication app = new SpringApplication(App.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
        log.info("项目启动完成!");
    }
    //接口访问：http://192.168.170.143:8686/springboot/swagger-ui.html#/
}
