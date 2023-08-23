package com.app.prav.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.prav.entity.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer>
{

}
