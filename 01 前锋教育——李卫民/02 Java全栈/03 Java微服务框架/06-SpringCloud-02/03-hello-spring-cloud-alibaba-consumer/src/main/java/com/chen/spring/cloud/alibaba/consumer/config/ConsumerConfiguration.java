package com.chen.spring.cloud.alibaba.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 17:23 2020/7/29 0029
 * @Modified By:
 */
@Configuration
public class ConsumerConfiguration {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
