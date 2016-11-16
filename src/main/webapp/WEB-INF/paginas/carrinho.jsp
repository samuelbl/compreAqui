<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="r"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:import url="../../cabecalho.jsp" />

<script type="text/javascript">
var caminho = "<c:url value='/executa?tarefa=removerDoCarrinho'/>";
function remover(idItem){
	window.location = caminho+"&idItem="+idItem;
}	
</script>	

<div>Carrinho de Compras:</div>
<table style="width: 100%" border="1">
	<tr>
		<th align="left">Produto</th>
		<th align="left">Descrição</th>
		<th align="left">Quantidade</th>
		<th align="left">Total</th>
		<th align="left">Remover</th>
	</tr>
	<c:forEach var="item" items="${carrinhoCompra.itens}" varStatus="i">

		<tr>
			<c:forEach var="produto" items="${produtos}">
				<c:if test="${produto.id.equals(item.longIdProduto)}">
					<td><img border="0" name="${produto.id}" alt='${produto.nome}'
						src='${produto.imagem}' width="100" height="100">
					<td>${fn:toUpperCase(produto.nome)}</td>
				</c:if>
			</c:forEach>
			<td>${item.quantidade }</td>
			<td><r:moedas valor="${item.total}" /></td>
			<td><h2><a href="javascript:remover('${item.id}')">Remover</a> </h2></td>
		</tr>

	</c:forEach>
</table>

</body>

<c:import url="../../rodape.jsp" />
