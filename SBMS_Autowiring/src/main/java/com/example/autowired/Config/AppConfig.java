package com.example.autowired.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.autowired.Beans.Vender;

@Configuration
public class AppConfig
{
	
	@Bean
	@Primary
	public Vender vo1()
	{
		Vender v1 = new Vender();
		v1.setVname("vo1-XYZ");
		
		return v1;
		
	}
	@Bean
	public Vender vo2()
	{
		Vender v2 = new Vender();
		v2.setVname("vo2-ABC");
		
		return v2;
		
	}

	
}
