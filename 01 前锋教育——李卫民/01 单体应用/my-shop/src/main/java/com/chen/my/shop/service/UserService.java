package com.chen.my.shop.service;

import com.chen.my.shop.bean.User;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 21:31 2019-10-23
 * @Modified By:
 */
public interface UserService {

    User login(String email, String password);
}
