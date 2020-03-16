<%--
  Created by IntelliJ IDEA.
  User: Maciek
  Date: 11.03.2020
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MyLibrary</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" type="text/css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/styles.css" type="text/css" rel="stylesheet">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
<div class="wrapper fadeInDown">
    <h1 class="myLibrary">My Library</h1>

    <a href="allBooks" type="button" class="btn btn-primary btn-lg mybtn">
        <span style="font-size: 2rem;letter-spacing: 2px" >See all books</span></a>
    <a style="background: rebeccapurple" href="bookshelf" type="button" class="btn btn-primary btn-lg mybtn">
        <span style="font-size: 2rem;letter-spacing: 2px" >See your bookshelf</span></a>
    <a href="add" type="button" class="btn btn-secondary btn-lg mybtn">
        <span style="font-size: 2rem;letter-spacing: 2px" >Add book to your bookshelf</span></a>
    <a href="logout"type="button" class="btn btn-third btn-lg mybtn">
        <span style="font-size: 2rem;letter-spacing: 2px" >LOGOUT</span></a>

</div>

<script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
</body>
</html>
