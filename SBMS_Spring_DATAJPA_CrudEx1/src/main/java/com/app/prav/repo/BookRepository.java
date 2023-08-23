package com.app.prav.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.app.prav.entity.Book;

public interface BookRepository 
			extends PagingAndSortingRepository<Book, Integer>{

}
