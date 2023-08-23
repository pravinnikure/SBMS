package com.example.sbms.Runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.example.sbms.Beans.DBConfig;

//@Profile("dev")
@Component
public class DBRunnerTest implements CommandLineRunner
{

	@Autowired
	 DBConfig config;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println(config);
		
	}

}
