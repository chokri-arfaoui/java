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
<title>Pocket Book</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<!-- change to match your file/naming structure -->
</head>
<body>
	<div class="container mt-5">
		<h1 class="text-danger">Save Travels</h1>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Expenses</th>
					<th>Vender</th>
					<th>Amount</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listOfPocketBooks }" var="onePocketBook">
					<tr>
						<td><a href="/expences/${onePocketBook.id}" >${onePocketBook.expences}</a></td>
						<td>${onePocketBook.vender}</td>
						<td>${onePocketBook.amount}</td>
						<td>${onePocketBook.description}</td>
						<td >
							 <div class="d-flex justify-content">
								<a href="/expences/edit/${onePocketBook.id }" >edit</a>
								<form action="/expences/${onePocketBook.id }" method="post">
									<input  type="hidden" name="_method" value="delete" />
									<button class="btn btn-danger ms-3">delete</button>
								</form>
							</div>
						</td>

					</tr>
				</c:forEach>

			</tbody>
		</table>
		<br>
		<div class="container col-md-4 .offset-md-3">
			<h1 class="text-success">Add an expense:</h1>
			<br>
			<form:form action="/expences" method="post"
				modelAttribute="pocketbook">
				<div>
					<form:label class="mr-3" path="expences">Expenses</form:label>
					<form:input type="String" path="expences" />
					<div>
						<form:errors path="expences" class="text-danger" />
					</div>

				</div>


				<div>
					<form:label path="vender">Vender</form:label>
					<form:input  type="String" path="Vender" />
					<div>
						<form:errors path="expences" class="text-danger" />
					</div>

				</div>

				<div>
					<form:label path="amount">Amount</form:label>
					<form:input type="double" path="amount" />

					<div>
						<form:errors path="expences" class="text-danger" />
					</div>
				</div>

				<div>
					<form:label path="description">Description</form:label>
					<br>
					<form:textarea class="w-75 h-300px" type="String"
						path="description" />
					<div>
						<form:errors path="expences" class="text-danger" />
					</div>
				</div>





				<button type="submit"
					class="  btn btn-primary container col-md-4 .offset-md-3 mt-2 ml-20">Submit</button>

			</form:form>


		</div>

	</div>
</body>
</html>