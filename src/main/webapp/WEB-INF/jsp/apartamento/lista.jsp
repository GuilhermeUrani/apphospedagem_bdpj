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
		<h3>Listagem de Apartamento:</h3>
		<h4>
			<a href="/apartamento/cadastro">Novo Apartamento</a>
		</h4>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Local do Imovel</th>
					<th>Endereco</th>
					<th>Tipo Local</th>
					<th>Quartos</th>
					<th>Banheiros</th>
					<th>Bloco</th>
					<th>Número Andar</th>
					<th>Area</th>
					<th>Valor Diaria</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach var="a" items="${listaApartamento}">
					<tr>
						<td>${a.id}</td>
						<td>${a.localImovel.descLocalImovel}</td>
						<td>${a.localImovel.descEndereco}</td>
						<td>${a.codTipoLocal}</td>
						<td>${a.qtdQuartos}</td>
						<td>${a.qtdBanheiros}</td>
						<td>${a.bloco}</td>
						<td>${a.numeroAndar}</td>
						<td>${a.areaUtil}</td>
						<td>${a.valorDiaria}</td>
						<td><a href="/apartamento/${c.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>