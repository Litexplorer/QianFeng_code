package com.chen.my.shop.web.admin.dao;

import com.chen.my.shop.domain.TbUser;
import com.chen.my.shop.web.admin.Application;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;

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

    @Test
    public void getByEmail() {
        TbUser tbUser = tbUserDao.getByEmail("chen@163.com");
        System.out.println(tbUser.getUsername());
    }

    @Test
    public void testMd5() {
        System.out.println(DigestUtils.md5DigestAsHex("123456".getBytes()));
    }
}