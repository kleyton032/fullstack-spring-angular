package com.vendas.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vendas.api.model.Venda;

public interface VendasRepository extends JpaRepository<Venda, Long>{
}
