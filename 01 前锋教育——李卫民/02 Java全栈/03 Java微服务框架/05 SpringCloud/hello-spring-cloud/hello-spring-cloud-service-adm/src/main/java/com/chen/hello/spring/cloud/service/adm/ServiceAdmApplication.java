package com.chen.hello.spring.cloud.service.adm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 14:59 2019/10/18 0018
 * @Modified By:
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceAdmApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceAdmApplication.class, args);
    }
}
