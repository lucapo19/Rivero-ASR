package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class ApivanesaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApivanesaApplication.class, args);
	}


	@GetMapping("/sumar")
	public int sumar(@RequestParam Integer a, @RequestParam Integer b) {
		return (a + b);
	}

	@GetMapping("/restar")
	public int restar(@RequestParam Integer a, @RequestParam Integer b) {
		return (a - b);
	}

	@GetMapping("/multiplicar")
	public int multiplicar(@RequestParam Integer a, @RequestParam Integer b) {
		return (a * b);
	}

	@GetMapping("/dividir")
	public int dividir(@RequestParam Integer a, @RequestParam Integer b) {
		return (a / b);
	}
}