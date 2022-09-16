<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
 <c:forEach items="${ personnes }" var="personne">
     <div>
         <c:out value="${ personne.prenom } ${ personne.nom }"></c:out>
     </div>

 </c:forEach>
</body>
</html>