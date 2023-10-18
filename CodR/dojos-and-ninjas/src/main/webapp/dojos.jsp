<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tv SHOWS</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
<!-- change to match your file/naming structure -->
</head>
<body>

	<div>burbank location ninjas</div>

	<table>
		<thead>
			<tr>
				<td>First name</td>
				<td>Last name</td>
				<td>age</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="listDojos" var="dojo">
				<tr>
					<td>${dojo.firstName}</td>
					<td>${dojo.lastname}</td>
					<td>${dojo.age}</td>
				</tr>

			</c:forEach>
		</tbody>

	</table>

</body>
</html>