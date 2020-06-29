package com.example.eurekaserver.listener;

import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRegisteredEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 客户端监听器
 * 对注册事件进行监听
 *
 * @author cy
 */
@Component
public class ClientRegisterListener implements ApplicationListener<EurekaInstanceRegisteredEvent> {
    @Override
    public void onApplicationEvent(EurekaInstanceRegisteredEvent event) {
        String appName = event.getInstanceInfo().getAppName();
        String hostName = event.getInstanceInfo().getHostName();
        System.out.println("有eureka client注册，appName:【"+appName+"】,host:【"+hostName+"】");
    }
}
