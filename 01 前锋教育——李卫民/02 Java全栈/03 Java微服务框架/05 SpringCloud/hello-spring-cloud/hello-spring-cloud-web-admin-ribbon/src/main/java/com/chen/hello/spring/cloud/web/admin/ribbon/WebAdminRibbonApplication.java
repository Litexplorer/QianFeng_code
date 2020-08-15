package com.chen.hello.spring.cloud.web.admin.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 15:40 2019/10/18 0018
 * @Modified By:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class WebAdminRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebAdminRibbonApplication.class, args);
    }
}
