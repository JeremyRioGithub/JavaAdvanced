<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulaire</title>
</head>
<body>
	<h1>userform</h1>
	<form action="userresult" method="GET">
		<label>Nom:</label> 	<input type="text"  value="Rio" name="nom" />
		<label>Prenom:</label> 	<input type="text" value="Jeremy" name="prenom" />
		<button type="submit">Send</button>
	</form>
	<a href="index">go back to main</a>

</body>
</html>