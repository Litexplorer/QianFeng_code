package com.chen.my.shop.web.admin.web.interceptor;

import com.chen.my.shop.commons.utils.ConstantUtils;
import com.chen.my.shop.domain.TbUser;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 17:14 2020/2/4 0004
 * @Modified By:
 */
public class LoginInterceptor  implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        TbUser user = (TbUser) request.getSession().getAttribute(ConstantUtils.SESSION_USER);
        if (user == null) {
            response.sendRedirect(String.format("/%s/login", ConstantUtils.SERVER_NAME));
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
