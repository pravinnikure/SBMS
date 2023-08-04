package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.bean.Student;

@Controller
@RequestMapping("/student")
public class StudentController 
{
	@GetMapping("/edit")
	public String showEditPage(Model model)
	{
		Student s1 = new Student(1, "Samir", 100.0,"Core Java"); 
		model.addAttribute("student",s1);
		List<String> courses =Arrays.asList("Core Java","Adv Java","Python","MySql");
		
		model.addAttribute("courses", courses); 
		
		
		
		return "StudentEditPage";
	}
}
