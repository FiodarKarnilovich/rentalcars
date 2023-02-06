<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="_header.jsp"/>


<img src="img/home-img.jpg)" class="rounded mx-auto d-block" alt="picture car">

<table class="table">
    <thead>
    <tr>
        <th scope="col">Brand</th>
        <th scope="col">Model</th>
        <th scope="col">Color</th>
        <th scope="col">Trancemission</th>
        <th scope="col">Year</th>
        <th scope="col">Price</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>BMW</td>
        <td>X6</td>
        <td>red</td>
        <td>A</td>
        <td>2020</td>
        <td>100.0</td>
    </tr>

    </tbody>
</table>

<button type="button" class="btn btn-primary btn-lg">Сделать заказ</button>
<button type="button" class="btn btn-primary btn-lg">Редактировать цену</button>
<button type="button" class="btn btn-primary btn-lg">Удалить машину</button>

<jsp:include page="_footer.jsp"/>
