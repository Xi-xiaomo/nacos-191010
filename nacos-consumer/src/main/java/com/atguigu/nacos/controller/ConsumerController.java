package com.atguigu.nacos.controller;

import com.atguigu.nacos.feign.ProviderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @create 2020-04-02 17:27
 */

/**
 *  消费方
 */
@RestController
public class ConsumerController {

    @Value("${myName}")
    private String myName;
    //第一次远程调用
    @Autowired
    private ProviderFeign providerFeign;
    //请求
    @GetMapping("/hi")
    public String hi() {
        return "Nacos Consumer:" + myName + ":::" + providerFeign.hello();
    }
}
