package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@EnableDiscoveryClient
@OpenAPIDefinition(info =@Info(title="Blood Management Service",version="1.0"))
public class DonorServiceRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DonorServiceRestApiApplication.class, args);
	}

}
