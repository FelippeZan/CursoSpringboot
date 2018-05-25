package com.felippe.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felippe.cursomc.domain.Cidade;
import com.felippe.cursomc.repositories.CidadeRepository;

@Service
public class CidadeService {
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	public List<Cidade> findAll(Integer estadoId){
		return cidadeRepository.findCidades(estadoId);
	}

}
