
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="_header.jsp"/>

<h1> Введите данные новой машины </h1>

<form style="width: 50% ; margin-left: 10%" method="post" action="${pageContext.request.contextPath}/new_car_registration.html" enctype="multipart/form-data">
    <div class="mb-3">
        <label for="photo" class="form-label">Фото машины</label>
        <input type="file" name="photo" class="form-control" id="photo">
    </div>
    <!-- бренд авто -->
    <div class="mb-3">
        <label for="brandAuto" class="form-label">Бренд</label>
        <input type="text" name="brandAuto" class="form-control" id="brandAuto" aria-describedby="nameHelp">
        <div id="brand" class="form-text">Введите бренд авто</div>
    </div>
    <!-- модель авто -->
    <div class="mb-3">
        <label for="modelAuto" class="form-label">Модель</label>
        <input type="text" name="modelAuto" class="form-control" id="modelAuto" aria-describedby="nameHelp">
        <div id="model" class="form-text">Введите модель авто</div>
    </div>

    <!-- цвет авто -->
    <div class="mb-3">
        <label for="colourAuto" class="form-label">Цвет</label>
        <input type="text" name="colourAuto" class="form-control" id="employeeDetail.city" aria-describedby="nameHelp">
        <div id="colourAuto" class="form-text">Введите цвет авто</div>
    </div>
    <!-- год авто -->
    <div class="mb-3">
        <label for="yearAuto" class="form-label">Год</label>
        <input type="text" name="employeeDetail.street" class="form-control" id="yearAuto" aria-describedby="nameHelp">
        <div id="year" class="form-text">Введите год авто</div>
    </div>

    <!-- цена авто -->
    <div class="mb-3">
        <label for="priceAuto" class="form-label">Цена</label>
        <input type="text" name="priceAuto" class="form-control" id="priceAuto" aria-describedby="nameHelp">
        <div id="price" class="form-text">Введите цену за сутки</div>
    </div>
    <button type="submit" class="btn btn-primary">Зарегистрировать</button>
</form>

<jsp:include page="_footer.jsp"/>