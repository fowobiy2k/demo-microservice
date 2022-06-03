package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Tester;
import com.example.demo.repository.TesterRepository;
import com.example.demo.utility.Audit;

@Service
public class TesterService {
	
	@Autowired
	private TesterRepository repository;
	
	public Tester createTester(Tester tester) {
		return repository.save(tester);
	}
	
	public Audit audit(int id) {
		Audit audit = new Audit();
		
		Tester tester = repository.findById(id).get();
		
		audit.setFirstName(tester.getFirstName());
		audit.setLastName(tester.getLastName());
		audit.setRole("TESTER");
		audit.setStack(new String[] {tester.getFramework()});
		
		return audit;
	}

}
