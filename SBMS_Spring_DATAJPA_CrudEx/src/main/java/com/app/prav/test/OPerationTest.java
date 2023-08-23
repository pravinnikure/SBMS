package com.app.prav.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.prav.repo.BookRepo;

@Component
public class OPerationTest implements CommandLineRunner {

	@Autowired
	private BookRepo repo;
	
	
	public void run(String... args) throws Exception {
	
		System.out.println(repo.getClass().getName());
	}

}
