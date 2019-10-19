package com.chen.hello.spring.cloud.web.admin.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 11:41 2019-10-19
 * @Modified By:
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class WebAdminFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebAdminFeignApplication.class, args);
    }
}
