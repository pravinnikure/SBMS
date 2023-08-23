package com.app.prav.repo;

import org.springframework.data.repository.CrudRepository;

import com.app.prav.entity.Book;

public interface BookRepo extends 
		CrudRepository<Book, Integer> {

}
