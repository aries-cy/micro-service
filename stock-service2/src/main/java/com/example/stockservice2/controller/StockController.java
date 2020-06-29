package com.example.stockservice2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("stock")
public class StockController {

    @GetMapping("stockService")
    public String stockService(){
        String stock = "stock2 success!";
        System.out.println(stock);
        return stock;
    }
}