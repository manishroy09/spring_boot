package com.emp.service;

import java.util.List;

import com.emp.entity.Emp;

public interface EmpService {
	List<Emp> getAllEmployee();
	
	Emp saveEmployee(Emp Emp);
	
	Emp getEmployeeById(Long id);
	
	Emp updateEmployee(Emp Emp);
	
	void deleteEmployeeById(Long id);
}