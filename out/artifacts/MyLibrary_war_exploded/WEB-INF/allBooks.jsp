<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
    <h1 class="myLibrary">My Library - Your Bookshelf</h1>
    <div id="formContent2">

        <div class="container">
            <div class="row">
                <%--            <c:if test="${not empty sessionScope.books} ">--%>
                <c:forEach var="book" items="${sessionScope.books}">
                        <div class="col-sm">
                            <div class="card" style="width: 18rem;">
                                <div class="card-body">
                                    <h5 class="card-title"><c:out value="${book.title}"/></h5>
                                    <h6 class="card-title"><c:out value="${book.author}"/></h6>
                                    <h7>Note: <c:out value="${book.note}"/></h7>
                                    <p class="card-text"><c:out value="${book.description}" /></p>
                                    <a href="#" class="btn btn-primary">Add to your Bookshelf</a>
                                </div>
                            </div>
                        </div>
                </c:forEach>
            </div>
        </div>

        <a href="login"><button type="button" class="btn btn-primary btn-sm">BACK</button></a>
    </div>
</div>
<script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
</body>
</html>