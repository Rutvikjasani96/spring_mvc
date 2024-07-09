<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
    <h1>Hello Home</h1>
    <h2>Home Page Called...</h2>

    <%
        String name = (String) request.getAttribute("name");
        String mobile = (String) request.getAttribute("mobile");
        List<String> f = (List<String>) request.getAttribute("f");
    %>

    <h1>Name :  <%= name %></h1>
    <h2>Mobile no:. <%= mobile %> </h2>

    <h2>Friends</h2>
    <%
        if (f != null && !f.isEmpty()) {
            for (String friend : f) {
    %>
                <h4><%= friend %></h4>
    <%
            }
        } else {
    %>
            <h4>No friends found.</h4>
    <%
        }
    %>
</body>
</html>
