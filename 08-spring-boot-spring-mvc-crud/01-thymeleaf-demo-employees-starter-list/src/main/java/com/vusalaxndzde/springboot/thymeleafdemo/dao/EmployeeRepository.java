package com.vusalaxndzde.springboot.thymeleafdemo.dao;

import com.vusalaxndzde.springboot.thymeleafdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


}
