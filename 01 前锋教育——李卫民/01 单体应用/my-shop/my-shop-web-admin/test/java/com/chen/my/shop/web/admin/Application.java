package com.chen.my.shop.web.admin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 9:32 2020/2/5 0005
 * @Modified By:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml", "classpath:spring-context-druid.xml", "classpath:spring-context-mybatis.xml"})
public class Application {

    @Autowired
    private ApplicationContext applicationContext;
    @Test
    public void names() {
        String[] names = applicationContext.getBeanDefinitionNames();
        List<String> strings = Arrays.asList(names);
        System.out.println("strings = " + strings);
    }
}
