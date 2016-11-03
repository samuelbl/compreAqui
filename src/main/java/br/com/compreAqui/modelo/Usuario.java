package br.com.compreAqui.modelo;

import br.com.compreAqui.modelo.BaseEntity;

public class Usuario extends BaseEntity {
	private static final long serialVersionUID = 1L;
	private String id;
	private String email;
	private String senha;
	
	public Usuario() {
		this("", "");
	}

	public Usuario(String email, String senha) {
		super();
		this.email = email;
		this.senha = senha;
	}
	
	public Long getId() {
		return Long.parseLong(id);
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Override
	public void setId(Long id) {
		this.id = Long.toString(id); 
		
	}
}
