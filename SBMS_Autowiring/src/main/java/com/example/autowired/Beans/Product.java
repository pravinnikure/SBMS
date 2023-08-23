package com.example.autowired.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Component
@Data
@ToString
public class Product 
{
	@Autowired
	@Qualifier("vo2")
	private Vender vob;    // HAS - A - Relationship

}
