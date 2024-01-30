package com.enesaksu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequestMapping(path = "/api")
public class FirstProjectApplication {

	//localhost:8080/api/hello
	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
	}

}
