
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Hello, This is ToDo's Page</title>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
    <link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <p>Add To-do tasks here.</p>

    <!-- Display Validation Error Messages -->
    <c:if test="${not empty errorMessage}">
        <div class="alert alert-danger">${errorMessage}</div>
    </c:if>

    <form:form method="post" modelAttribute="todo" action="addTodo">  <%-- Ensure form action is correct --%>
       <fieldSet class="mb-3">
            <form:label path="Description">Description:</form:label>
            <form:input type="text" path="description" required="required"/>
            <form:errors path="description" cssClass="text-warning"/>
  </fieldSet>
        
        <fieldSet class="mb-3">
            <form:label path="trackDate">TargetDate:</form:label>
            <form:input type="text" path="trackDate" required="required"/>
            <form:errors path="trackDate" cssClass="text-warning"/>
  </fieldSet>
        
         <!-- Hidden Inputs -->
       
        <form:input type="hidden" path="id"/>
        <form:input type="hidden" path="done"/>
		<input type="submit" class="btn btn-success"/> 
       
              

       <!--   <button type="submit" class="btn btn-success">Submit</button>-->
    </form:form>
</div>

<!-- Include Bootstrap and jQuery -->
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
<script type="text/javascript">
$('#trackDate').datepicker({
    format: 'yyyy-MM-dd',
    startDate: '-3d'
});
</script>
</body>
</html>




















