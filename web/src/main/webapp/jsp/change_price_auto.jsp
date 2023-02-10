<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>--%>
<jsp:include page="_header.jsp"/>


<h2>Ведите новую цену на авто</h2>

<form style="width: 50% ; margin-left: 10%" method="post"
      action="${pageContext.request.contextPath}/change_price/${car.id}.html" >
<div class="mb-3">
    <label for="price" class="form-label">Цена</label>
    <input type="text" name="price" class="form-control" id="price" aria-describedby="nameHelp">
    <div class="form-text">Введите новую цену за сутки</div>
</div>
<button type="submit" class="btn btn-primary">Поменять</button>

</form>


<jsp:include page="_footer.jsp"/>
