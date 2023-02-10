<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://getbootstrap.com/docs/5.2/assets/css/docs.css" rel="stylesheet">
    <title>index</title>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<%--https://www.teahub.io/photos/full/19-198007_audi-r8-black-red.jpg--%>

<body style="background-image: url(https://www.teahub.io/photos/full/19-198007_audi-r8-black-red.jpg);
      height: 100vh;
      background-size: cover;
      background-repeat: no-repeat;
      background-position: center center;">

    <header>
    <ul class="nav justify-content-end">
        <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="${pageContext.request.contextPath}/">Home</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/contacts.html">Contacts</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/showlistcars/1.html">Rental Cars</a>
        </li>
        <li class="nav-item">
<security:authorize access="!isAuthenticated()">
            <a class="nav-link" href="${pageContext.request.contextPath}/login.html">Login</a>
</security:authorize>
        </li>
        <li class="nav-item">
        <security:authorize access="isAuthenticated()">
            <a class="nav-link" href="${pageContext.request.contextPath}/logout">Logout</a>
        </security:authorize>
        </li>

    </ul>
    </header>

<jsp:include page="_footer.jsp"/>