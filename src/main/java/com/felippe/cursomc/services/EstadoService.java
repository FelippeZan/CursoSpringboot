package com.felippe.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felippe.cursomc.domain.Estado;
import com.felippe.cursomc.repositories.EstadoRepository;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository estadoRepository;
	
	public List<Estado> findAll(){
		return estadoRepository.findAllByOrderByNome();
	}
}
