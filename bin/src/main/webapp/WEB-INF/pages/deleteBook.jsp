<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Remove Book</title>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>
</head>
<body>

    <h3>Delete Book </h3><br><br>

    <table>
            <thead>
                <tr>
                    <th>Book Name</th>
                    <th>Book Id</th>
                    <th>Book Type</th>
                     <th>Book Author</th>
                      <th>Publish date</th>
                      <th>Operation</th>
                </tr>
            </thead>
           
             
        <tbody> 
        <form action="deleteBook" method="get">   
           <c:forEach items="${bookList}" var="lists">
        <tr>
   
         <td> ${lists.bookName}</td>
         <td> <input type="text" name="bookId" id="" value="${lists.bookId}" ></td>
         <td> ${lists.bookType}</td>
         <td> ${lists.bookAuthor}</td>
         <td> ${lists.pDate}</td>
         <td>
            <input type="submit" value="Delete">
         </td>
       </tr> 
         
          </c:forEach>
          </form>
         </tbody> 
     </table>
        <br> <br>
   <a href="${pageContext.request.contextPath}/book/hi" target="_parent">back</a> 
</body>
</html>