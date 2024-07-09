<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Help Page</title>
</head>
<body>
    <h1>Help</h1>
    <h2>Help Page Called...</h2>

    <%
        Integer Id = (Integer) request.getAttribute("Id");
        String name = (String) request.getAttribute("name");
        String number = (String) request.getAttribute("number");
    %>
    <h2>Id : <%= Id %> </h2>
    <h2>Name : <%= name %> </h2>
    <h2>Mobile Number : <%= number %> </h2>

    </p1>
</body>
</html>
