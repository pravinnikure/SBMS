package com.app.prav.runner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.prav.entity.Product;
import com.app.prav.entity.repo.ProductRepository;

@Component
public class TestRunner implements CommandLineRunner {

		
	@Autowired
	private ProductRepository repo;
	
	public void run(String... args) throws Exception {

		Set<String> vendors = new HashSet<>();
		vendors.add("B1");
		vendors.add("B2");
		vendors.add("B3");
		
		List<String> versions = new ArrayList<>();
		versions.add("V1");
		versions.add("V2");
		
		Map<String,String> clients = new HashMap<>();
		clients.put("C1", "Client1");
		clients.put("C2", "Client2");
		clients.put("C3", "Client3");
		 
		    repo.save(new Product(1, "P1", vendors, versions, clients));
		
	
		
		
	}

}
