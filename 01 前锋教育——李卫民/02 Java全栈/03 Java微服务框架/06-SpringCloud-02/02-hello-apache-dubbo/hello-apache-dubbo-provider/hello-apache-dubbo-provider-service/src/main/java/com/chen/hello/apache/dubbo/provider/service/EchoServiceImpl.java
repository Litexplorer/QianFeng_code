package com.chen.hello.apache.dubbo.provider.service;

import com.chen.apache.dubbo.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 4:05 2020/8/16 0016
 * @Modified By:
 */
@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String s) {
        return "『消息提供者』返回的消息为：" + s;
    }
}
