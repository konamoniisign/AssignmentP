
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrion Details</title>
</head>
<body>

<h5>Registration Details is successfully completed</h5>

Name: ${userReg. name}
<br>

user name :  ${userReg. userName}
<br>
Password :  ${userReg. password}
<br>
Country:  ${userReg. country}
<br>
Hobbies :
<c:forEach var="temp" items="  ${userReg. hobbies}">
   
   ${temp}

</c:forEach>
<br>
Gender :  ${userReg. gender}



</body>
</html>