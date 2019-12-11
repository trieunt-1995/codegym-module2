<%--
  Created by IntelliJ IDEA.
  User: trieunt
  Date: 12/9/19
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Ứng dụng tra từ điển</title>
</head>
<body>
    <h1>Ứng dụng tra từ điển</h1>
    <form action="/dictionary" method="post">
        <label>Nhập từ cần tra</label>
        <input type="text" name="dictionary">
        <button type="submit">Tra từ</button>
    </form>

    <h1>Result: ${result}</h1>
</body>
</html>
