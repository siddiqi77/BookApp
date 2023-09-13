<html>
<head><title>Show All Books</title></head>
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
<body>
    <h1>Show All Books</h1><hr><br><br>
    <form action="showAllBookType" method="get">
    <label>Select Book Type:</label> <select name="bookType" id="type" required="true">
        <option value=" " ></option>
        <option value="fiction">Fiction</option>
        <option value="non-fiction">Non-Fiction</option>
        <option value="education">Education</option>
        <option value="history">History</option>
        <option value="biography">Biography</option>
        </select> 
        <input type="submit" value="Show Books"><br><br>
        </form>
        <a href="${pageContext.request.contextPath}/book/hi" target="_parent">back</a>
</body>
</html>