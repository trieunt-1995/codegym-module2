<%--
  Created by IntelliJ IDEA.
  User: trieunt
  Date: 12/9/19
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ứng dụng chuyển đổi tiền tệ</title>
</head>
<body>
    <h1>Ứng dụng chuyển đổi tiền tệ</h1>
    <form method="post" action="/convert">
        <label>Chọn tỉ giá chuyển đổi: </label>
        <select name="convert">
            <option value="convertVNDToUSD">VND sang USD</option>
            <option value="convertUSDToVND">USD sang VND</option>
        </select><br>
        <label>Nhập số tiền: </label>
        <input type="text" name="money"><br>
        <label>Nhập tỉ giá: </label>
        <input type="text" name="rate"><br>
        <button type="submit">Chuyển đổi</button>
    </form>
</body>
</html>
