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
		<h2>Autenticação</h2>

		<form action="login" method="post">

			<div class="mb-3 mt-3">
				<label for="email">E-mail:</label> <input type="email"
					class="form-control" id="email" placeholder="Entre com o seu -mail"
					name="email">
			</div>

			<div class="mb-3">
				<label for="pwd">Senha:</label> <input type="password"
					class="form-control" id="pwd" placeholder="Entre com a sua senha"
					name="senha">
			</div>
			<button style="margin-right: 7px" type="submit" class="btn btn-primary">Acessar</button>
			<a class="btn btn-primary" href="/usuario/cadastro">Criar uma Conta</a>
		</form>

	</div>
</body>
</html>