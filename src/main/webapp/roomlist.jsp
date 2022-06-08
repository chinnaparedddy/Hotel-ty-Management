<%@page import="java.util.ArrayList"%>
<%@page import="com.tys.hotel.dto.Room"%>
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
<h1>List Of Rooms</h1>
	<% 	List<Room> rooms=(List<Room>)request.getAttribute("karthik");
		if(!(rooms.isEmpty())){
	%>
        		
	<table border="2px" cellpadding=10px>
		<tr>
			<th>ID</th>
			<th>TYPE</th>
			<th>Cost</th>
			<th>Book</th>
			<th>DELETE</th>
		</tr>
		<%
		
		for (Room room : rooms) {
		%>

		<tr>
			<td><%=room.getId()%></td>
			<td><%=room.getType()%></td>
			<td><%=room.getCost()%></td>

			<td><a href="booked.jsp">Book</a></td>
			<!--  <td><a href="delete?id=<%=room.getId()%>">delete</a></td>-->

		</tr>
		<%
			}
		}
		%>
	</table>
	
</body>
</html>