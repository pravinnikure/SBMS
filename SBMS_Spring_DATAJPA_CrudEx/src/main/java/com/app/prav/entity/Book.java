package com.app.prav.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data

@Entity
@Table(name="book")
public class Book 
{
	@Id
	@Column(name="bid")
	private Integer bootId;
	@Column(name="bname")
	private String bookName;
	@Column(name="bauth")
	private String bookAuthor;
	@Column(name="bcost")
	private Double bookCost;
	

}
