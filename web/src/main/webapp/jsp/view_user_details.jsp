<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<jsp:include page="_header.jsp"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set value="${user}" var="user"/>

<table class="table">
    <thead>
    <tr>
        <th scope="col">id</th>
        <th scope="col">Имя</th>
        <th scope="col">Фамилия</th>
        <th scope="col">Email</th>
        <th scope="col">Дата рождения</th>
        <th scope="col">Телефон</th>
        <th scope="col">роль</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td><c:out value="${user.userId}"/></td>
        <td><c:out value="${user.firstName}"/></td>
        <td><c:out value="${user.lastName}"/></td>
        <td><c:out value="${user.email}"/></td>
        <td><c:out value="${user.birthDay}"/></td>
        <td><c:out value="${user.phoneNumber}"/></td>
        <td><c:out value="${user.appUserRole.roleName}"/></td>
    </tr>

    </tbody>
</table>

<%--<security:authorize access="hasRole('ROLE_ADMIN')">--%>
<%--    <a class="nav-link" href="${pageContext.request.contextPath}/change_role_user/${app_User.id}.html">--%>
<%--        <button type="button"  class="btn btn-primary btn-lg">Сменить роль</button>--%>
<%--    </a>--%>
<%--</security:authorize>--%>







<jsp:include page="_footer.jsp"/>


