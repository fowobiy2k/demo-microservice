package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Auditor;
import com.example.demo.repositories.AuditorRepository;
import com.example.demo.utility.Audit;

@Service
public class AuditorService {
	
	@Autowired
	private AuditorRepository repository;
	
	@Autowired
	private RestTemplate template;
	
	@Value("${developerUrl}")
	private String developerUrl;
	
	@Value("${testerUrl}")
	private String testerUrl;
	
	public Audit auditDeveloper(int id) {
		ResponseEntity<Audit> audit = template.getForEntity(developerUrl + id, Audit.class);
		
		return audit.getBody();
	}
	
	public Audit auditTester(int id) {
		ResponseEntity<Audit> audit = template.getForEntity(testerUrl + id, Audit.class);
		
		return audit.getBody();
	}
	
	public Auditor createAuditor(Auditor auditor) {
		return repository.save(auditor);
	}

}
