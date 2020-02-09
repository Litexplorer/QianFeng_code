package com.chen.my.shop.commons.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 15:05 2020/2/6 0006
 * @Modified By:
 */
@Data
@Accessors(chain = true)
public class BaseResult implements Serializable {

    public static final int STATUS_SUCCESS = 200;
    public static final int STATUS_FAIL = 500;

    private int status;
    private String message;

    public static BaseResult success() {
        return create(STATUS_SUCCESS, "操作成功！");
    }

    public static BaseResult success(String message) {
        return create(STATUS_SUCCESS, message);
    }

    public static BaseResult fail() {
        return create(STATUS_FAIL, "操作失败");
    }

    public static BaseResult fail(String message) {
        return create(STATUS_FAIL, message);
    }


    private static BaseResult create(int status, String message) {
        return new BaseResult().setStatus(status).setMessage(message);
    }
}
