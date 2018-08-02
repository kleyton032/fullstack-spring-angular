package com.vendas.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vendas.api.model.Cliente;

public interface ClientesRepository extends JpaRepository<Cliente, Long> {

}
