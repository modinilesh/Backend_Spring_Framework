<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
	<%
	/* String name = (String) request.getAttribute("name");
	Integer roll = (Integer) request.getAttribute("rollnumber");
	LocalDateTime ctime = (LocalDateTime) request.getAttribute("time"); */
	%>

	<h1>Welcome to Help Page !</h1>
	<h2>
		I am
		<%-- <%=name%>, How can I help you ? --%>
		${name}
	</h2>
	<h2>My roll no. is <%-- <%=roll %> --%> ${rollnumber}</h2>
	<hr>
	<h1>My marks are : 
	<c:forEach var="item" items="${marks}">
		<h1>${item }</h1>
	</c:forEach>
	</h1>
	
	<hr>
	<h3>Date and Time is : ${time}<%-- <%=ctime.toString() %> --%></h3>

</body>
</html>