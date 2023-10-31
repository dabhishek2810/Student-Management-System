<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/Student_Management/getCss/add-student.css">
<link rel="stylesheet" type="text/css" href="/Student_Management/getCss/MyStyle.css"></link>
</head>
<body>
	<h2 class="display-5" align="center">Add Student</h2>
	<div class="mb-3" align="center">
		<form:form action="save-student" modelAttribute="add" method="POST">
		
		<form:hidden  path="id"/>
		<br><br>
		<label>Name : </label>
		<form:input  path="name"/>
		<br><br>
		<label>Mobile : </label>
		<form:input path="mobile"/>
		<br><br>
		<label>Country : </label>
		<form:input path="country"/>
		<br><br>
		<input class="btn btn-success btn-lg" type="submit" value="submit"/>
		</form:form>
	
	</div>

</body>
</html>