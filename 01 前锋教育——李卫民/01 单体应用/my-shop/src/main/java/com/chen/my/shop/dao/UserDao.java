package com.chen.my.shop.dao;

import com.chen.my.shop.bean.User;

/**
 * @Author: ChromeChen
 * @Description: 访问后台用户数据库接口
 * @Date: Created in 20:48 2019-10-23
 * @Modified By:
 */
public interface UserDao {

    User getUserByEmailAndPassword(String email, String password);
}
