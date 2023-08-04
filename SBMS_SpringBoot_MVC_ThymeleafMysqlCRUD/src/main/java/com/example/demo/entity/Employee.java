package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "emptab")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "eid")
	private Integer empId;
	@Column(name = "ename", length = 50)
	private String empName;
	@Column(name = "egen", length = 10, nullable = false)
	private String empGen;
	@Column(name = "edept", length = 10)
	private String empDept;
	@Column(name = "esal")
	private Double empSal;
	@Column(name = "eadd", length = 100, nullable = false)
	private String empAdd;

	public Employee() {
		super();
	}

	public Employee(Integer empId, String empName, String empGen, String empDept, Double empSal, String empAdd) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empGen = empGen;
		this.empDept = empDept;
		this.empSal = empSal;
		this.empAdd = empAdd;
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

	public String getEmpGen() {
		return empGen;
	}

	public void setEmpGen(String empGen) {
		this.empGen = empGen;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public Double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}

	public String getEmpAdd() {
		return empAdd;
	}

	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empGen=" + empGen + ", empDept=" + empDept
				+ ", empSal=" + empSal + ", empAdd=" + empAdd + "]";
	}

}
