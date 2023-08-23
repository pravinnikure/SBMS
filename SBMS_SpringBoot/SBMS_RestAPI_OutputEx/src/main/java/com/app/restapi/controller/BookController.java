package com.app.restapi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.restapi.entity.Book;
import com.app.restapi.services.BookService;

@RestController
@RequestMapping("/v1/book")
public class BookController
{
	@Autowired
	private BookService service;
	
	@GetMapping("/find")
	public @ResponseBody ResponseEntity<Book> getOneBook()
	{
		Book b1 = new Book(1, "Java", 500.0);
		
		//Takes two parameter Response body and status 
		ResponseEntity<Book> book = new ResponseEntity<Book>(b1, HttpStatus.OK);
		return book;
	}

	@GetMapping("/all")
	public @ResponseBody ResponseEntity<List<Book>> getAllBook()
	{
		
		//Takes two parameter Response body and status 
		ResponseEntity<List<Book>> book = new ResponseEntity<List<Book>>(
				Arrays.asList(new Book(1, "Java", 500.0),
						new Book(2, "Core Java", 400.0),
						new Book(3, "Adv Java", 450.0),
						new Book(4, "JSP", 300.0))
				,HttpStatus.OK);
		return book;
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> create(@RequestBody Book book)
	{
		System.out.println(book);
		return new ResponseEntity<String>("Data Received",HttpStatus.OK);
	}
	
	@PostMapping("/saveAll")
	public ResponseEntity<List<Book>> createMultiple(@RequestBody List<Book> book)
	{
		System.out.println(book);
		return new ResponseEntity<List<Book>>(book,HttpStatus.OK);
	}
	
	@PostMapping("/strcreate")
	public String getForTemplate(String str)
	{
		System.out.println("Getting call from Rest client rest service");
		
		return service.createString(str);
	}
	
	@GetMapping("/fetchOne/{bookId}")
	public ResponseEntity<?> fetchBook(
			@PathVariable Integer bookId
			)
	{
		if(bookId!=0)
		{
			return new ResponseEntity<Book>(new Book(bookId,"PHP",500.0), HttpStatus.OK);
		}
		else 
		{
			return new ResponseEntity<String>("Not Exists", HttpStatus.BAD_GATEWAY);
		}
		
		}
	
	
}
