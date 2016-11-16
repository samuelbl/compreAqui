<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<c:import url="../../cabecalho.jsp" />
<body>
	<H2>Lista de Usuários</H2>
	<br />
	<c:forEach var="usuario" items="${usuarios}" varStatus="i">
		<tr>
			<td>${usuario.id }</td>
			<td>${usuario.email }</td>
		</tr>
		<br/>
	</c:forEach>

	<c:import url="../../rodape.jsp" />