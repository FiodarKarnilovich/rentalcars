<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="_header.jsp"/>


<table class="table">
    <thead>
    <tr>
        <th scope="col">Номер заказа</th>
        <th scope="col">Модель и бренд авто</th>
        <th scope="col">Имя пользователя</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${orders}" var="order">
        <tr>
            <td>
                <a class="nav-link" href="${pageContext.request.contextPath}/view_order_details/${order.orderId}.html">
                    <c:out value="${order.orderId}"/>
                </a>
            </td>
            <td><c:out value="${order.autoOrderId.autoModel.autoBrand.brand} ${order.autoOrderId.autoModel.model}"/></td>
            <td><c:out value="${order.userOrderId.firstName} ${order.userOrderId.lastName}"/></td>
        </tr>
    </c:forEach>

    </tbody>
</table>

<%--<nav aria-label="Page navigation example">--%>
<%--    <ul class="pagination">--%>
<%--        <c:forEach items="${pages}" var="page">--%>
<%--            <li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/showlistcars/${page}.html">${page}</a></li>--%>
<%--        </c:forEach>--%>
<%--    </ul>--%>
<%--</nav>--%>




<jsp:include page="_footer.jsp"/>