package com.vusalaxndzde.springboot.cruddemo.rest;

import com.vusalaxndzde.springboot.cruddemo.dao.EmployeeDAOJpaImpl;
import com.vusalaxndzde.springboot.cruddemo.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private final EmployeeDAOJpaImpl employeeDAOJpa;

    public EmployeeRestController(EmployeeDAOJpaImpl employeeDAOJpa) {
        this.employeeDAOJpa = employeeDAOJpa;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeDAOJpa.findAll();
    }

}
