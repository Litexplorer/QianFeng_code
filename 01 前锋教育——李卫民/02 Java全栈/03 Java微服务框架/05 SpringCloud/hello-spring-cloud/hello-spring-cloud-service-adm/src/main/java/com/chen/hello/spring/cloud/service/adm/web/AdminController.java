package com.chen.hello.spring.cloud.service.adm.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 15:10 2019/10/18 0018
 * @Modified By:
 */
@RestController
public class AdminController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi(String message) {

        return String.format("你好， 你的消息是：%s I am from port: %s", message, port);
    }
}
