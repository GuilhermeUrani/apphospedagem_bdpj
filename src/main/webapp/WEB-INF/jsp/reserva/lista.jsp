<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastramento de Reserva</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">
		<h3>Reservas: ${listagem.size()}</h3>

		<h4>
			<a href="/reserva">Nova reserva</a>
		</h4>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>Solicitante</th>
					<th>Quantidade Imoveis</th>
					<th>Quantidade pessoa</th>
					<th>Data Inicio</th>
					<th>Data Fim</th>
					<th>Valor</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="r" items="${listagem}">
					<tr>
						<td>${r.id}</td>
						<td>${r.solicitante.nome}</td>
						<td>${tipologiaImoveis.size()}</td>
						<td>${r.qtdPessoas}</td>
						<td>${r.dataInicio}</td>
						<td>${r.dataFim}</td>
						<td>${r.valor}</td>
						<td><a href="/reserva/${r.id}/excluir">excluir</a></td>
					</tr>

				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>