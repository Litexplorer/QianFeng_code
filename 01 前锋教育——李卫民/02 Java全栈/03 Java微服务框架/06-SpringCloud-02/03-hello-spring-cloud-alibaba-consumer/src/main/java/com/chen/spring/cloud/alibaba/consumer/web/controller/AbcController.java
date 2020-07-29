package com.chen.spring.cloud.alibaba.consumer.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 17:36 2020/7/29 0029
 * @Modified By:
 */
@RestController
public class AbcController {

    private final RestTemplate restTemplate;

    @Autowired
    public AbcController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping(value = "/echo/{str}", method = {RequestMethod.GET})
    public String echo(@PathVariable String str) {
        // 使用服务名请求服务提供者
        return restTemplate.getForObject("http://service-provider/echo/" + str + "从『服务消费者』转到『服务提供者』……", String.class);
    }
}
