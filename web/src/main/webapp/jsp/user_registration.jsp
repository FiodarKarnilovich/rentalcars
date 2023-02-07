<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="_header.jsp"/>

<form style="width: 50% ; margin-left: 10%">
    <!-- 2 column grid layout with text inputs for the first and last names -->
    <div class="row mb-4">
        <div class="col">
            <div class="form-outline">
                <input type="text" id="form3Example1" class="form-control" />
                <label class="form-label" for="form3Example1">Имя</label>
            </div>
        </div>
        <div class="col">
            <div class="form-outline">
                <input type="text" id="form3Example2" class="form-control" />
                <label class="form-label" for="form3Example2">Фамилия</label>
            </div>
        </div>
    </div>

    <!-- Email input -->
    <div class="form-outline mb-4">
        <input type="email" id="form3Example3" class="form-control" />
        <label class="form-label" for="form3Example3">Email</label>
    </div>

    <!-- Password input -->
    <div class="form-outline mb-4">
        <input type="password" id="form3Example4" class="form-control" />
        <label class="form-label" for="form3Example4">Пароль</label>
    </div>

    <div class="form-outline mb-4">
        <input type="password" id="form3Example5" class="form-control" />
        <label class="form-label" for="form3Example4">Дата рождения</label>
    </div>

    <div class="form-outline mb-4">
        <input type="password" id="form3Example6" class="form-control" />
        <label class="form-label" for="form3Example4">Номер телефона</label>
    </div>


    <!-- Submit button -->
    <button type="submit"  class="btn btn-primary btn-block mb-4">Регистрация</button>


</form>

<jsp:include page="_footer.jsp"/>
