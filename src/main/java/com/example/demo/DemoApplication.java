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
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@SpringBootApplication
@RestController
public class DemoApplication {

	private static ObjectMapper om = new ObjectMapper();
	private static String responseJson = "{\"version\":\"1.0\",\"encoding\":\"utf-8\",\"soap$Envelope\":{\"Header\":{\"ServiceResponseInfo\":{\"RequestDateTime\":\"2006-08-1972T22:57:14+05:30\",\"RequestID\":\"5673\",\"SesstionID\":\"2371\",\"UserID\":\"1982\",\"ReturnCode\":\"0\",\"ReasonCode\":\"5009\",\"ReasonMessage\":\"Sample Message\",\"Detail\":\"description\"}},\"soap$Body\":{\"checkUserRegistrationStatusResponse\":{\"RegistrationStatus\":\"Y\",\"AccountList\":{\"Account\":{\"Type\":\"AchAccount\",\"Id\":\"123456\",\"AchAccount\":{\"Nickname\":\"Jonny\",\"AccountNumberLast4\":\"1234\",\"AccountType\":\"C\"}}}}}}}";
	private static CheckUserRegistrationStatusResponseRoot SAMPLE_RESPONSE;

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		SAMPLE_RESPONSE = om.readValue(responseJson, CheckUserRegistrationStatusResponseRoot.class);
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/up")
	String up() {
		return "App Is Up!";
	}

	@PostMapping("/userRegistration")
	ResponseEntity<CheckUserRegistrationStatusResponseRoot> userRegistration(@RequestBody CheckUserRegistrationStatusRequest body) {
		System.out.println("Request = " + body.toString());
		return new ResponseEntity<>(SAMPLE_RESPONSE, HttpStatus.OK);
	}

	@PostMapping("/paymentInitiation")
	ResponseEntity<CheckUserRegistrationStatusResponseRoot> paymentInitiation(@RequestBody CheckUserRegistrationStatusRequest body) {
		System.out.println("Request = " + body.toString());
		return new ResponseEntity<>(SAMPLE_RESPONSE, HttpStatus.OK);
	}

}
