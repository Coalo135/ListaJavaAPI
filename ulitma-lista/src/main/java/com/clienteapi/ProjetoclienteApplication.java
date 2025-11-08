package com.clienteapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
 info = @Info(
 title = "API de Clientes",
 version = "1.0",
 description = "Exemplo de documentação com Swagger OpenAPI"
 )
)

@SpringBootApplication
public class ProjetoClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoClienteApplication.class, args);
	}

}
