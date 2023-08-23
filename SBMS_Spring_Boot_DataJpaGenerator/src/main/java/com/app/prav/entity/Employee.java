package com.app.prav.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name = "EMPLOYEE")
//@NoArgsConstructor
//@AllArgsConstructor
@Data

public class Employee {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@GeneratedValue(generator = "testgenerator")
	@GenericGenerator(name = "testgenerator",strategy = "com.app.prav.generators.MyCostomFenerators")
	
	@Column(name = "eid")
	private String empId;

	@Column(name = "ename")
	private String empName;
	@Column(name = "esal")
	private Double empSal;

	

	public Employee() {
		super();
	}

	public Employee(String empId, String empName, Double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}

	


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

}
