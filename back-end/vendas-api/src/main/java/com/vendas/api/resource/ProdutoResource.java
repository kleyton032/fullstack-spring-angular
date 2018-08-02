package com.vendas.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vendas.api.model.Produto;
import com.vendas.api.repository.ProdutosRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/produtos")
public class ProdutoResource {
	
	@Autowired
	private ProdutosRepository produtosRepository;
	
	@GetMapping
	public List<Produto> findAll(){
		return produtosRepository.findAll();
	}

}
