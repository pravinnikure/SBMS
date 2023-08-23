package com.app.prav.test;

import java.util.Arrays;

import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.app.prav.entity.Book;
import com.app.prav.repo.BookRepository;

@Component
public class TestOperations implements CommandLineRunner {

	@Autowired
	private BookRepository repo;
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
			
		System.out.println(repo.getClass().getName());
	
//		Book b1 = new Book(1,"Core Java","James",100.12);
//		Book b2 = new Book(2,"Python","Rob",200.10);
//		repo.save(b1);
//		repo.save(b2);
		

//		if(b1.getBookId()==b2.getBookId())
//		{
//			repo.save(b2);
//		}
//		repo.save(new Book(3,"HTML","Mahesh Bhatt",70.00));
//		repo.save(new Book(3,"Spring","Mahesh Bhatt",70.00));
//		
		
		//Batch insert
		repo.saveAll(
				
			Arrays.asList(
				new Book(5,"Spring_web","ARYAN",6000.00),
				new Book(6,"MSpring_boot","GREEN",100.00),
				new Book(7,"Spring_MVC","Virat Kohli",700.00),
			
				new Book(8,"Spring","Virat Kohli",7000.00),
				new Book(9,"Node JS ","SAM",100.00),
				new Book(10,"NPM Module","SAM",100.00))
				);
		
		repo.findAll().forEach(System.out::println);
	
		
		// Single column sorting 
		//ORDER by bcost ASC
		
		Sort s1 = Sort.by("bookCost");
			
		Iterable<Book> itr =  repo.findAll(s1);
		
		itr.forEach(System.out::println);
		
		
		// Single column sorting 
		//ORDER by bcost ASC
		
		/*
		 * Sort s2 = Sort.by(Direction.DESC,"bookCost");
		 * repo.findAll(s2).forEach(System.out::println);
		 */
		//Multi column sorting
		
		/*  
		 * Sort s3 = Sort.by(Direction.ASC, "bookName","bookCost");
		 * repo.findAll(s3).forEach(System.out::println);
		 */
		/*
		 * Sort s4 = Sort.by(Order.asc("bookName"), Order.desc("bookCost") );
		 */	
				
		
	//	Iterable<Book> data =   repo.findAll();
		//data.forEach(System.out::println);
		
	//	data.forEach(b->System.out.println(b));
		
	//	System.out.println(repo.count());
		
//		System.out.println(repo.existsById(7));
		
//		Optional<Book> opt =  repo.findById(10);
//		if(opt.isPresent())
//		{
//			Book b3 = opt.get();
//			System.out.println(b3);
//			
//		}else {
//			//System.out.println("No data found");
//		
//			throw new BookNotFoundEception("BOOK NOT EXISTS WITH THIS ID");
//		}
	
//		
//		Book b4 = repo.findById(7).orElseThrow(
//				() -> new BookNotFoundEception("BOOK NOT EXISTS WITH THIS ID")
//				);
//		System.out.println(b4);
//		
//		repo.deleteById(7);
//		
//		Iterable<Book> data1 =   repo.findAll();
//		//data.forEach(System.out::println);
//		
//		data1.forEach(b->System.out.println(b));
//		
	
	}

}
