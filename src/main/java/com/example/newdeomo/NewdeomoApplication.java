package com.example.newdeomo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NewdeomoApplication {
	
@GetMapping("/")
	public String sayHello() {
		return "OM SHIV SHANKARAYANAMAH";
	}
	public static void main(String[] args) {
		SpringApplication.run(NewdeomoApplication.class, args);
	}

}
