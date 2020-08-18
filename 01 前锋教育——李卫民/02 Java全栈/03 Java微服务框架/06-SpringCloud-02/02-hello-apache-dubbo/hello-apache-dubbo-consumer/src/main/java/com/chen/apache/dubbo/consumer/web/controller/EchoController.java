package com.chen.apache.dubbo.consumer.web.controller;

import com.chen.apache.dubbo.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 4:14 2020/8/16 0016
 * @Modified By:
 */
@RestController
@RefreshScope
@RequestMapping("/echo")
public class EchoController {

    @Reference(version = "1.0.0")
    private EchoService echoService;

    @Value("${user.name}")
    private String username;

    @GetMapping(value = "/{string}")
    public String echo(@PathVariable String string) {
        return echoService.echo(string);
    }

    
    @GetMapping(value = "/refresh")
    public String refresh() {
        return echoService.echo("consumer message is : " + username);
    }

}
