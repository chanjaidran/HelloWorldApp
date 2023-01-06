package com.Hello.HelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class HelloWorldApplication {
	
	@GetMapping
	public String message(){
		return "welcome to Jaichandran";
	}


	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}
	
	

}
