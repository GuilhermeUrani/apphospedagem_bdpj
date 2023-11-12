<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AppHospedagem</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container-fluid mt-3">
		<h3>Listagem de Locais:</h3>
		<h4>
			<a href="/localImovel/cadastro">Novo Local</a>
		</h4>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Local Imovel</th>
					<th>Endereco</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach var="l" items="${listaLocalImovel}">
					<tr>
						<td>${l.id}</td>
						<td>${l.descLocalImovel}</td>
						<td>${l.descEndereco}</td>
						<td><a href="/localImovel/${l.id}/excluir">excluir</a></td>
						<td><a href="/localImovel/${l.id}/obterPorId">alterar</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>
</body>
</html>