<%--
  Created by IntelliJ IDEA.
  User: sun
  Date: 2023/6/15
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${user}
<form action="${pageContext.request.contextPath}/delete.do">
    <label>
        <input type="checkbox" name="item" value="3">3<br>
        <input type="checkbox" name="item" value="4">4<br>
    </label>
    <input type="submit" value="删除">
</form>
</body>
</html>
