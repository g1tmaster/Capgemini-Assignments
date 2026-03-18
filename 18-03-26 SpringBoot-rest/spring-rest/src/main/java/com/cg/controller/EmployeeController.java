package com.cg.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Entity.Employee;
import com.cg.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping(" ")
	public List<Employee> getAllEmployee() {
//		return new Employee(101, "John Cena", LocalDate.of(1990, 2, 2), 45000);
		return service.getAllEmployees();
	}
	
	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return service.getEmployee(id);
	}
	
	@PostMapping
	public Employee createEmployee(@RequestBody Employee emp) {
		return service.createEmployee(emp);
	}
	
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return service.removeEmployee(id);
	}
	@PutMapping
	public String updateEmployee(@RequestBody Employee emp) {
		return service.updateEmployee(emp);
	}
}
