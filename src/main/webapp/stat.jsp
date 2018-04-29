<%--
  Created by IntelliJ IDEA.
  User: innopolis
  Date: 28.04.2018
  Time: 17:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Stat</title>
</head>
<body>
<table>
    <tr>
        <td>Name</td>
        <td>Mean Enter Time</td>
        <td>Mean Exit Time</td>
        <td>Enters</td>
        <td>Exits</td>
        <td>Mean work time</td>
    </tr>
<c:forEach items="${list}" var="user">
    <tr>
        <td><c:out value="${user.username}"/></td>
        <td><c:out value="${user.meanIn}"/></td>
        <td><c:out value="${user.meanOut}"/></td>
        <td><c:out value="${user.countIn}"/></td>
        <td><c:out value="${user.countOut}"/></td>
        <td><c:out value="${user.meanWorkTime}"/></td>
    </tr>
</c:forEach>
</table>
</body>
</html>
