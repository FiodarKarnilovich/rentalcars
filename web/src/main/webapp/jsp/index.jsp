<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://getbootstrap.com/docs/5.2/assets/css/docs.css" rel="stylesheet">
    <title>index</title>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>

<body style="background-image: url(${pageContext.request.contextPath}/img/home-img.jpg);
      height: 100vh;
      background-size: cover;
      background-repeat: no-repeat;
      background-position: center center;">

    <header>
    <ul class="nav justify-content-end">
        <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="/rentalcars/">Home</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/jsp/contacts.jsp">Contacts</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/jsp/rentalcars.jsp">Rental Cars</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/jsp/login.jsp">Login</a>
        </li>
    </ul>
    </header>

    <img src="${pageContext.request.contextPath}/img/home-img.jpg" alt="тут должна быть картинка"/>
    <a href="${pageContext.request.contextPath}/test_jpg.html">test jpg</a>
<jsp:include page="_footer.jsp"/>