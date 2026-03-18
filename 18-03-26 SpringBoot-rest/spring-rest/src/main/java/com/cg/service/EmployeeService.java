package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Entity.Employee;
import com.cg.dao.IEmployeeRepo;


@Service
public class EmployeeService implements IEmployeeService{

	
	@Autowired
	IEmployeeRepo repo;
	
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Employee createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return repo.saveAndFlush(emp);
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public String removeEmployee(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return "Employee removed.";
	}

	@Override
	public String updateEmployee(Employee emp) {
		repo.saveAndFlush(emp);
		return "Employee updated.";
	}

}
