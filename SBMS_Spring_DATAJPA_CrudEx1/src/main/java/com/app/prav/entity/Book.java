package com.app.prav.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
//@AllArgsConstructor
//@NoArgsConstructor

@Table(name = "book")
public class Book 
{
	@Id
	@Column(name="bid")
	private Integer bookId;
	@Column(name="bname")
	private String bookName;
	@Column(name="bauth")
	private String bookAuthor;
	@Column(name="bcost")
	private Double bookCost;
	
	public Book() {
		super();
	}

	public Book(Integer bookId, String bookName, String bookAuthor, Double bookCost) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookCost = bookCost;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBooName() {
		return bookName;
	}

	public void bookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public Double getBookCost() {
		return bookCost;
	}

	public void setBookCost(Double bookCost) {
		this.bookCost = bookCost;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookCost="
				+ bookCost + "]";
	}
	
	
}
