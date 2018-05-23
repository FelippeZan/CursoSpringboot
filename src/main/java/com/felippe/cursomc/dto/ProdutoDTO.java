package com.felippe.cursomc.dto;

import java.io.Serializable;

import com.felippe.cursomc.domain.Produto;

public class ProdutoDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private Double preco;
	
	public ProdutoDTO() {
	}
	
	public ProdutoDTO(Produto obj) {
		id = obj.getID();
		nome = obj.getNome();
		preco = obj.getPreco();
	}

	public Integer getid() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setid(Integer iD) {
		id = iD;
	}

	public void setNome(String Nome) {
		nome = Nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
