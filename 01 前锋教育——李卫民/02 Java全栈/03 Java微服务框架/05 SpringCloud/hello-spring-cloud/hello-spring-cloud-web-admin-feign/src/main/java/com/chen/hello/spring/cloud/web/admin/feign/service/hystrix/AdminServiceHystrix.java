package com.chen.hello.spring.cloud.web.admin.feign.service.hystrix;

import com.chen.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 12:24 2019-10-19
 * @Modified By:
 */
@Component
public class AdminServiceHystrix implements AdminService {
    
    @Override
    public String sayHi(String message) {
        String format = String.format("你好，你的消息是：%s, 但是请求发生错误了！", message);

        return format;
    }
}
