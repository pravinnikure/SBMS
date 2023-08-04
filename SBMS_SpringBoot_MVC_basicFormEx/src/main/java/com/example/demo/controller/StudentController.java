package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.bean.Student;

@Controller
public class StudentController 

{
	//1.Show Form
	@GetMapping("/register")
	public String showReg()
	{
		return "StudentRegister";
	}
	
	
	//2.Read formData
	@PostMapping("/save")
	public String showData(@ModelAttribute Student student,Model m)
	{
		System.out.println(student);
		
		m.addAttribute("student ",student);
		
		
		return "StudentData" ;
	}
	
}
