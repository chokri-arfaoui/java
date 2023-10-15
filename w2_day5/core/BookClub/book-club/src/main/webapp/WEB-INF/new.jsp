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
<title>Tacos</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
<!-- change to match your file/naming structure -->
</head>
<body>
	<div class="container p-3">
		<div class="d-flex justify-content-between ">
			<h1>Create Book 📰</h1>
			<a href="/books">Back to the shelves</a>

		</div>
		<form:form action="/books/new" method="post" modelAttribute="book"
			class="col-3">
			<div>
				<p>
					<form:label path="title" class="form-label">Title</form:label>
					<form:input class="form-control" path="title" />
				</p>
	
				<div>
					<form:errors path="title" class="text-danger" />
				</div>



			</div>

			
			<div>
				<p>
					<form:label path="author" class="form-label">Author</form:label>
					<form:input class="form-control" path="author" />
				</p>
				<div>
					<form:errors path="author" class="text-danger" />
				</div>
			
			
			
			</div>
				<p>
					<form:label path="thaughts" class="form-label">Thoughts</form:label>
					<form:textarea path="thaughts" class="form-control" name="thaughts"></form:textarea>
				</p>
				<div>
					<form:errors path="thaughts" class="text-danger" />
				</div>

			<div>
			</div>

			<button class="btn btn-success">Submit</button>

		</form:form>
	</div>

</body>
</html>