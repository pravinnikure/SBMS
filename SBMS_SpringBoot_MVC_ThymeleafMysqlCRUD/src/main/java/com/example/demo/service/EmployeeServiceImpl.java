package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.exceptions.EmployeeNorFoundException;
import com.example.demo.repository.EmpRepo;

@Service
public class EmployeeServiceImpl implements IEMployeeService 
{
	@Autowired
	private EmpRepo repo; 
	
	public Integer saveEmployee(Employee e) {
		e = repo.save(e);
		return e.getEmpId();
	}

	public List<Employee> getAllEmployee() {
		List<Employee> list = repo.findAll();
		return list;
	}

	public Employee getOneEmployee(Integer eid) {
		
		/*
		 * Optional<Employee> opt = repo.findById(eid); if(opt.isPresent()) { Employee e
		 * = opt.get(); return e; } else
		 * 
		 * throw new EmployeeNorFoundException("Exployee '"+ eid +"'not Exists");
		 */
		
		return repo.findById(eid).orElseThrow(()->new EmployeeNorFoundException("Exployee '"+ eid +"'not Exists"));
		
	}

	public void deleteEmployee(Integer eid) {
		//repo.deleteById(eid);
		
		repo.delete(getOneEmployee(eid));
	}

	public void updateEmployee(Employee e) {
		if(e.getEmpId()!=null && repo.existsById(e.getEmpId()))
		{
		repo.save(e);
		}
		else
			throw new EmployeeNorFoundException("Exployee '"+ e.getEmpId() +"'not Exists");
	}

}
