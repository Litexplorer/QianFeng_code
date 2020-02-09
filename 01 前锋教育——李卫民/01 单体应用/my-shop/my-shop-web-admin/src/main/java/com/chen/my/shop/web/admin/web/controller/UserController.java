package com.chen.my.shop.web.admin.web.controller;

import com.chen.my.shop.commons.dto.BaseResult;
import com.chen.my.shop.domain.TbUser;
import com.chen.my.shop.web.admin.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
    public String list(Model model){
        List<TbUser> all = tbUserService.findAll();
        model.addAttribute("users", all);
        return "user_list";
    }

    /**
     * 跳转到 form 页面
     * @return
     */
    @RequestMapping(value = "/form", method = {RequestMethod.GET})
    public String form() {
        return "form";
    }


    /**
     * 保存用户信息到数据库
     * @param tbUser
     * @return
     */
    @RequestMapping(value = "/save", method = {RequestMethod.POST})
    @ResponseBody
    public BaseResult save(TbUser tbUser) {
        BaseResult result = BaseResult.success();

        result.setMessage("现在就不进行校验了");
        System.out.println(result.getMessage());
        return result;
    }
}
