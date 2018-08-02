package com.vendas.api.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vendas.api.model.Venda;
import com.vendas.api.repository.VendasRepository;
import com.vendas.api.service.VendaService;

@CrossOrigin("*")
@RestController
@RequestMapping("/vendas")
public class VendaResource {
	
	@Autowired
	private VendasRepository vendasRepository;
	
	@Autowired
	private VendaService vendaService;
	
	@GetMapping
	public List<Venda> findAll(){
		return vendasRepository.findAll();
	}
	
	@PostMapping
	public Venda adicionar(@RequestBody @Valid Venda venda) {
		return vendaService.create(venda);
	}
	

}
