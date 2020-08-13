package com.chen.spring.cloud.alibaba.consumer.service.fallback;

import com.chen.spring.cloud.alibaba.consumer.service.EchoService;
import org.springframework.stereotype.Component;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 14:59 2020/8/13 0013
 * @Modified By:
 */
@Component
public class EchoServiceFallback implements EchoService {

    @Override
    public String echo(String string) {
        return "echo 方法被熔断！";
    }

    @Override
    public String lb() {
        return "lb 方法被熔断！";
    }
}
