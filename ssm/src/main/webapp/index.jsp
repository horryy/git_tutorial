<%--
  Created by IntelliJ IDEA.
  User: huangyongshuo
  Date: 2020-01-30
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <a href="account/findAll">测试查询</a>

    <br/>
    <br/>

    <form action="account/saveAccount" method="post">
        姓名：<input type="text" name="name"><br/>
        金额：<input type="text" name="money"><br/>
        <input type="submit" name="提交"><br/>
    </form>

</body>
</html>
