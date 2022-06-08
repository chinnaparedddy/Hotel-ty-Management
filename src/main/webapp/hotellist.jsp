<%@page import="java.util.ArrayList"%>
<%@page import="com.tys.hotel.dto.Hotel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="2px"  cellpadding=10px >
		<tr >
			<th>ID</th>
			<th>Name</th>
			<th>MAIL</th>
			<th>Address</th>
			<th>Webiste</th>
			<th>Book</th>
			<!--  <th>DELETE</th>-->
		</tr>

		
		<%
		 List<Hotel> hotels=(ArrayList) request.getAttribute("naresh");
		for (Hotel hotel : hotels) {
		%>

		<tr>
			<td><%=hotel.getId()%></td>
			<td><%=hotel.getHotel_name()%></td>
			<td><%=hotel.getHotel_email()%></td>
			<td><%=hotel.getHotel_Address()%></td>
			<td><a href="<%=hotel.getHotel_website()%>">WEBSITE</a></td>
			<td>
			<a href="viewhotel?id=<%=hotel.getId()%>">Book</a>
			</td>
			<!--  <td><a href="delete?id=<%=hotel.getId()%>">delete</a></td>-->

		</tr>
		<%
		}
		%>
	</table>
</body>
</html>