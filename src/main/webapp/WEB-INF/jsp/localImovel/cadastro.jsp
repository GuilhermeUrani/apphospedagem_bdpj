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
		<h2>Cadastro de Local</h2>

		<form action="/localImovel/incluir" method="post">

			<div class="mb-3 mt-3">
				<label for="descLocalImovel">Local do Imóvel:</label> <input
					type="text" class="form-control" value="Condominio" id="descLocalImovel"
					placeholder="Informe o local do imóvel" name=descLocalImovel>
			</div>
			<div class="mb-3 mt-3">
				<label for="descEndereco">Endereço:</label> <input
					type="text" class="form-control" value="Jardim Botanico Quadra 07" id="descEndereco"
					placeholder="Informe o endereço" name="descEndereco">
			</div>
			

			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>