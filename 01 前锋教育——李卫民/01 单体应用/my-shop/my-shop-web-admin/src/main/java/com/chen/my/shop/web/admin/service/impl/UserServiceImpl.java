package com.chen.my.shop.web.admin.service.impl;

import com.chen.my.shop.domain.User;
import com.chen.my.shop.web.admin.commons.context.SpringContext;
import com.chen.my.shop.web.admin.dao.UserDao;
import com.chen.my.shop.web.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 21:32 2019-10-23
 * @Modified By:
 */
@Service("userService")
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao = new SpringContext().context.getBean("userDao", UserDao.class);

    @Override
    public User login(String email, String password) {
        User user = null;

        user = userDao.getUserByEmailAndPassword(email, password);

        return user;
    }

}
