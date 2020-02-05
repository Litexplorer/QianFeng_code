package com.chen.my.shop.web.admin.service;

import com.chen.my.shop.domain.TbUser;

import java.util.List;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 11:04 2020/2/5 0005
 * @Modified By:
 */
public interface TbUserService {

    TbUser login(String email, String password);

    /**
     * 查找所有的用户
     * @return
     */
    List<TbUser> findAll();
}
