package com.ram.sis.service;

import java.util.List;


import com.ram.sis.entity.Student;

public interface StudentService {
List<Student> getAllEmployees();
	
    Student saveEmployee(Student student);
	
    Student getEmployeeById(Long id);
	
    Student updateEmployee(Student student);
	
	void deleteEmployeeById(Long id);
}