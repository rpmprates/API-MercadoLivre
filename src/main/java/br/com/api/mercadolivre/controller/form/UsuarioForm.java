package br.com.api.mercadolivre.controller.form;

import br.com.api.mercadolivre.model.Usuario;

public class UsuarioForm {
	
	private String nome;
	private String email;
	private String senha;
	
	public UsuarioForm(String nome, String email, String senha) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

	public Usuario converter() {
		return new Usuario(nome, email, senha);
		
	}
	
	


}
