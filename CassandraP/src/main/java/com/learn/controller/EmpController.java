package com.learn.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.learn.domain.Employee;
import com.learn.repos.EmpRepository;

@RestController
public class EmpController { //implements CommandLineRunner {

	@Autowired
	private EmpRepository repository;

	@PostConstruct
	public void saveEmp() {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee(6437, "Ram", "Bangalore", 50,"ram@gmail.com"));
		emps.add(new Employee(3523, "Ganesh", "Pune", 20,"Ganesh@gmail.com"));
		emps.add(new Employee(8694, "Shyam", "Mumbai", 30,"Ganesh@gmail.com"));
		emps.add(new Employee(9854, "Ram", "Odisha", 25,"ram@gmail.com"));
		repository.saveAll(emps);
	}

	@GetMapping("/getAllEmps")
	public List<Employee> getemps() {
		return repository.findAll();
	}

	@GetMapping("/getEmpFilterByAge/{age}")
	public List<Employee> getUserFilterByAge(@PathVariable int age) {
		return repository.findByAgeGreaterThan(age);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		List<Employee> emps = new ArrayList<>();
//		emps.add(new Employee(6437, "Ram", "Bangalore", 50,"ram@gmail.com"));
//		emps.add(new Employee(3523, "Ganesh", "Pune", 20,"Ganesh@gmail.com"));
//		emps.add(new Employee(8694, "Shyam", "Mumbai", 30,"Ganesh@gmail.com"));
//		emps.add(new Employee(9854, "Samas", "Odisha", 25,"Shyam@gamil.com"));
//		repository.saveAll(emps);
//		
//	}
}