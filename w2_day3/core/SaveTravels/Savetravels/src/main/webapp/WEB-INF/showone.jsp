<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Show one Expense</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <!-- Incluez ici vos liens vers d'autres fichiers CSS si nécessaire -->
</head>
<body>
    <div class="container mt-5">
        <div class="d-flex justify-content-between">
            <h1 class="text-success">Expense Details</h1>
            <a href="/expences">GO BACK</a>
        </div>

        <div class="mx-5 mt-3">
            <p><strong>Expense Name:</strong> <c:out value="${onePocketBook.expences}" /></p>
            <p><strong>Vendor:</strong> <c:out value="${onePocketBook.vender}" /></p>
            <p><strong>Amount:</strong> <c:out value="${onePocketBook.amount}" /></p>
            <p><strong>Description:</strong> <c:out value="${onePocketBook.description}" /></p>

            <div class="mt-4">
                <h2><strong>Amount:</strong> ${onePocketBook.amount}</h2>
            </div>
        </div>
    </div>

    <!-- Ajoutez ici vos scripts JavaScript si nécessaire -->
</body>
</html>
