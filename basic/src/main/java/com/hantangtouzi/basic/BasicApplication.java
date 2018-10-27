package com.hantangtouzi.basic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hantangtouzi.basic.mapper")
public class BasicApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(BasicApplication.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);
    }
}