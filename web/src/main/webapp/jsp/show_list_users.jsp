<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="_header.jsp"/>


<table class="table">
    <thead>
    <tr>
        <th scope="col">Имя</th>
        <th scope="col">Фамилия</th>
        <th scope="col">Телефон</th>
        <th scope="col">Роль</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listUsers}" var="user">
        <tr>
            <td>
                <a class="nav-link" href="${pageContext.request.contextPath}/view_user_details/${user.id}.html">
                    <c:out value="${user.name}"/>
                </a>
            </td>
            <td><c:out value="${user.lastName}"/></td>
            <td><c:out value="${user.phone}"/></td>
            <td><c:out value="${user.role}"/></td>
        </tr>
    </c:forEach>

    </tbody>
</table>

<nav aria-label="Page navigation example">
    <ul class="pagination">
        <c:forEach items="${pages}" var="page">
            <li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/showlistusers/${page}.html">${page}</a></li>
        </c:forEach>
    </ul>
</nav>


<form action="${pageContext.request.contextPath}/new_user_registration.html" method="GET">
    <button type="submit" class="btn btn-outline-danger">Добавить пользователя</button>
</form>


<jsp:include page="_footer.jsp"/>
