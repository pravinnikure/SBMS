package com.app.prav.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.prav.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
	
	//Fetching all records from table
	@Query("SELECT e FROM Book e")
	public List<Book> getAllBooks();

	
	// Fetring Specific columnn
	
	@Query("SELECT b.bookName FROM Book b")
	public List<String> getAllBookNames();

	//Select book name and cost mixed data so that we can use Object class as return type
	@Query("SELECT B.bookName, B.bookCost FROM Book B")
	public List<Object[]> getNameAndCost();
	
	@Query("SELECT B FROM Book B WHERE B.bookName=?1 or B.bookCost=?2")
	public List<Book> getBookDataA(String bName,Double bCost);
	
	@Query("SELECT B FROM Book B WHERE B.bookName=:bName or B.bookCost=:bCost")
	public List<Book> getBookDataB(String bName,Double bCost);
	
	@Query("SELECT B FROM Book B WHERE B.bookName=:bAuth")
	public List<Book> getBookDataC(String bAuth);
	
	@Query("SELECT B.bookName, COUNT(B.bookName) FROM Book B GROUP BY B.bookName HAVING bookName!=:bName")
	public List<Object[]> getBookDataD(String bName);
	
}


