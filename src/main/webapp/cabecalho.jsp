<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="r"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<style>
ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #333333;
}

li {
	float: left;
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding: 16px;
	text-decoration: none;
}

li a:hover {
	background-color: #111111;
}
</style>

</head>
<body>

	<h3>Bem vindo ao CompreAqui</h3>


	<c:if test="${not empty usuarioLogado}">
	
		<ul>
			<li><a href="executa?tarefa=loja">Loja</a></li>
			<li><a href="executa?tarefa=listaUsuarios">Usuários</a></li>
			<li><a href="executa?tarefa=carrinho">Carrinho</a></li>
		</ul>
	<div> Logado como ${usuarioLogado.email} </div> 
	<div> Total carrinho: <r:moedas valor = "${carrinhoCompra.total}"/> </div>
	<br />
		<br />
	</c:if>
	<c:if test="${not empty cadastro}">
	Cadastro realizado com Sucesso
</c:if>
	<hr />