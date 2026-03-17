package com.cg.spring_boot_day_11;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.cg.entity.Employee;
import com.cg.repo.IEmployeeRepo;

@SpringBootApplication
@EnableJpaRepositories("com.cg.repo")
@EntityScan("com.cg.entity")


@ComponentScan("com.cg")
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		IEmployeeRepo erepo = context.getBean(IEmployeeRepo.class);
		erepo.save(new Employee(1, "Pintu", LocalDate.of(1990, 2, 2),1000.00));
		
	}

}
