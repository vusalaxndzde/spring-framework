package com.vusalaxndzde.springboot.cruddemo.rest;

import com.vusalaxndzde.springboot.cruddemo.dao.EmployeeDAO;
import com.vusalaxndzde.springboot.cruddemo.dao.EmployeeDAOJpaImpl;
import com.vusalaxndzde.springboot.cruddemo.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private final EmployeeDAO employeeDAO;

    public EmployeeRestController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeDAO.findAll();
    }

}
