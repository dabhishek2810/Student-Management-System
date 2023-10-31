<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/Student_Management/getCss/MyStyle.css"></link>
</head>

<body class="myBody">
	<div class="container">
	<h1 class="display-3" align="center">Student Management</h1>
		
		<form action="/Student_Management/addStudent">
			<input class="btn btn-primary btn-lg" type="submit" value="ADD">
		</form>
		
		<br>
		<table border="1" class="table table-striped ">
		<thead>
			<tr>
				<td>Id</td>
				<td>Name</td>
				<td>Mobile</td>
				<td>Country</td>
				<td>Update</td>
				<td>Delete</td>
			</tr>
		</thead>
		
		<c:forEach var="student" items="${students}">
			<tr>
			<td>${student.id}  </td>	
			<td>${student.name}  </td>	
			<td>${student.mobile}  </td>	
			<td>${student.country}  </td>
			<td class="update"><a href="/Student_Management/updateStudent?userId=${student.id}"> Update </a> </td>
			<td class="delete"><a href="/Student_Management/deleteStudent?userId=${student.id}" onclick="if(!(confirm('Are you want to delete this data ?')))return false"> Delete </a> </td>	
			</tr>
		</c:forEach>
		</table>
		
		</div>
</body>
</html>