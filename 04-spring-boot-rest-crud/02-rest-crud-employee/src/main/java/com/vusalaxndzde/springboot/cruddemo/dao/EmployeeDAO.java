package com.vusalaxndzde.springboot.cruddemo.dao;

import com.vusalaxndzde.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

}
