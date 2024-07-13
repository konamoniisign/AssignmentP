<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Form</title>
</head>
<body>
<h1 align="center">Register Here </h1>
<div align="center">
<form:form action="register-details" method="get" modelAttribute="userReg">
<label>Name : </label>
<form:input path="name"/>
<br><br>
<label>User Name : </label>
<form:input path="userName"/>
<br><br>
<label>Password : </label>
<form:input path="password"/>
<br><br>
<label>Country : </label>
<form:select path="country">
<form:option value="India">India</form:option>
<form:option value="Usa">United States of America</form:option>
<form:option value="Afganistan">Afganistan</form:option>
<form:option value="pakistan">Pakistan</form:option>
<form:option value="newsLand">NewsLand</form:option>
<form:option value="australia">Australia</form:option>

</form:select>
<br><br>
Cricket : <form:checkbox path="hobbies" value="Cricket"/>
Reading NewsPaper: <form:checkbox path="hobbies" value="ReadingNews"/>
Programming : <form:checkbox path="hobbies" value="Programming"/>
Roaming : <form:checkbox path="hobbies" value="roaming"/>

<br><br>

<label>Gender : </label>
<label>Male</label>
<form:radiobutton path="gender" value="Male"/>
<label>Female</label>
<form:radiobutton path="gender" value="Female"/>
<br><br>
<input type="Submit" name="Submit" value="Register">
</form:form>
</div>

</body>
</html>