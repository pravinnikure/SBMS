package com.app.prav.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.prav.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> 
{

	
	
}
