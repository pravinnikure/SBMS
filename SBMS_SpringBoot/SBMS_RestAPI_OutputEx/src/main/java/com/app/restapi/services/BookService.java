package com.app.restapi.services;

import org.springframework.stereotype.Service;

@Service
public class BookService 
{
	
	public String createString(String str)
	{		
		return "Successfully added string from Book API";
	}
	
}
