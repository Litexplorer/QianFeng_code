package com.chen.spring.cloud.alibaba.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: ChromeChen
 * @Description: 该接口用于 Feign 声明式调用
 * @Date: Created in 14:17 2020/8/7 0007
 * @Modified By:
 */
@FeignClient(value = "service-provider")
public interface EchoService {

    @GetMapping(value = "/echo/{string}")
    String echo(@PathVariable("string") String string);

    @GetMapping("/echo/lb")
    String lb();
}
