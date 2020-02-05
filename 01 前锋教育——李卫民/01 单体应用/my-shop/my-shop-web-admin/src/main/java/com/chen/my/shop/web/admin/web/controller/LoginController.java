package com.chen.my.shop.web.admin.web.controller;

import com.chen.my.shop.commons.utils.ConstantUtils;
import com.chen.my.shop.domain.TbUser;
import com.chen.my.shop.web.admin.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 15:20 2020/2/4 0004
 * @Modified By:
 */
@Controller
public class LoginController {

    @Autowired
    private TbUserService tbUserService;
    /**
     * 跳转到 main 页面
     * @return
     */
    @RequestMapping(value = {"", "/login"}, method = {RequestMethod.GET})
    public String login() {
        return "login";
    }


    @RequestMapping(value = "/login", method = {RequestMethod.POST})
    public String login(String email, String password, HttpServletRequest request, Model model) {

        TbUser tbUser = tbUserService.login(email, password);
        if (tbUser == null) {
            model.addAttribute("message", "邮箱或密码错误！");
            return this.login();
        }

        request.getSession().setAttribute(ConstantUtils.SESSION_USER, tbUser);
        return String.format("redirect:/main", ConstantUtils.SERVER_NAME);
    }

    @RequestMapping(value = "/logout", method = {RequestMethod.GET})
    public String logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return "login";
    }

}