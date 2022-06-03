package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.example.demo.service.TesterService;
import com.example.demo.models.Tester;

@SpringBootApplication
@EnableEurekaClient
public class TesterApplication {
	
	@Autowired
	private TesterService service;


	public static void main(String[] args) {
		SpringApplication.run(TesterApplication.class, args);
	}
	
	@PostConstruct
	public void loadDb() {
		service.createTester(new Tester(1, "Liam", "Craig", "TESTER", "JUnit"));
	}

}
