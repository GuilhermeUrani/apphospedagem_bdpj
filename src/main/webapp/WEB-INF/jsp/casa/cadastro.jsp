<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AppHospedagem</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

	<div class="container mt-3">
		<h2>Cadastramento de Casa</h2>

		<form action="/casa/incluir" method="post">

			<div class="form-group">
				<label>Local Imóvel:</label> <select name="localImovel"
					class="form-control">
					<c:forEach var="l" items="${listaLocalImovel}">
						<option value="${l.id}">${l.descLocalImovel} - 
							${l.descEndereco}</option>
					</c:forEach>
				</select>
			</div>

			<c:import url="/WEB-INF/jsp/tipologiaImovel/cadastro.jsp" />

			<div class="mb-3 mt-3">
				<label for="codigo">Tipo Local:</label> <input type="text"
					class="form-control" value="Casa" id="codTipoLocal"
					placeholder="Entre com o seu código" name="codigo"
					disabled="disabled">
			</div>

			<div class="mb-3 mt-3">
				<label for="qtdQuarto">Quantidade de quartos:</label> <input
					type="text" class="form-control" value="3" id="qtdQuarto"
					placeholder="Informe a quantidade de quartos" name="qtdQuartos">
			</div>
			<div class="mb-3 mt-3">
				<label for="qtdBanheiro">Quantidade de banheiros:</label> <input
					type="text" class="form-control" value="3" id="qtdBanheiro"
					placeholder="Informe a quantidade de banheiros" name="qtdBanheiros">
			</div>

			<div class="form-check">
				<input class="form-check-input" type="checkbox"
					name="bolPossuiPiscina" value="true" checked> <label
					class="form-check-label">Possui Piscina</label>
			</div>

			<div class="mb-3 mt-3">
				<label for="rua">Rua:</label> <input type="text"
					class="form-control" value="C" id="rua"
					placeholder="Informe a rua da casa" name="rua">
			</div>

			<div class="mb-3 mt-3">
				<label for="numero">Número:</label> <input type="text"
					class="form-control" value="17" id="numero"
					placeholder="Informe o número da casa" name="numero">
			</div>

			<div class="mb-3 mt-3">
				<label for="areaUtil">Área util:</label> <input type="text"
					class="form-control" value="100" id="areaUtil"
					placeholder="Informe a area util da casa" name="areaUtil">
			</div>

			<div class="mb-3 mt-3">
				<label for="valorDiaria">Valor diaria: </label> <input type="text"
					class="form-control" value="100" id="valorDiaria"
					placeholder="Informe o valor da diaria" name="valorDiaria">
			</div>

			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>