package com.example.serverclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerClientApplication.class, args);
    }

}
