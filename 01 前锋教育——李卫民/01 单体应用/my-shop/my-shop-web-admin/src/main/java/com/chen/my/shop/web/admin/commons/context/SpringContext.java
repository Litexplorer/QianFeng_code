package com.chen.my.shop.web.admin.commons.context;

import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 21:32 2019-10-25
 * @Modified By:
 */
@Component
public final class SpringContext implements ApplicationContextAware, DisposableBean {

    private static final Logger logger = LoggerFactory.getLogger(SpringContext.class);

    public static ApplicationContext context = null;


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContext.context = applicationContext;
    }



    @Override
    public void destroy() throws Exception {
        context = null;
        logger.info("销毁了 ApplicationContext 对象");
    }

    /**
     * 根据 beanId 获取 bean 实例
     * @param beanId
     * @param <T>
     * @return
     */
    public static <T> T getBean(String beanId) {
        Object bean = SpringContext.context.getBean("name");
        return (T) bean;
    }

    /**
     * 根据 clazz 获取 bean 实例
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T getBean(Class<T> clazz) {
        return SpringContext.context.getBean(clazz);
    }

    /**
     * 断言 Context 已经注入
     */
    private static void assertContextInjected() {
        Validate.validState(context != null, "applicationContext 属性未注入，请在 spring-context.xml 配置中定义 SpringContext");
    }

    /**
     * 获取存储在静态变量中的 ApplicationContext
     * @return
     */
    public static ApplicationContext getApplicationContext() {
        assertContextInjected();
        return context;
    }

}
