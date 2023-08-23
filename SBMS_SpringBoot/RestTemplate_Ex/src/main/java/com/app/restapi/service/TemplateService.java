package com.app.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TemplateService {

	@Autowired
	private RestTemplate restTemplate;
	
	
	
	public ResponseEntity<String> getRestTemplateData(String s1)
	{
		HttpEntity<String> httpEntity = new HttpEntity<>(s1);
		
		ResponseEntity<String> result = restTemplate.exchange("http://localhost:8080/v1/book/strcreate", HttpMethod.POST, httpEntity, String.class);
		
		return result;
	}
}
