package com.epm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.emp.entity.Emp;
import com.emp.service.EmpService;

@Controller
public class EmpController {
	
	private EmpService EmpService;

	public EmpController(EmpService EmpService) {
		super();
		this.EmpService = EmpService;
	}
	
	// handler method to handle list students and return mode and view
	@GetMapping("/employees")
	public String listEmployees(Model model) {
		model.addAttribute("employees", EmpService.getAllEmployee());
		return "employees";
	}
	
	@GetMapping("/employees/new")
	public String createEmployeeForm(Model model) {
		
		// create student object to hold student form data
		Emp employee = new Emp();
		model.addAttribute("employee", employee);
		return "create_employee";
		
	}
	
	@PostMapping("/employees")
	public String saveEmployee(@ModelAttribute("employee") Emp em) {
		EmpService.saveEmployee(em);
		return "redirect:/employees";
	}
	
	@GetMapping("/employee/edit/{id}")
	public String editEmployeeForm(@PathVariable Long id, Model model) {
		model.addAttribute("employee", EmpService.getEmployeeById(id));
		return "edit_Employee";
	}

	@PostMapping("/employees/{id}")
	public String updateEmployee(@PathVariable Long id,
			@ModelAttribute("employee") Emp employee,
			Model model) {
		
		// get student from database by id
		Emp existingEmployee = EmpService.getEmployeeById(id);
		existingEmployee.setEmpid(id);
		existingEmployee.setName(employee.getName());
		existingEmployee.setJob(employee.getJob());
		existingEmployee.setSal(employee.getSal());
		existingEmployee.setDeptno(employee.getDeptno());
		
		// save updated student object
		EmpService.updateEmployee(existingEmployee);
		
		return "redirect:/employees";		
	}
	
	// handler method to handle delete student request
	
	@GetMapping("/employees/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		EmpService.deleteEmployeeById(id);
		return "redirect:/employees";
	}
	
}
