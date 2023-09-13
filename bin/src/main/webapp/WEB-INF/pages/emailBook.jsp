<html>
<head> <title>Modify Book Details</title></head>
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

            input[type=submit]{
               
                margin-left: 10%;
            }
</style>

<Body>
<h1> This Service is currently unavailable ....Please wait for sometime for this to active. </h1><br><br>
    <h2>Send Book Information to Mail Id </h2><hr><br><br>
    <form action="emailBook" method="post">
        <label >Enter Book Id :</label>
<input type="text" name="bookName" id="id"><br><br>
<label >Enter Mail Id :</label>
<input type="text" name="mailId" id="id"><br><br>
<input type="submit" value="Send">
<br><br>
</form>
<a href="${pageContext.request.contextPath}/book/hi" target="_parent">back</a>

</Body>
</html>