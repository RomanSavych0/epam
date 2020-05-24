<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>passengers</title>
    <link rel="stylesheet" href="passengers.jsp">
    <link rel="stylesheet" href="style.css">

</head>
<body>
<table>
    <tr>
    <th >ID</th>
    <th>name<th>
    <th>surname<th>
    <th>privilege</th>
    </tr>

<c:forEach var="passengerList" items="${List}">
    <tr>
    <td>${passengerList.passengerCode}<td>
    <td>${passengerList.name}<td>
    <td>${passengerList.surname}<td>
    <td><input type="checkbox" ${ passengerList.privilege ? 'checked' : ''}><td>
    <tr>

</c:forEach>

</table>
</body>
</html>
