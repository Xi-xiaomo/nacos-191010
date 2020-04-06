package com.atguigu.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 启动类 或 引导类
 * @SpringBootApplication : 必须加   自动加载配置类
 * @EnableDiscoveryClient : 注册需要加  测试发现 不加也行   可有可无
 */
@SpringBootApplication














































@EnableDiscoveryClient
public class NacosProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosProviderApplication.class,args);
    }
}
