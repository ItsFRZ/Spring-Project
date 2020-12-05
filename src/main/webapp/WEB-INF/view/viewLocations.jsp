<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@page isELIgnored="false" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>List Records</h1>
	
	<table>
		<tr>
			<th>Id</th>
			<th>Code</th>
			<th>Name</th>
			<th>Type</th>
		</tr>
		<c:forEach var="temp" items="${locations }">
		<tr>
			<td>${temp.lid }</td>
			<td>${temp.lpincode }</td>
			<td>${temp.lname }</td>
			<td>${temp.lregion }</td>
			<td><a href="deleteLocation?lid=${temp.lid} ">Delete</a></td>
			<td><a href="updateLocation?lid=${temp.lid } ">Update</a></td>
		</tr>
		
		</c:forEach>
	</table>
	<a href="home">Add Data</a>


</body>
</html>