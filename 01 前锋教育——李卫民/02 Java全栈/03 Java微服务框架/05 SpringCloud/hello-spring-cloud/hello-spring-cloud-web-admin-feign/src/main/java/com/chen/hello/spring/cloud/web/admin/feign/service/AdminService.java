package com.chen.hello.spring.cloud.web.admin.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 11:48 2019-10-19
 * @Modified By:
 */
@FeignClient("HELLO-SPRING-CLOUD-SERVICE-ADMIN")
public interface AdminService {

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam("message") String message);    // 注意，必须带
}
