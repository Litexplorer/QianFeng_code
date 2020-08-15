package com.chen.hello.spring.cloud.web.admin.ribbon.web;

import com.chen.hello.spring.cloud.web.admin.ribbon.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 15:49 2019/10/18 0018
 * @Modified By:
 */
@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String hi(@RequestParam String message) {
        String hi = adminService.hi(message);
        return hi;
    }
}
