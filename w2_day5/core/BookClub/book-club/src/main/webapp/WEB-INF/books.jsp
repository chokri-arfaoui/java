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
<title>Book Club</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
<!-- change to match your file/naming structure -->
</head>
<body>
	<div class="container">

		<div class="container mt-5">
			<div class="d-flex justify-content-between">
				<h1 class="text-success">Welcome</h1>
				<a href="/login">Logout</a>

			</div>
		</div>
		<div class="container mt-5">
			<div class="d-flex justify-content-between">
				<h4>books from everyone's shelves</h4>
				<a href="/books/new">Add a book to your shelf:</a>

			</div>

		</div>
		<hr />
		<table class="table table-hover">
			<thead>
				<tr>
					<th>ID</th>
					<th>Title</th>
					<th>Author</th>
					<th>Posted By</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listOfBooks}" var="oneBook">
					<tr>
						<td>${oneBook.id}</td>
						<td><a href="/books/show/${oneBook.id}">${oneBook.title}</a></td>
						<td>${oneBook.author}</td>
						<td>${oneBook.postedBy.userName}</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>

	</div>
</body>
</html>