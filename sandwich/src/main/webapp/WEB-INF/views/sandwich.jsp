<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 27/04/2020
  Time: 4:55 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich</title>
</head>
<body>
<h1><strong>Sandwich Condiments</strong></h1>
<form method="post" action="save">
    <td><input type="checkbox" name="condiment" value="Lettuce">Lettuce</td>
    <td><input type="checkbox" name="condiment" value="Tomato">Tomato</td>
    <td><input type="checkbox" name="condiment" value="Mustard">Mustard</td>
    <td><input type="checkbox" name="condiment" value="Sprouts">Sprouts</td>
    <td><input type="submit" value="save"></td>
</form>
</body>
</html>
