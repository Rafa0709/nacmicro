package com.fiap.nac01.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fiap.nac01.model.Atividade;

public interface AtividadeRepository extends MongoRepository<Atividade, String> {

}
