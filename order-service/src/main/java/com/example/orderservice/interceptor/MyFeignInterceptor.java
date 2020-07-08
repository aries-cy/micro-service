package com.example.orderservice.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
/**
 * feign拦截器，设置token
 *
 * @author cy
 */
public class MyFeignInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate template) {
        System.out.println("feign拦截器...");
        //设置token
        template.header("token","token...");
    }
}
