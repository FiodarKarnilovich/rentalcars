<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>--%>
<jsp:include page="_header.jsp"/>


<h2>Детали ордера</h2>

<table class="table">
    <thead>
    <tr>
        <th scope="col">Order id</th>
        <th scope="col">Модель и бренд авто</th>
        <th scope="col">Имя пользователя</th>
        <th scope="col">Старт</th>
        <th scope="col">Финиш</th>
        <th scope="col">Количество дней</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td><c:out value="${order.orderId}"/></td>
        <td><c:out value="${order.autoOrderId.autoModel.autoBrand.brand} ${order.autoOrderId.autoModel.model}"/></td>
        <td><c:out value="${order.userOrderId.firstName} ${order.userOrderId.lastName}"/></td>
        <td><c:out value="${order.dateStart}"/></td>
        <td><c:out value="${order.dateFinish}"/></td>
        <td><c:out value="${order.amountOfDays}"/></td>
    </tr>

    </tbody>
</table>

<security:authorize access="hasRole('ROLE_ADMIN')">
    <a class="nav-link" href="${pageContext.request.contextPath}/delete_car/${car.id}.html">
        <button type="button" class="btn btn-primary btn-lg">Удалить ордер</button>
    </a>
</security:authorize>


<jsp:include page="_footer.jsp"/>
