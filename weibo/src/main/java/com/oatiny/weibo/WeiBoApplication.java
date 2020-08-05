package com.oatiny.weibo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.oatiny.weibo.mapper")
public class WeiBoApplication {
    public static void main(String[] args) {
        SpringApplication.run(WeiBoApplication.class, args);
    }
}
