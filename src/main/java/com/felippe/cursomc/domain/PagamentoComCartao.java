package com.felippe.cursomc.domain;

import java.io.Serializable;

import com.felippe.cursomc.domain.enums.EstadoPagamento;

public class PagamentoComCartao  extends Pagamento implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer NumeroDeParcelas;
	
	public PagamentoComCartao() {
	}

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
		super(id, estado, pedido);
		this.NumeroDeParcelas = numeroDeParcelas;
		
	}

	public Integer getNumeroDeParcelas() {
		return NumeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		NumeroDeParcelas = numeroDeParcelas;
	}
	
	

}
