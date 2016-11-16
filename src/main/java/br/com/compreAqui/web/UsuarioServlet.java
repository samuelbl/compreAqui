package br.com.compreAqui.web;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.compreAqui.dao.UsuarioDAO;
import br.com.compreAqui.modelo.Usuario;

public class UsuarioServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public String cadastrarUsuario(HttpServletRequest req, HttpServletResponse resp){
		String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		Usuario usuario = new Usuario(email,senha);
		UsuarioDAO.getInstance().adiciona(usuario);
		req.setAttribute("cadastro","ok");
		return "index.jsp";
	}

	public String listaUsuarios(HttpServletRequest req, HttpServletResponse resp) {
		List<Usuario> usuarios = UsuarioDAO.getInstance().listaTodos();
		req.setAttribute("usuarios", usuarios);
		return "/WEB-INF/paginas/usuarios.jsp";
	}
	
	
}
