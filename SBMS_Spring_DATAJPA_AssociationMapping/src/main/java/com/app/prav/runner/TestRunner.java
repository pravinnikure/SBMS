package com.app.prav.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.prav.entity.Department;
import com.app.prav.entity.Employee;
import com.app.prav.repository.DepartmentRepo;
import com.app.prav.repository.EmployeeRepo;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepo erepo;
	@Autowired
	private DepartmentRepo drepo;

	public void run(String... args) throws Exception {
		
		Department d1 = new Department(1, "abc", "XYZ");
		Department d2 = new Department(2, "def", "UVW");
		Department d3 = new Department(3, "ghi", "PQR");
		
		drepo.save(d1);
		drepo.save(d2);
		drepo.save(d3);
		
		Employee e1 = new Employee(11, "Shaktiman", 1000.0, null);

		Employee e2 = new Employee(12, "SuperMam", 1100.0, d1);
		Employee e3 = new Employee(13, "Ironman", 1200.0, d2);
		Employee e4 = new Employee(14, "Batman", 1100.0, null);
		Employee e = new Employee(15, "JuniorG", 1400.0, d3);

		erepo.save(e1);
		erepo.save(e2);
		erepo.save(e3);
		
		erepo.findAll().forEach(System.out::println);
		
		erepo.getAllEmployee().stream().map(obj -> obj[0]+ "--- " + obj[1]).forEach(System.out::println);
		
		erepo.getAllLestEmployee().stream().map(obj -> obj[0]+ "--- " + obj[1]).forEach(System.out::println);
		
		
		erepo.getAllRightEmployee().stream().map(obj -> obj[0]+ "--- " + obj[1]).forEach(System.out::println);
		//erepo.getAllFullEmployee().stream().map(obj -> obj[0]+ "--- " + obj[1]).forEach(System.out::println);
	}

}
