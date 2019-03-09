<%--
  Created by IntelliJ IDEA.
  User: Ben
  Date: 07/03/2019
  Time: 22:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculatrice</title>
    <meta charset="utf-8">
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <style type="text/css">
    </style>
</head>

<body>
<header>
    <h1>Calculatrice</h1>
</header>

<div>
    <form class="col-lg-6">
        <legend>Calculatrice</legend>

        <p>Le résultat : ${resultat}</p>

        <div class="form-group">
            <input id="num_1" type="number" name="num_1" class="form-control">

            <select id="signe" class="form-control">
                <option value="+">+</option>
                <option value="-">-</option>
                <option value="*">*</option>
                <option value="/">/</option>
            </select>

            <input id="num_2" type="number" name="num_2" class="form-control">
            <input type="submit" value="Calcul">
        </div>

    </form>

</div>
</body>
</html>
