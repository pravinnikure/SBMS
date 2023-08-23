package com.app.prav.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.prav.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> 
{

	//Perform joins query here
	/*
	 * @Query("SELECT E.empName, D.deptAdmin FROM Employee E INNER JOIN E.dob as D")
	 * public List<Object[]> getAllEmployee();
	 * 
	 * @Query("SELECT E.empName, D.deptAdmin FROM Employee E LEFT JOIN E.dob as D")
	 * public List<Object[]> getAllLestEmployee();
	 * 
	 * @Query("SELECT E.empName, D.deptAdmin FROM Employee E RIGHT JOIN E.dob as D")
	 * public List<Object[]> getAllRightEmployee();
	 */
	
//	@Query("SELECT E.empName, D.deptAdmin FROM Employee E CROSS JOIN E.dob as D")
//	public List<Object[]> getAllFullEmployee();
	
	
	List<Employee> findByEmpSalLessThan(Double empSal);
	
	List<Employee> findByEmpSalGreaterThan(Double empSal);
	
	
}
