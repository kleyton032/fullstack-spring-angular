package com.vendas.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vendas.api.model.Cliente;
import com.vendas.api.repository.ClientesRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/clientes")
public class ClienteResource {

	@Autowired
	private ClientesRepository clientesRepository;
	
	@GetMapping
	public List<Cliente>findAll(){
		return clientesRepository.findAll();
	}
	
	
	
}
