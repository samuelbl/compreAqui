package br.com.compreAqui.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.compreAqui.dao.CarrinhoUserDAO;
import br.com.compreAqui.dao.UsuarioDAO;
import br.com.compreAqui.modelo.CarrinhoCompra;
import br.com.compreAqui.modelo.Usuario;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String retorno;

	public String login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		Usuario usuario = new Usuario(email, senha);
		Long userId = UsuarioDAO.getInstance().existeRetornaId(usuario);
		if (userId!=null) {
			HttpSession session = req.getSession();
			usuario.setId(userId);
			session.setAttribute("usuarioLogado", usuario);
			CarrinhoCompra carrinho = CarrinhoUserDAO.getInstance().verificaExistenciaCarrinho(userId);
			session.setAttribute("carrinhoCompra", carrinho);
			retorno = "/executa?tarefa=loja";
		} else {
			retorno = "index.jsp";
		}
		return retorno;
	}

	public String logout(HttpServletRequest req, HttpServletResponse resp) {
			req.getSession().removeAttribute("usuarioLogado");
			req.getSession().removeAttribute("carrinho");
			return "index.jsp";	
	}
}
