<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 27/04/2020
  Time: 5:19 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Save</title>
</head>
<body>
<c:forEach items="${condiment}" var="condiment">
    <p>${condiment}</p>
</c:forEach>
</body>
</html>
