package com.mudit.microservices.currencyconversionservicekubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CurrencyConversionServiceKubernetesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionServiceKubernetesApplication.class, args);
	}

}
