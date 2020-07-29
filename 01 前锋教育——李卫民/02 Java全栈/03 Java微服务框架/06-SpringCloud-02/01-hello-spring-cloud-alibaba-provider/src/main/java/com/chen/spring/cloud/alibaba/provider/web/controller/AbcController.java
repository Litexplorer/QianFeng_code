package com.chen.spring.cloud.alibaba.provider.web.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ChromeChen
 * @Description: Provider 控制器的测试接口
 * @Date: Created in 16:19 2020/7/29 0029
 * @Modified By:
 */
@RestController
public class AbcController {

    @RequestMapping(value = "/echo/{string}", method = {RequestMethod.GET})
    public String echo(@PathVariable String string) {

        return "This is Provider message : " + string;
    }
}
