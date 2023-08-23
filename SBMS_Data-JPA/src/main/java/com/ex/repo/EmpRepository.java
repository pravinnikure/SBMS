package com.ex.repo;
import org.springframework.data.repository.CrudRepository;

import com.ex.entity.Employee;

public interface EmpRepository extends CrudRepository<Employee, Integer>{

}
