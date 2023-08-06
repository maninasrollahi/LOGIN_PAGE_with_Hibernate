<%--
  Created by IntelliJ IDEA.
  User: manin
  Date: 7/16/2023
  Time: 2:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Password recovery</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>
<center>
<form action="/Forgot" class="container m-3">
    <label for="email">email:</label><br>
    <input class="m-2" type="email" id="email" name="email" placeholder="enter your email"><br>
    <label for="username">username:</label><br>
    <input class="m-2" type="text" id="username" name="username" placeholder="enter your username"><br>
    <input class="btn btn-primary" type="submit" value="next">
</form>
</center>
</body>
</html>
