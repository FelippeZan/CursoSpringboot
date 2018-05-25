package com.felippe.cursomc.dto;

import com.felippe.cursomc.domain.Cidade;

public class CidadeDTO {
	
	private Integer id;
	private String nome;
	
	public CidadeDTO() {
	}

	public CidadeDTO(Cidade cidade) {
		this.id = cidade.getId();
		this.nome = cidade.getNome();
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
