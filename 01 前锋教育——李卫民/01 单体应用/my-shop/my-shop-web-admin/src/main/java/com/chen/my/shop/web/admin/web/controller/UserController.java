package com.chen.my.shop.web.admin.web.controller;

import com.chen.my.shop.web.admin.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 16:19 2020/2/5 0005
 * @Modified By:
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private TbUserService tbUserService;

    @RequestMapping(value = "/list", method = {RequestMethod.GET})
    public String list(){

        return "user_list";
    }
}
