<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<a href="/">Home</a>
<a href="/ShowPersonnes">Show Personnes</a>
<a href="/addPersonne">Add new Personnes</a>

<div>
    <c:out value="${ personne.num } ${ personne.prenom } ${ personne.nom }"></c:out>
</div>

</body>
</html>