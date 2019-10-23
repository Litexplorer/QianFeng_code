package com.chen.my.shop.dao.impl;

import com.chen.my.shop.bean.User;
import com.chen.my.shop.dao.UserDao;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 21:27 2019-10-23
 * @Modified By:
 */
public class UserDaoImpl implements UserDao {
    @Override
    public User getUserByEmailAndPassword(String email, String password) {
        User user = null;

        if("chen@163.com".equals(email)) {
            if ("123456".equals(password)) {
                user = new User().setEmail(email).setUsername("chen");
            }
        }

        return user;
    }
}
