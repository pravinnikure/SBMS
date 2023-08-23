package com.app.prav.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.prav.entity.Employee;
import com.app.prav.repository.EmployeeRepo;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepo repo;

	public void run(String... args) throws Exception {

		Employee e1 = new Employee(1, "Abhi", 300.0);
		repo.save(e1);

		repo.saveAll(Arrays.asList(new Employee(1, "Abhi", 300.0), new Employee(2, "Sumit", 400.0)));

		List<Object[]> data = repo.getEmpData();

		data.stream().map(e -> e[0] + " " + e[1]).forEach(System.out::println);

		int cnt = repo.updateSalByName(800.0, "Sumit");
		System.out.println(cnt); // Printing count of rows affected

		int delCnt = repo.deleteEmpByName("Sumit");

		System.out.println(delCnt);
		List<Object[]> data1 = repo.getEmpData();

		data1.stream().map(e -> e[0] + " " + e[1]).forEach(System.out::println);

	}

}
