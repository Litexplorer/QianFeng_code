package com.chen.hello.spring.cloud.web.admin.ribbon.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 15:41 2019/10/18 0018
 * @Modified By:
 */
@Service
public class AdminService {

    @Resource
    private RestTemplate restTemplate;

    public String hi(String message) {
        return restTemplate
                .getForObject("http://HELLO-SPRING-CLOUD-SERVICE-ADMIN/hi?message=" + message,
                        String.class);
    }
}
