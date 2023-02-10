<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ page contentType="image/jpg"%>--%>
<jsp:include page="_header.jsp"/>

<table class="table">
    <thead>
    <tr>
        <th scope="col">Brand</th>
        <th scope="col">Model</th>
        <th scope="col">Price</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listCars}" var="car">
    <tr>
        <td>
        <a class="nav-link" href="${pageContext.request.contextPath}/view_car_details/${car.id}.html">
        <c:out value="${car.brand}"/>
        </a>
        </td>
        <td><c:out value="${car.model}"/></td>
        <td><c:out value="${car.price}"/></td>
    </tr>
    </c:forEach>

    </tbody>
</table>

<nav aria-label="Page navigation example">
    <ul class="pagination">
<c:forEach items="${pages}" var="page">
        <li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/showlistcars/${page}.html">${page}</a></li>
</c:forEach>
    </ul>
</nav>

<security:authorize access="hasRole('ROLE_ADMIN')">
<<a class="nav-link" href="${pageContext.request.contextPath}/new_car_registration.html">
    <button type="submit" class="btn btn-outline-danger">Добавить авто</button>
</a>
</security:authorize>

<br>
<security:authorize access="hasRole('ROLE_ADMIN')">
    <<a class="nav-link" href="${pageContext.request.contextPath}/show_list_order.html">
        <button type="submit" class="btn btn-outline-danger">Заказы</button>
    </a>
</security:authorize>
<br>
<security:authorize access="hasRole('ROLE_ADMIN')">
    <<a class="nav-link" href="${pageContext.request.contextPath}/showlistusers/1.html">
        <button type="submit" class="btn btn-outline-danger">Пользователи</button>
    </a>
</security:authorize>




<jsp:include page="_footer.jsp"/>
