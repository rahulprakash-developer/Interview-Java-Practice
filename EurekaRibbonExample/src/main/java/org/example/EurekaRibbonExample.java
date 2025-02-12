package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaRibbonExample {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SpringApplication.run(EurekaRibbonExample.class,args);
    }
}