package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.example.demo.models.Developer;
import com.example.demo.service.DeveloperService;

@SpringBootApplication
@EnableEurekaClient
public class DeveloperApplication {
	
	@Autowired
	private DeveloperService service;
	
	
	public static void main(String[] args) {
		SpringApplication.run(DeveloperApplication.class, args);
	}
	
	@PostConstruct
	public void loadDb() {
		List<Developer> developers = new ArrayList<Developer>();
		
		Developer developer1 = new Developer(1, "James", "Brown", "Unity College", new String[] {"java", "vue"});
		Developer developer2 = new Developer(2, "Brad", "Leigh", "London University", new String[] {"javascript", "react"});
		
		developers.add(developer1);
		developers.add(developer2);
		
		service.createDeveloper(developers);
		
	}

}
