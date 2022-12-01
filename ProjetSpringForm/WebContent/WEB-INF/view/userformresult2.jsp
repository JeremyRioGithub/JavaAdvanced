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
	<form action="userformresult2" method="POST">
		<label>Nom:</label> 	<input type="text"  value="Rio" name="nom" />
		<label>Prenom:</label> 	<input type="text" value="Jeremy" name="prenom" />
		<label>Password:</label> 	<input type="password" value="PassWord" name="password" />
		<button type="submit">Send</button>
	</form>
	<h1>userresult</h1>
	<p>Nom: ${nom}</p>
	<p>Prenom: ${prenom}</p>
	<p>Email: ${email}</p>
	<p>Password: ${password}</p>
	<br>
	<a href="index">go back to main</a>

</body>
</html>