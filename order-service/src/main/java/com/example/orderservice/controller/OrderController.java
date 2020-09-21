package com.example.orderservice.controller;

import annotation.AspectLog;
import com.example.orderservice.service.StockClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
public class OrderController {

    /**
     * 负载均衡
     */
    @Resource
    private RestTemplate restTemplate;

    @Resource
    private StockClient stockClient;


    @AspectLog
    @GetMapping("/orderService")
    public String orderService(){
        String order = "order success!";
        System.out.println(order);
        //去调用库存服务，实现ribbon负载均衡
        String result = restTemplate.getForObject("http://STOCK-SERVICE/stock/stockService", String.class);
        return result;
    }

    /**
     * feign调用测试
     * Feign 采用的是基于接口的注解
     * Feign 整合了ribbon，具有负载均衡的能力
     * 整合了Hystrix，具有熔断的能力
     * @return string
     */
    @GetMapping("/feignTest")
    public String feignTest(){
        return stockClient.feignTest();
    }

}
