<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-10-26
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    // System.out.println(path);
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <title>我的商城 | 用户列表</title>
    <jsp:include page="../includes/header.jsp"/>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">
    <jsp:include page="../includes/navigate.jsp"/>

    <jsp:include page="../includes/menu.jsp"/>

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                控制面板
                <small></small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> 首页</a></li>
                <li class="active">控制面板</li>
            </ol>
        </section>

        <!-- Main content -->
        <section class="content">
            <div class="box">
                <div class="box-header">
                    <h3 class="box-title">用户列表</h3>

                    <div class="box-upper" style="margin-top: 10px; margin-left: 15px">
                        <a href="#" type="button" class="btn btn-default btn-sm"><i class="fa fa-edit"></i> 编辑</a>&nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="#" type="button" class="btn btn-danger btn-sm"><i class="fa fa-trash-o"></i> 删除</a>&nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="#" type="button" class="btn btn-default btn-sm"><i class="fa fa-download"></i> 导入</a>&nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="#" type="button" class="btn btn-default btn-sm"><i class="fa fa-upload"></i> 导出</a>
                    </div>

                    <div class="box-tools">
                        <div class="input-group input-group-sm" style="width: 150px;">
                            <input type="text" name="table_search" class="form-control pull-right" placeholder="Search">

                            <div class="input-group-btn">
                                <button type="submit" class="btn btn-default"><i class="fa fa-search"></i></button>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- /.box-header -->
                <div class="box-body table-responsive no-padding">
                    <table class="table table-hover">
                        <thead>
                            <th>ID</th>
                            <th>用户名</th>
                            <th>电话</th>
                            <th>邮箱</th>
                            <th>更新时间</th>
                            <th>操作</th>
                        </thead>
                        <tbody>
                        <%-- 下面是 user 列表的循环加载 --%>
                        <c:forEach items="${users}" var="user">
                            <tr>
                                <td>${user.id}</td>
                                <td>${user.username}</td>
                                <td>${user.phone}</td>
                                <td>${user.email}</td>
                                <td><fmt:formatDate value="${user.updated}" pattern="yyyy-MM-dd HH:mm:ss"/> </td>
                                <td>
                                    <a href="#" type="button" class="btn btn-default btn-sm"><i class="fa fa-search"></i> 编辑</a>&nbsp;&nbsp;&nbsp;&nbsp;
                                    <a href="#" type="button" class="btn btn-primary btn-sm"><i class="fa fa-edit"></i> 查看</a>&nbsp;&nbsp;&nbsp;&nbsp;
                                    <a href="#" type="button" class="btn btn-danger btn-sm"><i class="fa fa-trash-o"></i> 删除</a>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
                <!-- /.box-body -->
            </div>
        </section>
    </div>
    <jsp:include page="../includes/copyright.jsp"/>
</div>


<jsp:include page="../includes/footer.jsp"/>
</body>
</html>
