package com.chen.my.shop.web.admin.dao;

import com.chen.my.shop.domain.TbUser;
import com.chen.my.shop.web.admin.Application;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 9:44 2020/2/5 0005
 * @Modified By:
 */
public class TbUserDaoTest extends Application {

    @Autowired
    private TbUserDao tbUserDao;
    @Test
    public void selectAll() {
        List<TbUser> tbUsers = tbUserDao.selectAll();
        System.out.println("tbUsers = " + tbUsers);
    }
}