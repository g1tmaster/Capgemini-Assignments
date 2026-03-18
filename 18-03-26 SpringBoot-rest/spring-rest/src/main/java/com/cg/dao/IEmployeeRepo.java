package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.Entity.Employee;


@Repository
public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {

}
