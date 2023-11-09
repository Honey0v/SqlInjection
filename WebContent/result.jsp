
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.User.userDAO" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: honey
  Date: 11/7/23
  Time: 6:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>

<table border="1">

  <tr>
      <th>Num</th>
      <th>userId</th>
      <th>password</th>
  </tr>
    <c:forEach items="${ info }" var="data" varStatus="i">
        <tr>
            <td>${data}</td>
        </tr>



    </c:forEach>


</table>
</body>
</html>
