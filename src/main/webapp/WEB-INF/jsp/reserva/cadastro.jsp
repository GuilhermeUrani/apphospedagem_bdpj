<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Cadastro de Reserva de Hospedagem</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">

		<h2>Reserva</h2>
		<form action="/reserva/incluir" method="post">

			<div class="form-group">
				<label>Solicitante:</label> <select name="solicitante"
					class="form-control">
					<c:forEach var="s" items="${solicitantes}">
						<option value="${s.id}">${s.nome}</option>
					</c:forEach>
				</select>
			</div>

			<div class="form-group">
				<label>Local:</label> <select name="solicitante"
					class="form-control">
					<c:forEach var="t" items="${tipologiaImoveis}">
						<option value="${t.id}">${t.localImovel.descLocalImovel}
							${t.localImovel.descEndereco}</option>
					</c:forEach>
				</select>
			</div>

			<div class="form-group">
				<label>Imóvel:</label> <select name="solicitante"
					class="form-control">
					<c:forEach var="t" items="${tipologiaImoveis}">
						<option value="${t.id}">${t.codTipoLocal}</option>
					</c:forEach>
				</select>
			</div>

			<div class="form-group">
				<label>Quantidade de pessoas:</label> <input type="text"
					class="form-control" placeholder="Informe o quantidade de pessoas"
					name="valor">
			</div>

			<div class="form-group">
				<label>Data Inicio:</label> <input type="datetime-local"
					class="form-control" name="dataInicio">
			</div>

			<div class="form-group">
				<label>Data Fim:</label> <input type="datetime-local"
					class="form-control" name="dataFim">
			</div>

			<div class="form-group">
				<label>Valor:</label> <input type="text" class="form-control"
					placeholder="Informe o valor" name="valor">
			</div>

			<button type="submit" class="btn btn-default">Cadastrar</button>
		</form>

	</div>
</body>
</html>