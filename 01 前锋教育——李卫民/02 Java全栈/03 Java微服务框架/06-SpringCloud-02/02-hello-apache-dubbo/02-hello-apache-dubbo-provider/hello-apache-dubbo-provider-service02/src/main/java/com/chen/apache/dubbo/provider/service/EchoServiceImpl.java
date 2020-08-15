package com.chen.apache.dubbo.provider.service;

import org.apache.dubbo.config.annotation.Service;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 2:59 2020/8/16 0016
 * @Modified By:
 */
@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService{
    @Override
    public String echo(String string) {
        return "『服务提供者』返回的消息：" + string;
    }
}
