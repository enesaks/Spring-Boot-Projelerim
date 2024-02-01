package com.enesaksu.DepandencyInjectionQualifer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DepandencyInjectionQualiferApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepandencyInjectionQualiferApplication.class, args);
	}

	@Bean("WORLD")
	public WorldFileReader getWordFileReader() {
		return new WorldFileReader();
	}
}
