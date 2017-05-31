<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>user list</title>
</head>
<body>
<table width="700" align="center" border="1">
    <c:forEach items="${users}" var="user">
        <tr>
            <td><a href="${user.id }">${user.id}</a></td>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td>${user.nickname}</td>
            <td>${user.email}</td>
            <td>
                <a href="${user.id }/update">update</a>&nbsp;
                <a href="${user.id }/delete">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
