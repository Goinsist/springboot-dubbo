package com.gongyu.springboot.dubbo.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.gongyu.springboot.dubbo.consumer.quickstart.QuickStartConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDubboConfiguration
public class ConsumerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run=
        SpringApplication.run(ConsumerApplication.class, args);
       QuickStartConsumer quickStartConsumer= (QuickStartConsumer)run.getBean("quickStartConsumer");
       quickStartConsumer.sendMessage("大法师多所大所大多撒");
    }

}
