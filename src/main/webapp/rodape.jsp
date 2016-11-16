<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<br/>
<br/>
<c:if test="${not empty usuarioLogado}">
<a href="<c:url value='/executa?tarefa=logout'/>"><fmt:message key="${msg.logout}"/></a>
</c:if>
</html>