package com.I.Unidade.Projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class OficinaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OficinaApplication.class, args);
	}

}
