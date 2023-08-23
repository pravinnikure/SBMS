package com.app.runner;

import java.io.FileInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity.Product;
import com.app.repository.ProductRepo;

@Component
public class TestRunner implements CommandLineRunner {

	
	@Autowired
	private ProductRepo repo;

	public void run(String... args) throws Exception {
		
		FileInputStream fis = new FileInputStream("C:/Users/Pravin/OneDrive/Pictures/PassportSize/pravin3");
		
		byte[] arr = new byte[fis.available()];
		fis.read(arr);
		
		String input = "Hello Congrats, will catch up with you soon";
		char[] carr = input.toCharArray();
		
		Product p = new Product(1,"EXCEL",1000.0,arr,carr);
		
		
		repo.save(p);
	}

}
