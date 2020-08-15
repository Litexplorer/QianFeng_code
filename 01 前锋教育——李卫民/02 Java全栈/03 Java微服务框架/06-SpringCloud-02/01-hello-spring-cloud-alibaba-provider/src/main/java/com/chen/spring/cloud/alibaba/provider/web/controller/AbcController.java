package com.chen.spring.cloud.alibaba.provider.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: ChromeChen
 * @Description: Provider 控制器的测试接口
 * @Date: Created in 16:19 2020/7/29 0029
 * @Modified By:
 */
@RestController
public class AbcController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/echo/{string}", method = {RequestMethod.GET})
    public String echo(@PathVariable String string) {

        return "This is Provider message : " + string;
    }

    @GetMapping("/echo/lb")
    public String lb(HttpServletRequest request, HttpServletResponse response ) {

        return "当前的服务的端口是：" + port;
    }
}
