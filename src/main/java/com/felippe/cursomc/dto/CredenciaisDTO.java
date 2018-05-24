package com.felippe.cursomc.dto;

import java.io.Serializable;

public class CredenciaisDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String senha;
	private String email;
	
	public CredenciaisDTO() {
	}
	
	public String getSenha() {
		return senha;
	}
	public String getEmail() {
		return email;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
