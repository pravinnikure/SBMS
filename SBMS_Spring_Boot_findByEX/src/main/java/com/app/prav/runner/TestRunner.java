package com.app.prav.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.prav.entity.Employee;
import com.app.prav.repository.EmployeeRepo;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepo erepo;
	

	public void run(String... args) throws Exception {
		
		
	
		
		Employee e1 = new Employee(11, "Shaktiman", 1000.0);

		Employee e2 = new Employee(12, "SuperMam", 1100.0);
		Employee e3 = new Employee(13, "Ironman", 1200.0);
		Employee e4 = new Employee(14, "Batman", 1100.0);
		Employee e = new Employee(15, "JuniorG", 1400.0);

		erepo.save(e1);
		erepo.save(e2);
		erepo.save(e3);
		
		erepo.findAll().forEach(System.out::println);
		
		erepo.findByEmpSalLessThan(1100.00).forEach(System.out::println);
	
		erepo.findByEmpSalGreaterThan(1100.00).forEach(System.out::println);
		
		/*
		 * erepo.getAllEmployee().stream().map(obj -> obj[0]+ "--- " +
		 * obj[1]).forEach(System.out::println);
		 * 
		 * erepo.getAllLestEmployee().stream().map(obj -> obj[0]+ "--- " +
		 * obj[1]).forEach(System.out::println);
		 * 
		 * 
		 * e
		 *//*
			 * repo.getAllRightEmployee().stream().map(obj -> obj[0]+ "--- " +
			 * obj[1]).forEach(System.out::println);
			 */	//erepo.getAllFullEmployee().stream().map(obj -> obj[0]+ "--- " + obj[1]).forEach(System.out::println);
	}

}
