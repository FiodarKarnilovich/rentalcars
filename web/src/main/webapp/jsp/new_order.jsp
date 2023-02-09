
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<jsp:include page="_header.jsp"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<h2>Выбедите дату и количество дней</h2>
<form style="width: 50% ; margin-left: 10%" action="${pageContext.request.contextPath}/new_order/${car.id}.html" method="post">

    <div class="row mb-4">
        <div class="col">
            <div class="form-outline">
                <input type="number" name="carID" id="carID" class="form-control" value="<c:out value="${car.id}"/>"/>
                <label class="form-label" for="carID">ID Машины</label>
            </div>
        </div>
        <div class="col">
            <div class="form-outline">
                <input type="date" name="dateStart" id="dateStart" class="form-control" />
                <label class="form-label" for="dateStart">Дата начала аренды</label>
            </div>
        </div>
        <div class="col">
            <div class="form-outline">
                <input type="date" name="dateFinish" id="dateFinish" class="form-control" />
                <label class="form-label" for="dateFinish">Дата окончания аренды</label>
            </div>
        </div>
        <div class="col">
            <div class="form-outline">
                <input type="text" name="amountOfDays" id="amountOfDays" class="form-control" />
                <label class="form-label" for="amountOfDays">Дни</label>
            </div>
        </div>
    </div>

    <!-- Submit button -->
    <button type="submit"  class="btn btn-primary btn-block mb-4">Забронировать</button>


</form>




<jsp:include page="_footer.jsp"/>
