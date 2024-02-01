package com.enesaksu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DepandencyInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepandencyInjectionApplication.class, args);
	}

	@Bean
	public SecondClass getSecondClass(){
		return new SecondClass();
	}

}
