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

		
		<div class="d-flex justify-content-between">
            <h1 class="text-success">Edit expense</h1>
            <a href="/expences">GO BACK</a>
        </div>
		<br>
		<form:form action="/expences/edit/${pocketbook.id }" method="post"
			modelAttribute="pocketbook">
			<input type="hidden" name="_method" value="put">
			
			<div>
				<form:label class="mr-3" path="expences">Expenses</form:label>
				<form:input type="String" path="expences" />
				<div>
					<form:errors path="expences" class="text-danger" />
				</div>

			</div>
			<br>


			<div>
				<form:label path="vender">Vender</form:label>
				<form:input type="String" path="vender" />
				<div>
					<form:errors path="expences" class="text-danger" />
				</div>

			</div>
			<br>

			<div>
				<form:label path="amount">Amount</form:label>
				<form:input type="double" path="amount" />

				<div>
					<form:errors path="expences" class="text-danger" />
				</div>
			</div>
			<br>

			<div>
				<form:label path="description">Description</form:label>
				<br>
				<form:textarea class="w-75 h-300px" type="String" path="description" />
				<div>
					<form:errors path="expences" class="text-danger" />
				</div>
			</div>
			<br>

			<input type="submit" value="Submit"/>

		</form:form>


	</div>


</body>
</html>