package com.jde.testprojectsb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TestprojectSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestprojectSbApplication.class, args);
	}

	@GetMapping("/")
	public String greet() {
		return "Hello, I was built by Jenkins!";
	}

}
