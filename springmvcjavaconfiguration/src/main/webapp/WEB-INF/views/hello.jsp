<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello</title>
</head>
<body>
	<%
		Integer id = (Integer)request.getAttribute("id");
		String name = (String)request.getAttribute("name");
		Integer salary = (Integer)request.getAttribute("salary");
		
		out.println(id);
		out.println(name);
		out.println(salary);
	%>
	<br>
	Id: <b>${id}</b>
	Name: <b>${name}</b>
	Salary: <b>${salary}</b>
</body>
</html>