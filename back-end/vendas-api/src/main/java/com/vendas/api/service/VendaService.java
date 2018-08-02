package com.vendas.api.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vendas.api.model.Venda;
import com.vendas.api.repository.ProdutosRepository;
import com.vendas.api.repository.VendasRepository;

@Service
public class VendaService {

	@Autowired
	private VendasRepository vendasRepository;
	
	@Autowired
	private ProdutosRepository produtosRepository;
	
	
	public Venda create (Venda venda) {
		venda.setCadastro(LocalDate.now());
		venda.getItens().forEach(i-> {
			i.setVenda(venda);
			i.setProduto(produtosRepository.findById(i.getProduto().getId()).get());
		});
		
		BigDecimal totalItens = venda.getItens().stream()
				.map(i -> i.getProduto().getValor().multiply(new BigDecimal(i.getQuantidade())))
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		
		venda.setTotal(totalItens.add(venda.getFrete()));
		return vendasRepository.save(venda);
	}
	
}
