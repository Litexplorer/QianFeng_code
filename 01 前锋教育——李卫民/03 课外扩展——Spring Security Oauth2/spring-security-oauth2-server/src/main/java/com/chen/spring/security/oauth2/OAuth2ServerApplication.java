package com.chen.spring.security.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: ChromeChen
 * @Description: 认证服务器，用于获取 token
 * @Date: Created in 14:08 2020/5/24 0024
 * @Modified By:
 */
@SpringBootApplication
public class OAuth2ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OAuth2ServerApplication.class, args);
    }
}
