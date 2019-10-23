package com.chen.my.shop.service.impl;

import com.chen.my.shop.bean.User;
import com.chen.my.shop.dao.UserDao;
import com.chen.my.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 21:32 2019-10-23
 * @Modified By:
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User login(String email, String password) {
        User user = null;

        user = userDao.getUserByEmailAndPassword(email, password);

        return user;
    }
}
