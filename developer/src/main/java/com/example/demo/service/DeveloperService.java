package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Developer;
import com.example.demo.repository.DeveloperRepository;
import com.example.demo.utility.Audit;

@Service
public class DeveloperService {
	
	@Autowired
	private DeveloperRepository repository;
	
	public Developer createDeveloper(Developer developer) {
		return repository.save(developer);
	}
	
	public List<Developer> createDeveloper(List<Developer> developers) {
		return repository.saveAll(developers);
	}
	
	public Developer getDeveloperById(int id) {
		return repository.findById(id).get();
	}
	
	public Audit audit(int id) {
		Developer developer = repository.findById(id).get();
		
		Audit output = new Audit();
		output.setFirstName(developer.getFirstName());
		output.setLastName(developer.getLastName());
		output.setRole("DEVELOPER");
		output.setStack(developer.getSkills());
		
		return output;
	}

}
