<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<br/>
<br/>
<c:if test="${not empty usuarioLogado}">
<a href="<c:url value='/executa?tarefa=logout'/>"> Deslogar </a>
</c:if>
</html>