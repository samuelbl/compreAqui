<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="r"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:import url="../../cabecalho.jsp" />

<div> Carrinho de Compras: </div>

	<c:forEach var="item" items="${carrinhoCompra.itens}" varStatus="i">
	<div> ${item.quantidade }</div>
	<div> ${item.total}</div>	
	
	</c:forEach>


</body>

	<c:import url="../../rodape.jsp" />
