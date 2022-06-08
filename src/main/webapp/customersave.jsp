<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Customer Details</h1>
	<form action="savecustomers" method="post">
	Name <input type="text" name="name">
	 phone <input type="text" name ="phone"> 
	  Email<input type="email" name="email">
	  Gender <input type="radio" value="male" name="gender">male
	  <input type="radio" value="female" name="gender">female
	  <input type="submit" value="save">	
	</form>
</body>
</html>