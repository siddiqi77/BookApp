<html>
<head>
    <title>Login Details</title>
</head>
<body bgcolor="grey">
    <h2>Welcome to Book App</h2>
    <h4>Login</h4><br> 
    <div>
    <form action="hi" method="get">
    Enter Email:<input type="email" name="email" id="">
    Enter Password: <input type="password" name="password" id="">
    <input type="submit" value="Login"></div>
</form>
<pre><div>
    <form action="saveUser" method="post">
    <h3>Enter Details to Register</h3><br>
    Email Id: <input type="email" name="email" id=""><br>
    Name: <input type="text" name="name" id=""><br>
    Role:  <br>
    <input type="checkbox" name="admin" id="">Admin 
    <input type="checkbox" name="student" id="">Student 
    <input type="checkbox" name="lecturer" id="">Lecturer 
    <input type="checkbox" name="publisher" id="">Publisher
    <input type="checkbox" name="author" id="">Author <br>
    Password: <input type="password" name="password" id=""><br><br>
    <input type="submit" value="Regsiter"> <br><br>
</div>
    ${message}

</form>
</pre>
</body>
</html>