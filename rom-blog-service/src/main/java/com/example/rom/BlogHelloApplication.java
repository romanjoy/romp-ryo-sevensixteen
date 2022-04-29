package com.example.rom;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.example.rom.mapper")
public class BlogHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogHelloApplication.class, args);
    }
}
