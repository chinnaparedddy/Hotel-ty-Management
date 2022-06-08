<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Hotel Details</h1>
	<form action="savehostels" method="post">
	Name <input type="text" name="name">
	Email<input type="email" name="email">
	Address <textarea name="address"></textarea>
	WebSite<input type="url" name="website">
	<input type="submit" value="save">
	</form>
</body>
</html>