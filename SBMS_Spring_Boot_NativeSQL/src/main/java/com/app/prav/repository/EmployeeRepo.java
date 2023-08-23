package com.app.prav.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.app.prav.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> 
{

	@Transactional
	@Modifying
	@Query("UPDATE Employee E SET E.empSal=:esal WHERE E.empName=:ename")
	int updateSalByName(Double esal,String ename); // Printing count of rows affected
	
	@Transactional
	@Modifying
	@Query("DELETE FROM Employee E WHERE E.empName=:ename")
	int deleteEmpByName(String ename); // Printing count of rows affected
	
	
	
	
	@Query(value = "SELECT E.eid,E.ename FROM EMPLOYEE E",nativeQuery = true)
	public List<Object[]> getEmpData();
	
	
}
