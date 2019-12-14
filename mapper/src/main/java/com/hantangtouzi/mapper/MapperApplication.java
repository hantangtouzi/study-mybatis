package com.hantangtouzi.mapper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author WilliamChang.
 * Created on 2019-12-14 20:02:05
 */

@SpringBootApplication
@MapperScan("com.hantangtouzi.mapper.dao")
public class MapperApplication {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(MapperApplication.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);
    }
}
