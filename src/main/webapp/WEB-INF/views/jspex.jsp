<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ page import="java.util.List" %>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>

<!DOCTYPE html>
<html>
<head>
    <title>JSP Expression Page</title>
</head>
<body>

    <h1>JSP Expression</h1>
    <h2>Jsp Expression called...</h2>

    <h2>Name : ${name} </h2>

    <h3>Friends</h3>
    <h3>${f}<h3/>

    <c:forEach var="item" items="${f}">
        <h1>${item}</h1>
    </c:forEach>

</body>
</html>
