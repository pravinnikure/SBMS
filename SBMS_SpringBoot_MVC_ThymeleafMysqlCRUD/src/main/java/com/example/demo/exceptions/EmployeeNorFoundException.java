package com.example.demo.exceptions;

public class EmployeeNorFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
	public EmployeeNorFoundException()
	{
		super();
	}
	
	public EmployeeNorFoundException(String message)
	{
		super(message);
	}
}
