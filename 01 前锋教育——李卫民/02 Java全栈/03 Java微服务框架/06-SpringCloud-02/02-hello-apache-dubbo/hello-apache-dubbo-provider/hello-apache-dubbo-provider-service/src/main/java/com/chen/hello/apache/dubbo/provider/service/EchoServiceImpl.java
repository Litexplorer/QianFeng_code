package com.chen.hello.apache.dubbo.provider.service;

import com.chen.apache.dubbo.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 4:05 2020/8/16 0016
 * @Modified By:
 */
@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {

    @Value("${dubbo.protocol.port}")
    private String port;

    @Override
    public String echo(String s) {
        return "the port is :" + port;
    }
}
