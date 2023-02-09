<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<jsp:include page="_header.jsp"/>

<form style="width: 50% ; margin-left: 10%" method="post" action="${pageContext.request.contextPath}/user_registration.html">
    <h2>Регистрация нового пользователя</h2>

    <!-- 2 column grid layout with text inputs for the first and last names -->
    <div class="row mb-4">
        <div class="col">
            <div class="form-outline">
                <input type="text" name="firstName" id="firstName" class="form-control" />
                <label class="form-label" for="firstName">Имя</label>
            </div>
        </div>
        <div class="col">
            <div class="form-outline">
                <input type="text" name="lastName" id="lastName" class="form-control" />
                <label class="form-label" for="lastName">Фамилия</label>
            </div>
        </div>
    </div>

    <!-- Email input -->
    <div class="form-outline mb-4">
        <input type="email" name="email" id="email" class="form-control" />
        <label class="form-label" for="email">Email</label>
    </div>

    <!-- Password input -->
    <div class="form-outline mb-4">
        <input type="password" name="password" id="password" class="form-control" />
        <label class="form-label" for="password">Пароль</label>
    </div>

    <div class="form-outline mb-4">
        <input type="text" name="birthDay" id="birthDay" class="form-control" />
        <label class="form-label" for="birthDay">Дата рождения</label>
    </div>

    <div class="form-outline mb-4">
        <input type="text" name="phoneNumber" id="phoneNumber" class="form-control" />
        <label class="form-label" for="phoneNumber">Номер телефона</label>
    </div>

    <!-- Submit button -->
    <button type="submit"  class="btn btn-primary btn-block mb-4">Регистрация</button>


</form>

<jsp:include page="_footer.jsp"/>
