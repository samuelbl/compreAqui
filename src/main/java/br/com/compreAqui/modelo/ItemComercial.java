package br.com.compreAqui.modelo;

import java.math.BigDecimal;

public class ItemComercial {
	private String id;
	private String idProduto;
	private int quantidade;
	private BigDecimal total;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(String idProduto) {
		this.idProduto = idProduto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}

}
