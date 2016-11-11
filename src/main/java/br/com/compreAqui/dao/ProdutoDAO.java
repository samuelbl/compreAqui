package br.com.compreAqui.dao;

import org.apache.commons.lang3.StringUtils;

import br.com.compreAqui.modelo.Produto;

public class ProdutoDAO extends DAO<Produto> {
	public static synchronized ProdutoDAO getInstance() {
		if (instancia == null) {
			instancia = new ProdutoDAO();
		}
		return instancia;
	}

	private static ProdutoDAO instancia;

	private ProdutoDAO() {
		super(Produto.class);
		geraDados();
	}

	
	@Override
	void geraDados() {
		geraIdEAdiciona(new Produto());
		geraIdEAdiciona(new Produto());
	}
}
