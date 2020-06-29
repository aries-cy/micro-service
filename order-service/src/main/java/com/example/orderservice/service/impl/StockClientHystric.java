package com.example.orderservice.service.impl;

import com.example.orderservice.service.StockClient;
import org.springframework.stereotype.Component;

/**
 * 断路器，当feign调不通时，会默认返回这个类的数据
 */
@Component
public class StockClientHystric implements StockClient {

    @Override
    public String feignTest() {
        return "sorry...";
    }
}
