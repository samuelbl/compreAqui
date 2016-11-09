package br.com.compreAqui.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.compreAqui.dao.UsuarioDAO;
import br.com.compreAqui.modelo.Usuario;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public String login(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		Usuario usuario = new Usuario(email,senha);
		Boolean existe = UsuarioDAO.getInstance().existe(usuario);
		PrintWriter writer = resp.getWriter();
		if (existe) {
			HttpSession session = req.getSession();
			session.setAttribute("usuarioLogado", usuario);
			writer.println("<html><body>Usuario logado: " + email
					+ "</body></html>");			
		} else {
			writer.println("<html><body>Usuario invalido</body></html>");
		}
		return "Olaaaaaa";
	}
}
