<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Login</h1>
	
	<form action="employLogin" method="post">
	EmployeeEmail<input type="email" name="email">
	EmployeePhone:<input type="number" name="phone">
	<input type="submit" value="login">
	<h1><a href="logout">LogOut</a></h1>
	</form>
	
</body>
</html>