package com.chen.my.shop.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 8:23 2020/2/5 0005
 * @Modified By:
 */
@Data
@Accessors(chain = true)
public class TbUser {

    private Long id;
    private String username;
    private String password;
    private String phone;
    private String email;
    private Date created;
    private Date updated;
}
