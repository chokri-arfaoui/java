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
	<div class="container">


		<div class="d-flex justify-content-between">
			<h1>
				<c:out value="${oneBook.title}" />
			</h1>
			<a href="/books">Back to the shelves</a>
		</div>
		<div>
			<b class="text-danger">${oneBook.postedBy.userName}</b>
			<b> read </b>
			<b class="text-primary"><c:out value="${oneBook.title}" /> by</b> 
			<b class="text-success"><c:out value="${oneBook.author}" /></b>
		</div>
		<div>
			<h2>Here are ueser's thaughts :</h2>
			<br> <br>
			<textarea>
		 <c:out value="${oneBook.thaughts}" />
		
		
		</textarea>



		</div>

	</div>

</body>
</html>