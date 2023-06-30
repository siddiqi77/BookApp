<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Book Type List</title>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>
</head>
<body>

    <h3>Book Type List</h3><br><br>

    <table>
            <thead>
                <tr>
                    <th>Book Name</th>
                    <th>Book Id</th>
                    <th>Book Type</th>
                     <th>Book Author</th>
                      <th>Publish date</th>
                </tr>
            </thead>
            <tbody>
    <c:forEach items="${bookList}" var="lists">
    <tr>
       <td> ${lists.bookName}</td>
        <td> ${lists.bookId}</td>
         <td> ${lists.bookType}</td>
         <td> ${lists.bookAuthor}</td>
         <td> ${lists.pDate}</td>
           
          </tr> 
         
     </c:forEach>
     </table>
<br> <br>
   <a href="${pageContext.request.contextPath}/book/showAll" target="_parent">back</a> 
</body>
</html>