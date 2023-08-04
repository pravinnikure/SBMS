package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProductController 
{
	
	@GetMapping("/delete")
	public String removeProduct(
			@RequestParam Integer pid,
			RedirectAttributes attributes
			)
	{
	
		String m = "Product Delete "+ pid;
		System.out.println("Fom delete"+ m);
		//model.addAttribute(m);
		
		//model.addAttribute("Message"+ m);
		
		attributes.addAttribute("message", m);
		return "redirect:all";
	}
	
	@GetMapping("/all")
	public String showProducts(
			@RequestParam(required = false) String message,
			Model model
			)
	{
		model.addAttribute("m",message);
		System.out.println("From products");
		return "ProductPage";
	}

}
