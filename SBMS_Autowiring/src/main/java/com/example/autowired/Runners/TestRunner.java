package com.example.autowired.Runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.autowired.Beans.Product;

@Component
public class TestRunner implements CommandLineRunner{

	@Autowired
	private Product prod;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(prod);
	}

}
