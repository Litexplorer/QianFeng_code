package com.chen.my.shop.domain;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 20:49 2019-10-23
 * @Modified By:
 */
@Data
@Accessors(chain = true)
public class User {

    private String username;
    private String password;
    private String email;
}
