<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Liste des cocktails</title>
<link rel="stylesheet" href="css/paper.css" />
</head>
<body>
<div class="container">
	<h1>Liste des cocktails</h1>
	<table class="table table-striped table-hover ">
		<thead>
			<tr>
				<th>Nom</th>
				<th>prix</th>
				<th>alcoolisé</th>
			</tr>
		</thead>
		<tbody>
		
			<c:forEach items="${cocktails}" var="cocktails">
				<tr>
					<td>${cocktails.name}</td>
					<td>${cocktails.price}</td>
					<td>${cocktails.withalcohol}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<div style="position:fixed;bottom:0;left:0;padding:20px;font-size:18px;">
<a href="<c:url value='/' />">Retour</a>
</div>
</body>
</html>