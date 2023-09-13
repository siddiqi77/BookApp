<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Modify Book</title>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>
</head>
<body>

    <h3>Modify Book </h3><br><br>

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
        <form action="updateBook" method="post">   
           <c:forEach items="${bookList}" var="lists">
        <tr>
   
         <td> <input type="text" name="bookName" id="" value="${lists.bookName}" ></td>
         <td> <input type="text" name="bookId" id="" value="${lists.bookId}" ></td>
         <td> <select name="bookType" id="type" required="true" >
            <option value=" " ></option>
            <option value="fiction">Fiction</option>
            <option value="non-fiction">Non-Fiction</option>
            <option value="education">Education</option>
            <option value="history">History</option>
            <option value="biography">Biography</option>
            </select></td>
         <td> <input type="text" name="bookAuthor" id="" value="${lists.bookAuthor}" ></td>
         <td> <input type="date" name="pDate" id="date" value="${lists.pDate}">  </td>
         <td>
            <input type="submit" value="Update">
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