package br.com.compreAqui.dao;

import java.math.BigDecimal;

import br.com.compreAqui.modelo.ItemComercial;
import br.com.compreAqui.modelo.Produto;

public class ItemComercialDAO extends DAO<ItemComercial>{

	public static synchronized ItemComercialDAO getInstance() {
		if (instancia == null) {
			instancia = new ItemComercialDAO();
		}
		return instancia;
	}

	private static ItemComercialDAO instancia;

	private ItemComercialDAO() {
		super(ItemComercial.class);
		geraDados();
	}

	
	
	@Override
	void geraDados() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public ItemComercial adiciona(ItemComercial t) {
		Produto produto = ProdutoDAO.getInstance().buscaPorId(Long.parseLong(t.getIdProduto()));
		BigDecimal total = (produto.getValor().multiply(new BigDecimal(t.getQuantidade()))); 
		t.setTotal(total);
		return super.adiciona(t);
	}
	
}
