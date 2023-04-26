package com.vusalaxndzde.springboot.thymeleafdemo.service;

import java.util.List;

import com.vusalaxndzde.springboot.thymeleafdemo.entity.Employee;

public interface EmployeeService {

	List<Employee> findAll();

	List<Employee> findAllByOrderByLastNameAsc();
	
	Employee findById(int theId);
	
	void save(Employee theEmployee);
	
	void deleteById(int theId);
	
}
