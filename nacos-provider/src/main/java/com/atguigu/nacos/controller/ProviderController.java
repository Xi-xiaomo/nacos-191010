package com.atguigu.nacos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试服务提供方   接口    对接的入口   接口
 */
@RestController
@RefreshScope
public class ProviderController {


    @Value("${myName}")
    private String myName;
    //读取Jdbc redis
    @Value("${redis.host}")
    private String redisHost;
    @Value("${mysql.driver.url}")
    private String url;

    //测试
    @GetMapping("/hello")
    public String hello(){
        return "Nacos Provider:" + myName +
                ":::redis:" + redisHost + ":::url:" + url;
    }
}
