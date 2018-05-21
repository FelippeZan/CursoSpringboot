package com.felippe.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felippe.cursomc.domain.Cliente;
import com.felippe.cursomc.repositories.ClienteRepository;
import com.felippe.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException(
					  "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
	
}
