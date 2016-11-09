<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<c:import url="/WEB-INF/paginas/cabecalho.jsp"/>
<body>
	<form action="executa?tarefa=login" method="POST">
		<div>
			Email: <input type="email" name="email" />
		</div>
		<div>
			Senha: <input type="password" name="senha" /> <input type="submit"
				value="Enviar" />
		</div>
	</form>

	<c:url value="/cadastrar"> Cadastrar novo usuário </c:url>

	
<c:import url="/WEB-INF/paginas/rodape.jsp"/>
</body>
</html>