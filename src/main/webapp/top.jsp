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
    <title>Top 5 employees</title>
</head>
<body>
<table>
    <tr>
        <td>Rank</td>
        <td>Name</td>
    </tr>
<c:forEach items="${list}" var="user">
    <tr>
        <td><c:out value="${user.rank}"/></td>
        <td><c:out value="${user.username}"/></td>
    </tr>
</c:forEach>
</table>
</body>
</html>
