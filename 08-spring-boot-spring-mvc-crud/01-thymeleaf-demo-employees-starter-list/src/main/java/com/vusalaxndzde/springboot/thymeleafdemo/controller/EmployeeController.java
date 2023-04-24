package com.vusalaxndzde.springboot.thymeleafdemo.controller;

import com.vusalaxndzde.springboot.thymeleafdemo.entity.Employee;
import com.vusalaxndzde.springboot.thymeleafdemo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	private final EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		theModel.addAttribute("employees", employeeService.findAll());
		return "employees/list-employees";
	}

	@GetMapping("/showFormForAdd")
	public String showAddForm(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "employees/add-employee-form";
	}

}
