<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 26.03.2020
  Time: 12:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<h1>
<a href="passengers.jsp">passenger list</a>

    Add passenger:
    <form action="mainServlet?" method="post">
            <input type="text" name ="firstName" placeholder="Input First name">
            <input type="text" name ="surname" placeholder="Input First name">
            <input type="checkbox" name="privilege" placeholder="privilege?">
            <input type="submit" placeholder="submit">
            <input type = "hidden" name ="command" value="addPassenger">

    </form>

</h1>
</body>
</html>
