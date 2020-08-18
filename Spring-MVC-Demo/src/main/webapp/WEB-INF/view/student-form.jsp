<%--
  Created by IntelliJ IDEA.
  User: matheus-homrich
  Date: 18/08/2020
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Welome to the Student Form</title>
</head>
<body>

<form:form action="/student/showForm" modelAttribute="student">
    First name: <form:input path="firstName"/>

    <br><br>

    Last name: <form:input path="lastName"/>

    <br><br>

    <input type="submit" value="Submit"/>
</form:form>

</body>
</html>
