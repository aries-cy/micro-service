package com.example.orderservice.config;

import com.example.orderservice.interceptor.MyFeignInterceptor;
import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * feign自定义配置
 *
 * @author cy
 */
@Configuration
public class FeignConfiguration {

    @Bean
    public RequestInterceptor requestInterceptor(){
        return new MyFeignInterceptor();
    }
}
