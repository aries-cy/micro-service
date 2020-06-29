package com.example.stockservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {

    @GetMapping("/stockService")
    public String stockService(){
        String stock = "stock success!";
        System.out.println(stock);
        return stock;
    }
}
