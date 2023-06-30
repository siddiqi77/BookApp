<html>
<head> <title>Search Book Details</title></head>
<style>
    body {
      background-image: url('/images/Book7.jpg');
      background-position: center;
      background-repeat: no-repeat;
      background-size: cover;
    }

    label {
        color: aliceblue;
        margin-left: 5%;
    }

    a {
            color: rgb(223, 226, 213);
            margin-left: 3%;
            }
            h1{
            color: rgb(243, 237, 237);
            }
</style>

<Body>
    <h1 >Search Book </h1><hr><br><br>
    <form action="searchBook" method="get">
<label >Enter Book Name to Search:</label>
<input type="text" name="bookName" id="id">
<input type="submit" value="search">
<br><br>
</form>
<a href="${pageContext.request.contextPath}/book/hi" target="_parent">back</a>

</Body>
</html>