<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<c:import url="/WEB-INF/paginas/cabecalho.jsp" />
<body>
	<form action="executa" method="POST">
		<div>
			Email: <input type="email" name="email" />
		</div>
		<div>
			Senha: <input type="password" name="senha" /> <input type="submit"
				value="Enviar" />
		</div>
		<input type="hidden" value ="login" name="tarefa">
	</form>

	<a href="<c:url value='/cadastrar'/>"> Cadastrar novo usuário </a>


	<c:import url="/WEB-INF/paginas/rodape.jsp" />
</body>
</html>