<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
<div class="w-50 mx-auto mt-3">
	<h1>Send an Omikuji!</h1>
		<form action="/process" method="post" class="border p-3 rounded">
			<div class="mb-3">
				<label class="form-label">Pick any number from 5 to 25</label> <br>
				<input type="number" name="year" class="form-control">
			</div>
			<div class="mb-3">
				<label class="form-label">Enter the name of any city</label><br>
				<input type="text" name="city" class="form-control">
			</div>
			<div class="mb-3">
				<label class="form-label">Enter the name of any real person</label><br>
				<input type="text" name="person" class="form-control">
			</div>
			<div class="mb-3">
				<label class="form-label">Enter professional endeavor or hobby</label><br>
				<input type="text" name="hobby" class="form-control">
			</div>
			<div class="mb-3">
				<label class="form-label">Enter only type of living thing</label><br>
				<input type="text" name="thing" class="form-control">
			</div>
			<div class="mb-3">
				<label class="form-label">Say something nice to someone</label><br>
				<br>
				
				 <textarea type="text" name="message" class="form-control"></</textarea>
				
			</div>
			<div class="mb-3">
				<label class="form-label">Send and show a friend</label>
				
			</div>
			<button type="submit" >Send</button>
	
	
	
	
	



</</div>


</body>
</html>