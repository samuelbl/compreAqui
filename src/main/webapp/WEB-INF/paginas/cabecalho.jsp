<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<h3>Bem vindo ao CompreAqui</h3>
<c:if test="${not empty usuarioLogado}">
	Logado como ${usuarioLogado.email}<br />
	<br />
	<br />
</c:if>