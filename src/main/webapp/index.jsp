<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>SpringMVC_Demo</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/views/showName.action" method="post" >
  <input name="username" type="text">
  <input type="submit" value="提交">
</form>

<div align="center" style="width:200;height:200">
    <form action="user/regist.do" method="post">
        <input type="text" name="username"/>
        <input type="text" name="password"/>
        <button type="submit">提交</button>
        <button type="reset">重置</button>
    </form>
</div>

</body>

</html>