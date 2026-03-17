package com.cg.springBootAssignment3.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int empId;
	private String ename;
	private double sal;
//	private String bu;
	@Autowired
	private SBU sbu;
	private int age;
	
	
//	public Employee(int empId, String ename, double sal, SBU sbu, int age) {
//		super();
//		this.empId = empId;
//		this.ename = ename;
//		this.sal = sal;
//		this.bu = sbu;
//		this.age = age;
//	}
	public Employee(int empId, String ename, double sal) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", sal=" + sal + "]";
	}

	public Employee() {
		
	}
	
	public void getEmployeeDetails() {     
		System.out.println("Employee Details");
		System.out.println("-------------------------");
		System.out.println("Employee ID: "+empId);
		System.out.println("Employee Name: "+ ename);
		System.out.println("Employee Salary: "+ sal);
		System.out.println("Employee BU : "+ sbu);
		System.out.println("Employee Age : "+ age);
	}

}
