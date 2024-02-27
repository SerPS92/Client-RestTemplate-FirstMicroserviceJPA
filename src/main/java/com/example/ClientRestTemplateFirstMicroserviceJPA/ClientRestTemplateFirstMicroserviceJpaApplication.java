package com.example.ClientRestTemplateFirstMicroserviceJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.SpringVersion;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ClientRestTemplateFirstMicroserviceJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientRestTemplateFirstMicroserviceJpaApplication.class, args);
		System.out.println(SpringVersion.getVersion());
	}

	@Bean
	public RestTemplate template(){
		return new RestTemplate();
	}

}
