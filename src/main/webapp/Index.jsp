<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: manin
  Date: 7/9/2023
  Time: 11:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>
<center>
<div class="container mt-4">
    <form action="/check" method="get" class="border">
        <label for="1">Username:</label><br>
        <input type="text" name="username" id="1" placeholder="Enter your username"><br>
        <label class="mt-3" for="2">Password:</label><br>
        <input type="password" name="password" id="2" placeholder="Enter your password"><br>
        <input class="mt-3 btn btn-primary" type="submit" value="Login"><br><br>
        <%
            ArrayList<Integer> arr = (ArrayList<Integer>) request.getAttribute("val");
            if (arr.get(0) == 0){
                %>
                <p style="color: red">Username or Password is invalid!</p>
        <%
            }
        %>
        <p>Dont have an account? <a href="/cadd">Sign up</a></p>
        <p>Forgot your Password? <a href="Forgot.jsp">Click here</a></p>
    </form>
</div>
</center>
</body>
</html>
