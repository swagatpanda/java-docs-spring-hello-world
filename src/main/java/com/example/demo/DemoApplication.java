package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/up")
	String up() {
		return "App Is Up!";
	}

	@PostMapping("/userRegistration")
	String userRegistration() {
		return "User has been registered";
	}

	@PostMapping("/paymentInitiation")
	String paymentInitiation() {
		return "Payment has been initiated";
	}

}
