package br.com.compreAqui.controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.compreAqui.web.LoginServlet;
import br.com.compreAqui.web.LojaServlet;
import br.com.compreAqui.web.UsuarioServlet;

@WebServlet(urlPatterns = "/executa")
public class Dispatcher extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String localDestino = "";
		String tarefa = req.getParameter("tarefa");
		
		if(tarefa == null){
			throw new IllegalArgumentException("É necessário passar uma tarefa como parâmetro");
		}
		
		switch (tarefa) {
		case "login":
			localDestino = new LoginServlet().login(req,resp);
			break;
		case "loja":
			localDestino = new LojaServlet().mostrarProdutos(req, resp);
			break;
		case "logout":
			localDestino = new LoginServlet().logout(req,resp);
		case "adicionarAoCarrinho":
			localDestino = new LojaServlet().adicionarAoCarrinho(req, resp);
			break;
		case "cadastrarUsuario":
			localDestino = new UsuarioServlet().cadastrarUsuario(req, resp);
			break;
		case "listaUsuarios":
			localDestino = new UsuarioServlet().listaUsuarios(req, resp);
			break;
		case "carrinho":
			localDestino = "WEB-INF/paginas/carrinho.jsp";
			break;


		

		default:
			localDestino = "index.jsp";
			break;
		}
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(localDestino);
		dispatcher.forward(req, resp);
		
	}

}
