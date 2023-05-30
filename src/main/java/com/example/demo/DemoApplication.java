package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

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
	ResponseEntity<String> userRegistration(@RequestBody CheckUserRegistrationStatusRequest body) {
		System.out.println("Request = " + body.toString());
		return new ResponseEntity<>("User Registration Complete", HttpStatus.OK);
	}

	@PostMapping("/paymentInitiation")
	ResponseEntity<String> paymentInitiation(@RequestBody String body) {
		System.out.println("Request = " + body.toString());
		return new ResponseEntity<>("Payment Initiation Complete", HttpStatus.OK);
	}

}
