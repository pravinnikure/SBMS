package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{

	@RequestMapping("/emp")
	public String ShowEmp()
	{
		return "EmpHome";
	}
	
	@GetMapping("/show")
	public String showHome()
	{
		return "HomePage";
	}
	
	@PostMapping("/save")
	public String saveUser()
	{
		return "UserPage";
	}
}
