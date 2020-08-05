package com.oatiny.hrm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.oatiny.hrm.mapper")
public class HrmApplication {
    public static void main(String[] args) {
        SpringApplication.run(HrmApplication.class, args);
    }
}
