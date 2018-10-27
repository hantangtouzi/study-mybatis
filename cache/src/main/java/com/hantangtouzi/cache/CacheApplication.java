package com.hantangtouzi.cache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hantangtouzi.cache.mapper")
public class CacheApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(CacheApplication.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);
    }
}
