package com.fiap.nac01.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fiap.nac01.model.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {

}
