package com.chen.spring.cloud.alibaba.consumer.web.controller;

import com.chen.spring.cloud.alibaba.consumer.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 17:36 2020/7/29 0029
 * @Modified By:
 */
@RestController
@RefreshScope
public class AbcController {

    private final RestTemplate restTemplate;

    @Autowired
    private EchoService echoService;

    @Autowired
    public AbcController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping(value = "/echo/{str}", method = {RequestMethod.GET})
    public String echo(@PathVariable String str) {
        // 使用服务名请求服务提供者
        String echo = echoService.echo(str);
        return "从『消费者』返回的消息为： " + echo;
    }

    @GetMapping("/echo/lb")
    public String lb(HttpServletRequest request, HttpServletResponse response ) {

        return "从服务提供者返回的消息为：" + echoService.lb();
    }

    @Value("${user.name}")
    private String username;

    @GetMapping("/echo/config")
    public String config(HttpServletRequest request, HttpServletResponse response ) {

        return String.format("配置文件中的值为：【%s】", username);
    }


}
