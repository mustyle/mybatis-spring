<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>user add</title>
</head>
<body>
<form:form method="post" modelAttribute="user">
    <table width="800" align="center" border="1">
        <tr>
            <td>username:</td>
            <td><form:input path="username"/>
                <form:errors path="username"/>
            </td>
        </tr>
        <tr>
            <td>password:</td>
            <td><form:password path="password"/>
                <form:errors path="password"/>
            </td>
        </tr>
        <tr>
            <td>nickname:</td>
            <td><form:input path="nickname"/>
                <form:errors path="nickname"/>
            </td>
        </tr>
        <tr>
            <td>email:</td>
            <td><form:input path="email"/>
                <form:errors path="email"/>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="add"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
