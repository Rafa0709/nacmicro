package com.fiap.nac01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.nac01.model.Cliente;

//Rest API 
@SpringBootApplication
@RestController
public class Nac01 {
	
	@GetMapping("/")
	public String get() {
		return "Bem vindo a rest API by Rafael Caetano. "; //ponto de acesso ou endpoint 
	}

	public static void main(String[] args) {
		SpringApplication.run(Nac01.class, args);
	}
}
