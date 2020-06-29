package com.example.stockservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StockService2Application {

    public static void main(String[] args) {
        SpringApplication.run(StockService2Application.class, args);
    }

}
