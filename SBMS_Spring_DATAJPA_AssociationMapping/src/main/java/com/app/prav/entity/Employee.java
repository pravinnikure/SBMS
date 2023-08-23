package com.app.prav.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "emptable")
//@NoArgsConstructor
//@AllArgsConstructor
@Data

public class Employee {
	@Id
	@Column(name = "eid")
	private Integer empId;

	@Column(name = "ename")
	private String empName;
	@Column(name = "esal")
	private Double empSal;

	@ManyToOne
	@JoinColumn(name = "didFK")
	private Department dob;

	public Employee() {
		super();
	}

	public Employee(Integer empId, String empName, Double empSal, Department dob) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.dob = dob;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
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

	public Department getDob() {
		return dob;
	}

	public void setDob(Department dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", dob=" + dob + "]";
	}

}
