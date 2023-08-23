package com.app.prav.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.prav.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
