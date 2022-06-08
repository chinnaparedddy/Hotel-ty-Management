<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   <h1>EMployee Save</h1>
	<form action="saveemployee" method="post">
	 Name:<input type="text" name="name">
	 Email:<input type="email" name="email">
	  phone:<input type="text" name ="phone"> 
	  Designation:<input type="text" name="designation">
	  <input type="submit" value="save">
	
	</form>
</body>
</html>