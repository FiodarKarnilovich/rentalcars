
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="_header.jsp"/>


<h2>Выбедите дату и количество дней</h2>
<form style="width: 50% ; margin-left: 10%">

    <div class="row mb-4">
        <div class="col">
            <div class="form-outline">
                <input type="date" id="form3Example1" class="form-control" />
                <label class="form-label" for="form3Example1">Дата</label>
            </div>
        </div>
        <div class="col">
            <div class="form-outline">
                <input type="text" id="form3Example2" class="form-control" />
                <label class="form-label" for="form3Example2">Дни</label>
            </div>
        </div>
    </div>

    <!-- Submit button -->
    <button type="submit"  class="btn btn-primary btn-block mb-4">Забронировать</button>


</form>




<jsp:include page="_footer.jsp"/>
