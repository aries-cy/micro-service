package com.example.orderservice.service;


import com.example.orderservice.service.impl.StockClientHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "STOCK-SERVICE",fallback = StockClientHystric.class)
public interface StockClient {

    @RequestMapping("/stock/stockService")
    String feignTest();

}
