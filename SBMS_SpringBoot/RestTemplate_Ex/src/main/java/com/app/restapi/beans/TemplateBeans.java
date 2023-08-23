package com.app.restapi.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Component
@Configuration
class TemplateBeans {
	
	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
}
