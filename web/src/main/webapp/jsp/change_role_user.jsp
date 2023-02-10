
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%--<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>--%>
<jsp:include page="_header.jsp"/>

<h2>Сменить роль</h2>

<form style="width: 50%; margin-left: 10%"  method="post" action="${pageContext.request.contextPath}/change_role_user/${user.userId}.html">

    <div class="mb-3">
        <label for="roleName">Выбрать роль</label>
        <select class="form-select" id="roleName" name="roleName">
            <c:forEach items="${roles}" var="role">
                <option value="<c:out value="${role.roleName}"/>"><c:out value="${role.roleName}"/></option>
            </c:forEach>
        </select>
    </div>
    <button type="submit" class="btn btn-primary">Сменить</button>

</form>

<jsp:include page="_footer.jsp"/>
