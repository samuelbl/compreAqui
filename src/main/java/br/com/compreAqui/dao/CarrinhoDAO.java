package br.com.compreAqui.dao;


import java.math.BigDecimal;

import br.com.compreAqui.modelo.ItemComercial;
import br.com.compreAqui.modelo.CarrinhoCompra;

public class CarrinhoDAO extends DAO<CarrinhoCompra> {
	public static synchronized CarrinhoDAO getInstance() {
		if (instancia == null) {
			instancia = new CarrinhoDAO();
		}
		return instancia;
	}

	private static CarrinhoDAO instancia;
	
	
	
	private CarrinhoDAO() {
		super(CarrinhoCompra.class);
		geraDados();
	}
	
	public void atualizaCarrinhoEtotal(CarrinhoCompra carrinho) {
		BigDecimal total = carrinho.getTotal();
		for (ItemComercial item : carrinho.getItens()) {
			 total = total.add(item.getTotal());
		}
		carrinho.setTotal(total);
		super.atualiza(carrinho);
	}

		
	@Override
	void geraDados() {
		// TODO Auto-generated method stub
		
	}

}
