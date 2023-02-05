
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://getbootstrap.com/docs/5.2/assets/css/docs.css" rel="stylesheet">
    <title>View Car Details</title>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<header>
    <ul class="nav justify-content-end">
        <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="${pageContext.request.contextPath}/index.html">Home</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/contacts.html">Contacts</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/rentalcars.html">Rental Cars</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="${pageContext.request.contextPath}/login.html">Login</a>
        </li>
    </ul>
</header>


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

<footer style="position:absolute; left: 0; bottom: 0">
    проект Корниловича ФФ
</footer>

</body>
</html>
