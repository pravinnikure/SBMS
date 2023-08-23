package com.app.prav.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.prav.repository.BookRepository;

@Component
public class TestQueyRunner implements CommandLineRunner {

	
	@Autowired
	private BookRepository brepo;
	
	
	@Override
	public void run(String... args) throws Exception {
		
			// brepo.getBookDataA("Java", 800.0).forEach(System.out::println);
			
			//brepo.getBookDataB("Python", 900.0).forEach(System.out::println);
			
			//brepo.getBookDataC("James").forEach(System.out::println);
			
			brepo.getBookDataD("ALL").stream().map(obj-> obj[0]+"--"+obj[1]).forEach(System.out::println);
		
		
	}

}
