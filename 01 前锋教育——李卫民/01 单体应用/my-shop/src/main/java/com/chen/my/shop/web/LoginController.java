package com.chen.my.shop.web;

import com.chen.my.shop.bean.User;
import com.chen.my.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: ChromeChen
 * @Description:
 * @Date: Created in 21:38 2019-10-23
 * @Modified By:
 */
@WebServlet(value = {"/login"})
public class LoginController extends HttpServlet {

    @Autowired
    private UserService userService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getHeader("email");
        String password = req.getHeader("password");

        User login = userService.login(email, password);
        if (login != null) {

            resp.getWriter().println(String.format("user {} login successfully", email));
        } else  {
            resp.getWriter().println(String.format("Sorry, user which email is {} is not registed", email));
        }
    }
}
