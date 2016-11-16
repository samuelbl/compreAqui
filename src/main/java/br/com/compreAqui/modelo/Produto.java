package br.com.compreAqui.modelo;

import java.math.BigDecimal;

public class Produto extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private String imagem;
	private BigDecimal valor;
	
	public Produto(){
		this("","",BigDecimal.ZERO);
	}
	
	public Produto(String nome, String imagem, BigDecimal valor) {
		super();
		this.nome = nome;
		this.imagem = imagem;
		this.valor = valor;
	}
	
	public Long getId() {
		return id;
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	@Override
	public void setId(Long id) {
		this.id = id;
		
	} 

}
