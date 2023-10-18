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
<title>Create Ninija</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
<!-- change to match your file/naming structure -->
</head>
<body>
	<div class="container p-3">
		<div>
			<h1>New Show</h1>
		</div>
		<form:form action="/ninjas/newninja" method="post"
			modelAttribute="book" class="col-3">
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
					<form:label path="first name" class="form-label">First Name</form:label>
					<form:input class="form-control" path="first name" />
				</p>
				<div>
					<form:errors path="first name" class="text-danger" />
				</div>
			</div>
			<div>
				<p>
					<form:label path="last name" class="form-label">Last Name</form:label>
					<form:input class="form-control" path="last name" />
				</p>
				<div>
					<form:errors path="last name" class="text-danger" />
				</div>
			</div>
			<p>
				<form:label path="age" class="form-label">age</form:label>
				<form:input class="form-control" path="age" />

			</p>
			<div>
				<form:errors path="age" class="text-danger" />
			</div>

			<div>
				<button  type= "submit" class="btn btn-success">Create</button>
			</div>


		</form:form>
	</div>

</body>
</html>