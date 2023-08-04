package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.bean.Employee;

@Controller

public class HomeController {
	@GetMapping("/show")

	public String show(Model m) {
		m.addAttribute("eid", 01);
		m.addAttribute("ename", "Suraj");
		m.addAttribute("esal", 450.00);
		
		
		Employee e = new Employee(01,"Sagar",100.0);
		
		m.addAttribute("employee",e);
		
		return "HomePage";
	}
}
