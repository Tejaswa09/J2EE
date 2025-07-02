<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page  isELIgnored="false" %>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
</head>
<body>

<h1>The table element</h1>

<table >
  <tr>

    <th>Given Name</th>
     <th>Sur Name</th>
     <th>Email Id</th>


  </tr>

  <c:forEach  items="${ listOfUsers }"  var="dto" >
  <tr>
   <td>${ dto.getGivenName() }</td>
   <td>${ dto.getSurName() }</td>
   <td>${ dto.getEmail() }</td>

    </tr>
  </c:forEach>


</table>

</body>
</html>