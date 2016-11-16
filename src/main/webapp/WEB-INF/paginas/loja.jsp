<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="r"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:import url="../../cabecalho.jsp" />



<script type="text/javascript">
var caminhoCompra = "<c:url value='/executa?tarefa=adicionarAoCarrinho'/>";
function adicionar(idProduto){
	var qtd = $('#qtd-'+idProduto).val();
	window.location = caminhoCompra+"&qtd="+qtd+"&idProduto="+idProduto;
}	
</script>	

	<table style="width: 100%" border="1">
		<tr>
			<th align="left">Produto</th>
			<th align="left">Descrição</th>
			<th align="left">Valor</th>
			<th align="left">Quantidade</th>
			<th align="left">Adicionar ao Carrinho</th>
		</tr>
		<c:forEach var="produto" items="${produtos}" varStatus="i">
			<tr>
				<td><img border="0" name="${produto.id}" alt='${produto.nome}'
					src='${produto.imagem}' width="100" height="100">
				<td> ${fn:toUpperCase(produto.nome)}</td>
				<td><r:moedas valor="${produto.valor}" /></td>
				<td><select id="qtd-${produto.id}">
						<c:forEach begin="1" end="100" varStatus="i">
							<option value="${i.index}">${i.index}</option>
						</c:forEach>
				</select></td>
				<td> <h2><a href="javascript:adicionar('${produto.id}')">Adicionar</a> </h2></td>
			</tr>
		</c:forEach>
	</table>
</body>

	<c:import url="../../rodape.jsp" />
