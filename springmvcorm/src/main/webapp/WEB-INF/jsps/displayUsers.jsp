<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>EMAIL</th>
		</tr>
		<c:forEach items="${users}" var="user">
			<tr>
				<th>${user.id}</th>
				<th>${user.name}</th>
				<th>${user.email}</th>
			</tr>
		</c:forEach>
	</table>
</body>
</html>