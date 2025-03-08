<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="com.abhi.spring.springmvc.dto.Employee, java.util.List"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Employees:
	<b>${employees}</b>

	<br>
	<br>
	<br>
	<br>
	<br>
	<% List<Employee> emps = (List<Employee>) request.getAttribute("employees");
		for(Employee e : emps){
			out.println(e.getId());
			out.println(e.getName());
			out.println(e.getSalary());
		}
	%>
</body>
</html>