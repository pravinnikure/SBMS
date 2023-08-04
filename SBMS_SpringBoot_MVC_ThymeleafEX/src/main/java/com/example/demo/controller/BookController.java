package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController 
{
	@GetMapping("/show")
	public String getData(Model model)
	{
		model.addAttribute("message","Heyy !! ");
		return "BookPage";
	}
	
	
	@GetMapping("/data")
	public String getDataHome(Model model)
	{
		model.addAttribute("message","Heyy we are on Book Data page!! ");
		return "BookData";
	}
}
