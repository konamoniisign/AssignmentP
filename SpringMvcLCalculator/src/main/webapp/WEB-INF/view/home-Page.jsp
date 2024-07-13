
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<style type="text/css">

.erorr{
color: red;
margin-left: 40px;
position:fixed;
}
</style>
<body>
	<h1 align="center">Love Calculator App</h1>
	<hr>
	<div align="center">
		<form:form action="process-HomePage" method="get" modelAttribute="userInfo"  onsubmit= "return validateForm()">
			<p>
				<label for="uN">User Name : </label>
				
				<form:input  id = "uN" path="userName"/>
				<form:errors path="userName" cssClass="erorr"></form:errors>
			</p>

			<p>
				<label for="cN">Crush Name : </label>
				
				<form:input  id = "cN" path="crushName"/>
				<form:errors path="crushName" cssClass="erorr"></form:errors>
			</p>
			<br>
			
			
			<p>
			<label>Email : </label>
			<form:input  path="communication.email" />
			</p>
			
			
			<p>
			<label>Phone : </label>
			<form:input  path="communication" />
			</p>
			
			
			
			<p>
			<form:checkbox path="termAndCondition" id="tC"/>
			<label>Check the box before Entering to Next</label>
			<form:errors path="termAndCondition"  cssClass="erorr"/>
			</p>
			
			
			
			
			<input  type = "submit" value="submit" name = "Submit"/>

	</form:form>
</div>
</body>

<script type="text/javascript">


function validateForm() {
	
	var userName = document.getElementById("uN").value;
	
	
	if(userName.length <5){
		alert("You should enter altest 5 Charcters of UserName");
		console.log("You should enter altest 5 Charcters of UserName")
		return false;
	}
	
	else{
		return true;
	}
	var crushName = document.getElementById("cN").value;
	 if(crushName.length <5){
		alert("You should enter altest 5 Charcters of UserName");
		console.log("You should enter altest 5 Charcters of UserName")
		return false;
	 }
	 else{
			return true;
		}
	

	
	
}


</script>







</html>