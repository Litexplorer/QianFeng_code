package com.chen.my.shop.web.admin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 17:24 2020/2/4 0004
 * @Modified By:
 */
@Controller
public class MainController {

    @RequestMapping(value = "/main", method = {RequestMethod.GET})
    public String main() {
        return "main";
    }
}
