<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">

table{
border: 2px solid blue;
margin-left:auto;
margin-right:auto;
border-collapse:collapse;
}

tr,td,th{
border:2px solid blue;
}
h2{
text-align:center;
}

</style>
<title>Insert title here</title>
</head>
<body>
<h2>Book Details</h2>

<table>
	<tr>
		<th>Sl.No</th>
		<th>Book Name</th>
		<th>Author Name</th>
		<tr>
			<td>${foundBook[0].id}</td>
			<td>${foundBook[0].bookname}</td>
			<td>${foundBook[0].authorname}</td>
		</tr>
	</tr>
</table>
</body>
</html>