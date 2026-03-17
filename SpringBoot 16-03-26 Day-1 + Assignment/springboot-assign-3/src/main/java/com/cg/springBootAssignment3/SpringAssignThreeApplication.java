package com.cg.springBootAssignment3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.cg.springBootAssignment3.bean.Employee;
import com.cg.springBootAssignment3.bean.SBU;

@SpringBootApplication
public class SpringAssignThreeApplication {

	public static void main(String[] args) {
		ApplicationContext context  = SpringApplication.run(SpringAssignThreeApplication.class, args);
//		Employee emp = context.getBean("emp",Employee.class);
//		emp.getEmployeeDetailsAndSBUDetails();
		SBU sbu = context.getBean(SBU.class);
		sbu.printSBUDetails();
	}
	
//	@Bean("emp")
//	public Employee getEmpBean1() {
//		return new Employee(12345, "Harriet", 450000, new SBU(), 30);
//	}
	@Bean()
	public Employee getEmpBean2() {
		return new Employee(12346, "Tim Cook", 6702900);
	}
	
	@Bean()
	public Employee getEmpBean3() {
		return new Employee(12346, "Tim Cook", 6702900);
	}
	
	@Bean("sbu")
	public SBU getSBUBean() {
		return new SBU("PES-BU", "Product Engineering Service", "Kiran Rao");
	}

}
