package com.felippe.cursomc.dto;

import java.io.Serializable;

import com.felippe.cursomc.domain.Estado;

public class EstadoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	
	public EstadoDTO() {
	}
	
	public EstadoDTO(Estado obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
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
