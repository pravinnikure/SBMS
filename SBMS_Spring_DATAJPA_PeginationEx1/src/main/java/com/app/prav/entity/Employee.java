package com.app.prav.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
@Entity
@Table(name="employee")
public class Employee 
{
	@Id
	@Column(name="eid")
	private Integer eId;
	
	@Column(name="eName")
	private String eName;
	@Column(name="eSal")
	private Double eSal;
		
	public Employee() {
		super();
	}
	public Employee(Integer eId, String eName, Double eSal) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSal = eSal;
	}
	public Integer geteId() {
		return eId;
	}
	public void seteId(Integer eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public Double geteSal() {
		return eSal;
	}
	public void seteSal(Double eSal) {
		this.eSal = eSal;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSal=" + eSal + "]";
	}
	

}
