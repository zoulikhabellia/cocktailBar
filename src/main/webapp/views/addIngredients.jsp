<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>

<c:url value="/css/paper.css" var="paperCss" />
<link rel="stylesheet" href="${paperCss}"/>
</head>
<body>


	<c:url value="/ingredients/add.html" var="addUrl" />

<div class="container">
		<h1>Ajouter un ingrédient :</h1>


		<form action="${addUrl}" method="POST" class=>

			<label for="name">Nom: </label> <input id="name" name="name">

<label for="state">Etat: </label> <input type="number" min="0"	max="2" id="state" name="state" />

			<button>Valider</button>


		</form>
	</div>
	<div
		style="position: fixed; bottom: 0; left: 0; padding: 20px; font-size: 18px;">
		<a href="<c:url value='/' />">Retour</a>

	</div>
</body>
</html>