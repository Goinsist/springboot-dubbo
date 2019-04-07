package com.gongyu.springboot.dubbo.consumer.quickstart;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gongyu.springboot.dubbo.ServiceAPI;
import org.springframework.stereotype.Component;

@Component
public class QuickStartConsumer {
    @Reference()
    ServiceAPI serviceAPI;
    public void  sendMessage(String message){
        System.out.println(serviceAPI.sendMessage(message));
    }
}
