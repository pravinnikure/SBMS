package com.app.prav.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.prav.entity.Employee;
import com.app.prav.repository.EmployeeRepo;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepo repo;

	public void run(String... args) throws Exception {

		Employee e1 = new Employee();
		e1.setEmpName("Amit");
		e1.setEmpSal(5000.00);
		
		
		repo.save(e1);

		

	}

}
