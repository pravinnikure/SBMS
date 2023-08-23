package com.example.sbms.Beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "my.app")

public class DBConfig 
{	
	public String DBName;
	public String url;
	public String username;
	public String password;
}
