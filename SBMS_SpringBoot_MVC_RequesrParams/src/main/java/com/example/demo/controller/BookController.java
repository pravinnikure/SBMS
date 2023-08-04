package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class BookController 
{
	
	@GetMapping("/find")
	public String fetchook(
			@RequestParam(value="auth",required=false, defaultValue = "NONE") String auth,
			@RequestParam String type,
			Model m)
	{
		m.addAttribute("inputs", auth+ " , " +type);
		
		return "BookPage";
		
	}

}
