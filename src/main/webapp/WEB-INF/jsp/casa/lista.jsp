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
		<h3>Listagem de Casa:</h3>
		<h4>
			<a href="/casa/cadastro">Nova Casa</a>
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
					<th>Piscina</th>
					<th>Rua</th>
					<th>Area</th>
					<th>Valor Diaria</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach var="c" items="${listaCasa}">
					<tr>
						<td>${c.id}</td>
						<td>${c.localImovel.descLocalImovel}</td>
						<td>${c.localImovel.descEndereco}</td>
						<td>${c.codTipoLocal}</td>
						<td>${c.qtdQuartos}</td>
						<td>${c.qtdBanheiros}</td>
						<td>${c.bolPossuiPiscina}</td>
						<td>${c.rua}</td>
						<td>${c.numero}</td>
						<td>${c.areaUtil}</td>
						<td>${c.valorDiaria}</td>
						<td><a href="/casa/${c.id}/excluir">excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>