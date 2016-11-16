package br.com.compreAqui.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.compreAqui.dao.CarrinhoDAO;
import br.com.compreAqui.dao.ItemComercialDAO;
import br.com.compreAqui.dao.ProdutoDAO;
import br.com.compreAqui.modelo.CarrinhoCompra;
import br.com.compreAqui.modelo.ItemComercial;
import br.com.compreAqui.modelo.Produto;

public class LojaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public String mostrarProdutos(HttpServletRequest req, HttpServletResponse resp) {
		List<Produto> produtos = ProdutoDAO.getInstance().listaTodos();
		req.setAttribute("produtos", produtos);
		return "/WEB-INF/paginas/loja.jsp";
	}

	public String adicionarAoCarrinho(HttpServletRequest req, HttpServletResponse resp) {
		int quantidade = Integer.valueOf(req.getParameter("qtd"));
		String idProduto = req.getParameter("idProduto");
		ItemComercial item = new ItemComercial(idProduto, quantidade);
		item = ItemComercialDAO.getInstance().adiciona(item);
		CarrinhoCompra carrinho = (CarrinhoCompra) req.getSession().getAttribute("carrinhoCompra");
		carrinho.setItens(item);
		CarrinhoDAO.getInstance().atualizaCarrinhoEtotal(carrinho);
		return "executa?tarefa=carrinho";
	}
	
	public String removerDoCarrinho(HttpServletRequest req, HttpServletResponse resp){
		
		String idItem = req.getParameter("idItem");
		CarrinhoCompra carrinho = (CarrinhoCompra) req.getSession().getAttribute("carrinhoCompra");
		CarrinhoDAO.getInstance().removeDoCarrinho(Long.valueOf(idItem), carrinho);
		return "executa?tarefa=carrinho";
	}

	public String mostrarCarrinho(HttpServletRequest req, HttpServletResponse resp) {
		CarrinhoCompra carrinho = (CarrinhoCompra) req.getSession().getAttribute("carrinhoCompra");
		ArrayList<Produto> produtos = new ArrayList<Produto>(); 
		for (ItemComercial item : carrinho.getItens()) {
			Produto produto = ProdutoDAO.getInstance().buscaPorId(Long.valueOf(item.getIdProduto()));
			produtos.add(produto);
		}
		req.setAttribute("produtos", produtos);
		return "WEB-INF/paginas/carrinho.jsp";
	}

}
