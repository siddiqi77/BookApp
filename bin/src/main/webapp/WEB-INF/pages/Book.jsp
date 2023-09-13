<html>
<head>

<title>Book App</title>
<style>
    body {
      background-image: url('/images/Book5.jpg');
      background-position: center;
      background-repeat: no-repeat;
      background-size: cover;
    }

    img {
      opacity: 0.2;

    }
    a:link {
  color: rgb(163, 206, 7);
  background-color: transparent;
  text-decoration: none;
  margin-left: 3%;
}

a:visited {
  color: pink;
  background-color: transparent;
  text-decoration: none;
}

a:hover {
  color: red;
  background-color: transparent;
 
}

h3{
    margin-left: 1%;
}
    </style>
<body bgcolor="grey">
<h1>Welcome to Book App</h1><br><br>
<h3>Perform Book Operations</h3><br>
<a href="${pageContext.request.contextPath}/book/add" >Add Book</a><br><br>
<a href="${pageContext.request.contextPath}/book/edit">Modify Book Info</a><br><br>
<a href="${pageContext.request.contextPath}/book/remove">Remove Book</a><br><br>
<a href="${pageContext.request.contextPath}/book/search">Search Book</a><br><br>
<a href="${pageContext.request.contextPath}/book/showAll">Show All Books Info</a><br><br>
<a href="${pageContext.request.contextPath}/book/uploadBook">Upload Book</a><br><br>
<a href="${pageContext.request.contextPath}/book/email">Email Book Info</a><br><br>

</body>
</head>
</html>