<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href=" <%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>

</head>
<body>
<div>
    <div>
        <form action="user/login.do" method="post">
            <label>用户名：</label>
            <input type="text" name="username" />
            <label>密码:</label>
            <input type="password" name="password"/>
            <button type="submit">登录</button>
            <button type="reset" >重置</button>
        </form>
    </div>

</div>

</body>
</html>