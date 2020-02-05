package com.chen.my.shop.web.admin.dao;

import com.chen.my.shop.domain.TbUser;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 9:43 2020/2/5 0005
 * @Modified By:
 */
@Repository
public interface TbUserDao {

    /**
     * 查询全部用户信息
     * @return
     */
    List<TbUser> selectAll();

    /**
     * 根据 email 找到一个用户对象
     * @param email
     * @return
     */
    TbUser getByEmail(String email);
}
