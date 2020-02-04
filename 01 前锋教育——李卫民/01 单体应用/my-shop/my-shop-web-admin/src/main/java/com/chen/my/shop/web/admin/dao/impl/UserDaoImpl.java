package com.chen.my.shop.web.admin.dao.impl;

import com.chen.my.shop.domain.User;
import com.chen.my.shop.web.admin.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 21:27 2019-10-23
 * @Modified By:
 */
@Repository("userDao")
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
