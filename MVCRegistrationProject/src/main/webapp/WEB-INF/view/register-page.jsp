
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration page </title>
</head>
<body>

Hello World !!!!!

<div align="center">
<form:form action="process-register" method="get" modelAttribute="userReg">
<form:input path="name" value ="name"/>
<br> <br>

<form:input path="userName" value ="userName"/>
<br> <br>
<form:input path="password" value ="password"/>

<input type = "submit" value="submit"> 
<br> <br>





</form:form>

</div>
</body>
</html>