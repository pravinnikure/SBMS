package com.app.prav.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.app.prav.entity.Employee;
import com.app.prav.repository.EmployeeRepository;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	
	public void run(String... args) throws Exception {
		
		repo.saveAll(
				
				Arrays.asList(new Employee(1,"A",100.00),
					new Employee(2,"B",200.00),
					new Employee(3,"C",300.00),
					new Employee(4,"D",400.00),
					new Employee(5,"E",100.00),
					new Employee(6,"F",200.00),
					new Employee(8,"G",300.00),
					new Employee(9,"H",400.00),
					new Employee(10,"I",100.00),
					new Employee(11,"J",200.00),
					new Employee(12,"K",300.00),
					new Employee(13,"L",400.00) )
				);
		
		Pageable pageable = PageRequest.of(1,3);
		
	 	Page<Employee> page =  repo.findAll(pageable);
	 	List<Employee> list =  page.getContent();
	 	list.forEach(System.out::println);
	 	
	 	System.out.println("********Metadata*******");
	 	
	 	System.out.println("First Page = " + page.isFirst());
	 	
	 	System.out.println("Last Page = " + page.isLast());
	 	
	 	System.out.println("Next Page = " + page.hasNext());
	 	System.out.println("Previous Page = " + page.hasPrevious());
	 	System.out.println("Total Page = " + page.getTotalPages());
	 	System.out.println("Current Page = " + page.getNumber());
	 	
	 	System.out.println("SIZE ? = " + page.getSize());
	 	
	 	System.out.println("Total Rows = " + page.getTotalElements());
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	}

}
