package com.chen.hello.spring.cloud.web.admin.ribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 15:42 2019/10/18 0018
 * @Modified By:
 */
@Configuration
public class RestTemplateConfiguration {

    @Bean
    @LoadBalanced   // ①调用服务提供方时，会负载均衡地调用
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
