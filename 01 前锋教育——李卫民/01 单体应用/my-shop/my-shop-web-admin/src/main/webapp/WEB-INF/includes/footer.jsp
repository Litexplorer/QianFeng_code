<%--
  Created by IntelliJ IDEA.
  User: JinhaoChen
  Date: 2020/2/5 0005
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>


<!-- jQuery 3 -->
<script src="<%=basePath%>/static/assets/bower_components/jquery/dist/jquery.min.js"></script>
<!-- jQuery UI 1.11.4 -->
<script src="<%=basePath%>/static/assets/bower_components/jquery-ui/jquery-ui.min.js"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
    $.widget.bridge('uibutton', $.ui.button);
</script>
<!-- Bootstrap 3.3.7 -->
<script src="<%=basePath%>/static/assets/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- jQuery Knob Chart -->
<script src="<%=basePath%>/static/assets/bower_components/jquery-knob/dist/jquery.knob.min.js"></script>
<!-- Bootstrap WYSIHTML5 -->
<script src="<%=basePath%>/static/assets/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<!-- AdminLTE App -->
<script src="<%=basePath%>/static/assets/dist/js/adminlte.min.js"></script>

<%-- JQuery Validation 1.14.0 --%>
<script src="<%=basePath%>/static/assets/plugins/jquery-validation/jquery.validate.min.js"></script>
<script src="<%=basePath%>/static/assets/plugins/jquery-validation/additional-methods.min.js"></script>
<script src="<%=basePath%>/static/assets/plugins/jquery-validation/localization/messages_zh.min.js"></script>

<%-- 自己定义的 --%>
<script src="<%=basePath%>/static/assets/app/validate.js"></script>
