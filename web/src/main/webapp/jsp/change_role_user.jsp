
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>--%>
<jsp:include page="_header.jsp"/>

<h2>Сменить роль</h2>

<form style="width: 50%; margin-left: 10%"  method="post" action="change_role_user/{user.id}.html" enctype="multipart/form-data">

    <div class="mb-3">
        <label for="appUserRole.roleId">Выбрать роль</label>
        <select class="form-select" id="appUserRole.roleId" name="appUserRole.roleId">
            <c:forEach items="${appUserRole}" var="department">
                <option value="${appUserRole.roleId}">${appUserRole.roleId.roleName}</option>
            </c:forEach>
        </select>
    </div>
    <button type="submit" class="btn btn-primary">Сменить</button>

</form>>

<jsp:include page="_footer.jsp"/>
