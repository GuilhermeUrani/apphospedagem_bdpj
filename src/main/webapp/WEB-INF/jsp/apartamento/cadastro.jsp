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
		<h2>Cadastro de Apartamento</h2>

		<form action="/apartamento/incluir" method="post">

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
					class="form-control" value="Apartamento" id="codTipoLocal"
					name="codigo" disabled="disabled">
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


			<div class="mb-3 mt-3">
				<label for="rua">Blobo:</label> <input type="text"
					class="form-control" value="C" id="bloco"
					placeholder="Informe o bloco do apartamento" name="bloco">
			</div>

			<div class="mb-3 mt-3">
				<label for="numeroAndar">Número Andar:</label> <input type="text"
					class="form-control" value="17" id="numeroAndar"
					placeholder="Informe o número do Andar" name="numeroAndar">
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