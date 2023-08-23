package com.app.restapi.controller;

import java.awt.PageAttributes.MediaType;
import java.net.http.HttpHeaders;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.app.restapi.entity.Student;

@RestController

@RequestMapping("/consumer")
public class ConsumerController {
	@Autowired
	private RestTemplate restTemplate;

	// Get mapping
	@GetMapping("/getAllStudent")
	private ResponseEntity<String> getAllStudent() {
		String url = "http://localhost:8081/v1/api/student/all";

		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

		return response;

	}

	// Get mapping
	@GetMapping("/getOneStudent")
	private ResponseEntity<String> getOneStudent() {
		String url = "http://localhost:8081/v1/api/student/find/{id}";

		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class, 1); // U can add any number of
																							// inputs , separated

		return response;

	}

	@PostMapping("/addStudent")
	private ResponseEntity<String> addStudent(@RequestBody Student s1) {
		
		String url = "http://localhost:8081/v1/api/student/save";
		
		String body = "{\r\n"
				+ "    \"stdId\":121,\r\n"
				+ "    \"stdName\":\"Salim\",\r\n"
				+ "    \"stdGen\":\"Male\",\r\n"
				+ "    \"stdCourse\":\"Mechanical\",\r\n"
				+ "    \"stdAdd\":\"SA 994554\"\r\n"
				+ "}";
		
		org.springframework.http.HttpHeaders header = new org.springframework.http.HttpHeaders();

		header.setContentType(org.springframework.http.MediaType.APPLICATION_JSON);

		HttpEntity<String> requestBody = new HttpEntity<String>(body, header);

		//ResponseEntity<String> response = restTemplate.postForEntity(url, requestBody, String.class);

		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, requestBody, String.class);
		
		return response;

	}
	
	
	@PutMapping("/updateStudent")
	private ResponseEntity<String> updateStudent(@RequestBody Student s1) {
		
		String url = "http://localhost:8081/v1/api/student/modify";
		
		String body = "{\r\n"
				+ "    \"stdId\":10,\r\n"
				+ "    \"stdName\":\"Shalini\",\r\n"
				+ "    \"stdGen\":\"Female\",\r\n"
				+ "    \"stdCourse\":\"Mechanical\",\r\n"
				+ "    \"stdAdd\":\"SA 994554\"\r\n"
				+ "}";
		
		org.springframework.http.HttpHeaders header = new org.springframework.http.HttpHeaders();

		header.setContentType(org.springframework.http.MediaType.APPLICATION_JSON);

		HttpEntity<String> requestBody = new HttpEntity<String>(body, header);

		//ResponseEntity<String> response = restTemplate.postForEntity(url, requestBody, String.class);

		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.PUT, requestBody, String.class);
		
		return response;

	}
	
	
	
	
	@DeleteMapping("/deleteStudent")
	private ResponseEntity<String> removeStudent() {
		String url = "http://localhost:8081/v1/api/student/remove/{id}";

		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.DELETE, null, String.class,8);
																							// inputs , separated

		return response;

	}


}
