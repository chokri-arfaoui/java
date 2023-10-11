<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1 class="text-danger">Fruit Store</h1>
		<table class="table table-hover table-bordered">
			<tbody>
				<tr>
					<th scope="col">Name</th>
					<th scope="col">Price</th>
				</tr>
				<c:forEach var="oneFruit" items="${fruitsFromMyController}">
					<tr>
						<td scope="row"><c:out value="${oneFruit.name}"></c:out></td>
						<td scope="row"><c:out value="${oneFruit.price}"></c:out></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>