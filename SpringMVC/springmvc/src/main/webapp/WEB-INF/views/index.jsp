<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import ="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<%
	String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("Id");
	List<String> fri = (List<String>) request.getAttribute("friends");
	%>
	
	
	<h1>
		Welcome
		<%=name%>.
	</h1>
	<h1>
		Your Id is :
		<%=id%></h1>
	<h2>Called by HomeController</h2>
	<h2>url /home</h2>

	<h1><%=name%>
		your friends list is mentioned below :
	</h1>
	<% for(String s : fri){
		%>
		
		<h2><%=s%></h2>
		
	<% }%>

</body>
</html>