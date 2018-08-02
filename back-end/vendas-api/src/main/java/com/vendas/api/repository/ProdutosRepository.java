package com.vendas.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vendas.api.model.Produto;

public interface ProdutosRepository extends JpaRepository<Produto, Long>{

}
