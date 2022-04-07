package com.altiusdigital.diskover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiskoverApplication {

    public static void main(String[] args) {
        SpringApplication.run (DiskoverApplication.class, args);
    }

}
