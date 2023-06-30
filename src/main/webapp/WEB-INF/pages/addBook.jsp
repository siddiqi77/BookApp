<html>
<head>
    <style>
        body {
          background-image: url('/images/Book4.jpg');
          background-position: center;
          background-repeat: no-repeat;
          background-size: cover;
          margin-right: 5%;

        }

       h1{
        background-color:darkgrey;
        padding: 1%;
        margin-right:73%;

       }
        label {
            float:left;
            width: 10%;
             margin-top: 6px;
        }
        input[type=text]{
            width: 25%;
            margin-top: 6px;
            margin-right: 50%;
            
       }

       input[type=submit, reset]{
            width: 10%;
            margin-top: 6px;
            margin-right: 50%;
            
       }

       select {
            width: 25%;
            margin-top: 6px;
            margin-right: 50%;
            
       }

         p {
            margin-left: 5%;
        }

        a {
            color: rgb(223, 226, 213);
            margin-left: 3%;
            }
   
        </style>
<title>Add Book Info</title>
<body bg>
<h1>Add Book Information</h1><hr>
<div class="container">
<form action="create" method="post">
    
    <label>Book Id:</label><input type="text" placeholder="bookid" required name="bookId" id="id"><br><br>
    <label>Book Name:</label><input type="text" name="bookName" id="name"><br><br>
    <label>Book Type:</label> <select name="bookType" id="type" required="true">
                            <option value=" " ></option>
                            <option value="fiction">Fiction</option>
                            <option value="non-fiction">Non-Fiction</option>
                            <option value="education">Education</option>
                            <option value="history">History</option>
                            <option value="biography">Biography</option>
                            </select><br><br>
    <label>Book Author:</label><input type="text" name="bookAuthor" id="author"><br><br>
    <label>Publish date:</label><input type="date" name="pDate" id="date"><br><br>
    <p><input type="submit" value="Add Book"> <input type="reset" value="Reset"></p>
        <a href="${pageContext.request.contextPath}/book/hi" target="_parent">back</a>
</form>
</div>
</body>
</head>
</html>