<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Update To-Do</title>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <h2>Update To-Do</h2>

    <!-- Show error message if ToDo not found -->
    <c:if test="${not empty errorMessage}">
        <div class="alert alert-danger">${errorMessage}</div>
    </c:if>

    <form:form method="post" modelAttribute="todo" action="update-todo">
        <form:hidden path="id"/> <!-- Preserve ID in hidden input -->
        
        <div class="mb-3">
            <label>Description:</label>
            <form:input type="text" path="description" class="form-control"/>
            <form:errors path="description" cssClass="text-warning"/>
        </div>

        <button type="submit" class="btn btn-success">Update</button>
    </form:form>
</div>

<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>

</body>
</html>
