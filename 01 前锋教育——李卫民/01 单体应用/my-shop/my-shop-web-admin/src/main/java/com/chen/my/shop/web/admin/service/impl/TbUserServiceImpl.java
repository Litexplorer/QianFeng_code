package com.chen.my.shop.web.admin.service.impl;

import com.chen.my.shop.domain.TbUser;
import com.chen.my.shop.web.admin.dao.TbUserDao;
import com.chen.my.shop.web.admin.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.List;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 11:05 2020/2/5 0005
 * @Modified By:
 */
@Service
public class TbUserServiceImpl implements TbUserService {
    @Autowired
    private TbUserDao tbUserDao;


    @Override
    public TbUser login(String email, String password) {
        TbUser tbUser = tbUserDao.getByEmail(email);
        if (tbUser != null) {
            String md5Password = DigestUtils.md5DigestAsHex(password.getBytes());
            if (tbUser.getPassword().equals(md5Password)) {
                return tbUser;
            }
        }
        return null;
    }

    @Override
    public List<TbUser> findAll() {
        return tbUserDao.selectAll();
    }
}
