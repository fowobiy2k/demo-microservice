package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.AuditorService;
import com.example.demo.utility.Audit;

@RestController
@RequestMapping("/auditor")
public class AuditorController {
	
	@Autowired
	private AuditorService service;
	
	@GetMapping("/auditdeveloper/{id}")
	public Audit auditDeveloper(@PathVariable int id) {
		return service.auditDeveloper(id);
	}
	
	@GetMapping("/audittester/{id}")
	public Audit auditTester(@PathVariable int id) {
		return service.auditTester(id);
	}

}
