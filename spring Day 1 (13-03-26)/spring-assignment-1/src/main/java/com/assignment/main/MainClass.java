package com.assignment.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.assignment.bean.SBUClass;
 
public class MainClass {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//		Employee emp = context.getBean("emp", Employee.class);
//		emp.getEmployeeDetails(); 
		SBUClass sbu = context.getBean("bu", SBUClass.class);	
		sbu.getSBUEmpDetails();  
		context.close();
	}
}
