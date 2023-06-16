<%@ page contentType="text/html;charset=UTF-8"  %>
<html>
<body>
<h2>Hello World!</h2>

<form action="${pageContext.request.contextPath}/login.do">
    <label>
        name :<input type="text" name="name">
        <br><br>
        password :<input type="password" name="password">
    </label>
    <input type="submit" value="登录">
</form>
</body>
</html>
