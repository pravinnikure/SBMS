package com.ex.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ex.repo.EmpRepository;

@Component
public class TestRunner implements CommandLineRunner {
	
	@Autowired
	private EmpRepository repo;
	
	public void run(String... args) throws Exception {
		System.out.println("Hello");
		System.out.println(repo.getClass().getName());
	}

}
