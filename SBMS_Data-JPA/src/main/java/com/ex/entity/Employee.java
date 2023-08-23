package com.ex.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;



@Data
@Entity
@Table
public class Employee
{
	
	@Id
	@Column
	private Integer empId;
	@Column
	private String eName;
	@Column
	private Double eSal;
	
}
