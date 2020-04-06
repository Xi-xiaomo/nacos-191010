package com.atguigu.nacos.feign;

/**
 * @author Administrator
 * @create 2020-04-02 17:39
 */

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *  远程调用接口
 */
@FeignClient(name = "nacos-provider")
public interface ProviderFeign {
    //远程掉用的方法
    //测试
    @GetMapping("/hello")
    public String hello();
}
