<%--
  Created by IntelliJ IDEA.
  User: JinhaoChen
  Date: 2020/2/5 0005
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>

<header class="main-header">
    <!-- Logo -->
    <a href="index2.html" class="logo">
        <!-- mini logo for sidebar mini 50x50 pixels -->
        <span class="logo-mini"><b>商城</b></span>
        <!-- logo for regular state and mobile devices -->
        <span class="logo-lg"><b>我的商城</b></span>
    </a>
    <!-- Header Navbar: style can be found in header.less -->
    <nav class="navbar navbar-static-top">
        <!-- Sidebar toggle button-->
        <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
            <span class="sr-only">Toggle navigation</span>
        </a>

        <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">
                <!-- User Account: style can be found in dropdown.less -->
                <li class="dropdown user user-menu">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <img src="<%=basePath%>/static/assets/dist/img/user2-160x160.jpg" class="user-image" alt="User Image">
                        <span class="hidden-xs">${user.username}</span>
                    </a>
                    <ul class="dropdown-menu">
                        <!-- User image -->
                        <li class="user-header">
                            <img src="<%=basePath%>/static/assets/dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">

                            <p>
                                ${user.username} - Java 开发工程师
                                <small><fmt:formatDate value="${user.created}" pattern="yyyy-MM-dd HH:mm:ss"/> </small>
                            </p>
                        </li>

                        <!-- Menu Footer-->
                        <li class="user-footer">
                            <div class="pull-left">
                                <a href="#" class="btn btn-default btn-flat">个人信息</a>
                            </div>
                            <div class="pull-right">
                                <a href="logout" class="btn btn-default btn-flat">注销</a>
                            </div>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
    </nav>
</header>
