<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student details</title>
</head>
<body>
<table>
	<tr>
		<td>Roll Number</td>
		<td>Student Name</td>
		<td>Date of Birth</td>
		<td>Mark Scored</td>
	</tr>
<c:forEach items="${data}" var="eachItem">	
	<tr>
		<td>${eachItem.rollNumber}</td>
		<td>${eachItem.studentName}</td>
		<td>${eachItem.dateOfBirth}</td>
		<td>${eachItem.markScored}</td>
	</tr>
</c:forEach>	
</table>
</body>
</html>