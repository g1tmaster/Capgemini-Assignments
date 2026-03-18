package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.Entity.Employee;


public interface IEmployeeService {
	
	public List<Employee> getAllEmployees();
	public Employee createEmployee(Employee emp);
	public Employee getEmployee(int id);
	public String removeEmployee(int id);
	public String updateEmployee(Employee emp);
	
	
}
