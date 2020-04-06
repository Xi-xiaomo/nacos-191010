package com.atguigu.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Administrator
 * @create 2020-04-02 16:58
 */
@SpringBootApplication//必须加
@EnableDiscoveryClient//注册需要加，不加也可以
//@EnableFeignClients(basePackage={""})//扫描远程调用接口的基本包
@EnableFeignClients//开启自动远程调用，必须加
public class NacosConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosConsumerApplication.class, args);
    }
}
