<%--
  Created by IntelliJ IDEA.
  User: Maciek
  Date: 11.03.2020
  Time: 11:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>MyLibrary</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" type="text/css" rel="stylesheet">
           -->
    <link href="${pageContext.request.contextPath}/resources/css/styles.css" type="text/css" rel="stylesheet">

    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">

    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
<div class="wrapper fadeInDown">
    <h1 class="myLibrary">My Library - Add new book</h1>
    <div id="formContent">
        <!-- Tabs Titles -->

        <!-- Icon -->
        <div class="fadeIn first">
            <img src="${pageContext.request.contextPath}/resources/img/book-open-solid.svg" id="icon1" alt="Book Icon" />
        </div>
        <form  class="form-signin" action="add" method="post">
            <input type="text" id="title" class="fadeIn second" name="inputTitle" placeholder="Title" required autofocus >
            <input type="text" id="author" class="fadeIn second" name="inputAuthor" placeholder="Author" required autofocus >
            <input type="number" id="note" class="fadeIn second" name="inputNote" max="10" min="1"
                   placeholder="Your note (1-10)" required autofocus >
            <input name="inputUrl" type="text" class="fadeIn second" placeholder="URL"
                   required autofocus />
            <input type="text" id="description" class="fadeIn second" name="inputDescription" placeholder="Description..."
                      required autofocus >
            <input type="submit" class="fadeIn fourth" value="ADD">

        </form>
        <a style="padding-bottom: 32px" href="login"><button type="button" class="btn btn-primary btn-sm">BACK</button></a>
        </div>


    </div>
</div>
<script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
</body>
</html>
