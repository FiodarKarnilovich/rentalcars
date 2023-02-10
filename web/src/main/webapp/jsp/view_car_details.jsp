<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>--%>
<jsp:include page="_header.jsp"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set value="${car}" var="car"/>
<img width="800" src="${pageContext.request.contextPath}/image/${car.id}/photo.jpg" class="rounded mx-auto d-block" alt="picture car" datatype="image/jpg">

<table class="table">
    <thead>
    <tr>
        <th scope="col">Brand</th>
        <th scope="col">Model</th>
        <th scope="col">Color</th>
        <th scope="col">Trancemission</th>
        <th scope="col">Year</th>
        <th scope="col">Price</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td><c:out value="${car.brand}"/></td>
        <td><c:out value="${car.model}"/></td>
        <td><c:out value="${car.colourAuto}"/></td>
        <td><c:out value="${car.trancemissionAuto}"/></td>
        <td><c:out value="${car.yearAuto}"/></td>
        <td><c:out value="${car.priceAuto}"/></td>
    </tr>

    </tbody>
</table>

<security:authorize access="isAuthenticated()">
<a class="nav-link" href="${pageContext.request.contextPath}/new_order/${car.id}.html">
<button type="button"  class="btn btn-primary btn-lg">Забронировать</button>
</a>
</security:authorize>

<security:authorize access="hasRole('ROLE_ADMIN')">
<a class="nav-link" href="${pageContext.request.contextPath}/change_price/${car.id}.html">
<button type="button" class="btn btn-primary btn-lg">Редактировать цену</button>
</a>
</security:authorize>

<security:authorize access="hasRole('ROLE_ADMIN')">
<a class="nav-link" href="${pageContext.request.contextPath}/delete_car/${car.id}.html">
<button type="button" class="btn btn-primary btn-lg">Удалить машину</button>
</a>
</security:authorize>


<jsp:include page="_footer.jsp"/>
