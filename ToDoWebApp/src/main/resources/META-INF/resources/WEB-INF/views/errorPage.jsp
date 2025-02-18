<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Error</title>
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <h2 class="text-danger">Oops! Something went wrong.</h2>
    <p>${errorMessage}</p>
    <a href="list" class="btn btn-primary">Go Back to List</a>
</div>
</body>
</html>
