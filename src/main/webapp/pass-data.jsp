<%--
  Created by IntelliJ IDEA.
  User: bugsb
  Date: 30.09.2022
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pass data</title>
</head>
<body>

<form id="user-form" action="${pageContext.request.contextPath}/pass-data" method="post" modelattribute="${user}">
  <p>Name : <input type="text" name="name"></p>
  <p>Surname : <input type="text" name="surname"></p>
  <p>Years : <input type="number" name="years"></p>
  <input type="submit" value="Pass data">
</form>
</body>
</html>
