package com.example.zuulservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulServiceApplication {

    /**
     * Zuul的主要功能:
     *      1.路由转发.同时支持负载均衡
     *      2.过滤器
     *
     */
    public static void main(String[] args) {
        SpringApplication.run(ZuulServiceApplication.class, args);
    }

}
