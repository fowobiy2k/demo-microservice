package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Auditor;
import com.example.demo.repositories.AuditorRepository;
//import com.example.demo.services.AuditorService;


@SpringBootApplication
@EnableEurekaClient
public class AuditorApplication {
	
//	@Autowired
//	private AuditorService service;
	
	@Autowired
	private AuditorRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AuditorApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate createRestTemplate() {
		return new RestTemplate();
	}
	
	@PostConstruct
	public void loadDb() {
//		service.createAuditor(new Auditor(1, "Kennedy", "Simpson"));
		repository.save(new Auditor(1, "Kennedy", "Simpson"));
	}

}
