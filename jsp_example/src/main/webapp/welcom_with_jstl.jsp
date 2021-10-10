<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="menu.html" %>


<%= session.isNew() %>
<%= session.getId() %>
<!-- not using java -->
<c:set var="location" value="Koppal" scope="page"/>
<c:set var="name" value="Bhargavi" scope="session"/>

<c:out value="${'hello'}"/>
<c:out value="${'I am from JSP' }"/>

<c:out value="${name} ${location}"/>

<a href="showName.jsp">Next</a>

</body>
</html>