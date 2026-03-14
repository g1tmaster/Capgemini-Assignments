package com.cg.Main;
import com.cg.bean.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
     public static void main(String[] args) {
    	 ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
    	 Employee emp=context.getBean("emp",Employee.class);
    	 emp.displayEmployeeDetails();
    	 ((ClassPathXmlApplicationContext)context).close();
     }
}
