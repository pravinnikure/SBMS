package com.app.prav.test;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.prav.entity.Book;
import com.app.prav.repository.BookRepository;

//@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private BookRepository brepo;
	
	public void run(String... args) throws Exception {
		
		brepo.saveAll(
				Arrays.asList(
						
							new Book(1,"Java",1000.0,"James"),
							new Book(2,"c",700.0,"SAM"),
							new Book(3,"Cpp",800.0,"Renault"),
							new Book(4,"Python",1100.0,"SIM"),
							new Book(5,"React",900.0,"Shubham")
						)
				
				
				);
		
				/*
				 * brepo.getAllBooks().forEach(System.out::println);
				 * 
				 * 
				 * brepo.getAllBookNames().forEach(System.out::println);
				 * 
				 * 
				 * brepo.getNameAndCost(). stream(). map(b -> b[0] + "---" +b[1]).
				 * forEach(System.out::println);
				 */
		
	}

}
