<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>kafka send</title>
</head>
<body>
    <h1>send a message</h1>
    <form action="sendMessage" method="post">
        message:<input type="text" name="msg"value="${time}">
        <br>
        <input type="submit" value="submit">
    </form>

    <h2><a href="welcome">Return</a></h2>
</body>
</html>
