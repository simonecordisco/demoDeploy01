package com.Deploy1.demoDeploy01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DemoDeploy01Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoDeploy01Application.class, args);
	}

	@GetMapping("/")
	public String getDevName() {
		return "devName: Simone";
	}
}
