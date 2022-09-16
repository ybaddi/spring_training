<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h2>Ajouter une nouvelle personne</h2>
<form method="POST" action="addPersonne">
    <div>
        Nom : <input type="text" name="nom">
    </div>
    <div>
        Prenom : <input type="text" name="prenom">
    </div>
    <button>Ajouter</button>
</form>
</body>
</html>