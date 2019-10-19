package com.chen.hello.spring.cloud.web.admin.feign.web;

import com.chen.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 11:50 2019-10-19
 * @Modified By:
 */
@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi(String message) {
        String hi = adminService.sayHi(message);
        return hi;
    }
}
