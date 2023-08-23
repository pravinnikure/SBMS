package com.app.prav.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book 
{
	@Id
	@Column(name="bid")
	private Integer bookId;
	@Column(name="bname")
	private String bookName;
	@Column(name="bcost")
	private Double bookCost;
	@Column(name="bauth")
	private String bookAuth;
	public Book() {
		super();
	}
	public Book(Integer bookId, String bookName, Double bookCost, String bookAuth) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookCost = bookCost;
		this.bookAuth = bookAuth;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Double getBookCost() {
		return bookCost;
	}
	public void setBookCost(Double bookCost) {
		this.bookCost = bookCost;
	}
	public String getBookAuth() {
		return bookAuth;
	}
	public void setBookAuth(String bookAuth) {
		this.bookAuth = bookAuth;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookCost=" + bookCost + ", bookAuth=" + bookAuth
				+ "]";
	}

}
