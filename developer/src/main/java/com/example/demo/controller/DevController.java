package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DeveloperService;
import com.example.demo.utility.Audit;

@RestController
@RequestMapping("/dev")
public class DevController {
	
	@Autowired
	private DeveloperService service;
	
	@GetMapping("/audit/{id}")
	public Audit audit(@PathVariable int id) {
		return service.audit(id);
	}

}
