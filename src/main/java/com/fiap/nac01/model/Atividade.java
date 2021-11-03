package com.fiap.nac01.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "atividades")
public class Atividade {

	@Id
	private String id;
	private String urlGit;
	private Integer rm;
	private int numeroAtividade;
	private String nome;
}
