package com.app.prav.exception;

public class BookNotFoundEception extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public BookNotFoundEception()
	{
		super();
	}

	public BookNotFoundEception(String message)
	{
		super(message);
	}
}
