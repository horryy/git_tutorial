<%--
  Created by IntelliJ IDEA.
  User: huangyongshuo
  Date: 2020-01-30
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    ${lsit}
    <h3>查询所有的账户信息</h3>



    <c:forEach items="${list}" var="account">
        ${account.name}
        ${account.money} <br/>
    </c:forEach>
</body>
</html>
