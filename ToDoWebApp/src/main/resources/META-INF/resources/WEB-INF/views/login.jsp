<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <div class="container">
   <h2>Login</h2>
    <form method="post" action="/login">
        First Name: <input type="text" name="firstname" required>
        <br><br>
        Last Name: <input type="text" name="lastname" required>
        <br><br>
        Password: <input type="password" name="password" required>
        <br><br>
        <button type="submit">Login</button>
    </form>
    <p style="color: red;">${errorMessage}</p>
    </div>
</body>
</html>
