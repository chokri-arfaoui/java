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
	<div class="container col-md-4 .offset-md-3 mt-4">

		<div class="container col-md-4 .offset-md-3">
			<div class="container">
				<div class="d-flex justify-content-between">
					<h1>Change your Entry</h1>
					<a href="/books">Back to the shelves</a>
				</div>
			</div>



			<form:form action="/books/${pocketbook.id }" method="post"
				modelAttribute="book">
				<div>
					<form:label class="mr-3" path="title">Title</form:label>
					<form:input type="String" path="title" />
					<div>
						<form:errors path="title" class="text-danger" />
					</div>

				</div>


				<div>
					<form:label path="author">Author</form:label>
					<form:input type="String" path="author" />
					<div>
						<form:errors path="author" class="text-danger" />
					</div>

				</div>

				<div>
					<form:label path="thaugths">My Thaugths</form:label>
					<form:input type="String" path="thaugths" />

					<div>
						<form:errors path="thaugths" class="text-danger" />
					</div>
				</div>

				<button type="submit"
					class="  btn btn-primary container col-md-4 .offset-md-3 mt-2 ml-20">Submit</button>

			</form:form>


		</div>
	</div>

</body>
</html>