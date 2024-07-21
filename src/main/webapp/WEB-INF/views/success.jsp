<%--
  Created by IntelliJ IDEA.
  User: Rutvik Jasani
  Date: 20/07/2024
  Time: 14:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Success Page</title>
</head>
<body>
    <h1>${head}</h1>
    <h1>${desc}</h1>
    <hr>
    <h1>Welcome ${user.userName}</h1>
    <h1>your email is ${user.email}</h1>
    <h1>your password is ${user.userPassword}</h1>
</body>
</html>
