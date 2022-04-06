package com.example.rom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryApplication {

    public static void main(String[] args) {
        System.out.println("Get start the eureka server===========================01");
        SpringApplication.run(DiscoveryApplication.class, args);
        System.out.println("Get start the eureka server===========================02");
    }
}
