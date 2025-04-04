package com.ram.sis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ram.sis.entity.Student;
import com.ram.sis.service.StudentService;

@Controller
public class StudentController {
    
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }
    
    // Handler method to list employees
    @GetMapping("/employees")
    public String listEmployees(Model model) {
        model.addAttribute("employees", studentService.getAllEmployees());
        return "employees";
    }
    
    // Show form to create a new employee
    @GetMapping("/employees/new")
    public String createEmployeeForm(Model model) {
        Student student = new Student();
        model.addAttribute("employee", student);
        return "create_employee";
    }
    
    // Save employee to the database
    @PostMapping("/employees")
    public String saveEmployee(@ModelAttribute("employee") Student student) {
        studentService.saveEmployee(student);
        return "redirect:/employees";
    }
    
    // Show form to edit an employee
    @GetMapping("/employees/edit/{empId}")
    public String editEmployeeForm(@PathVariable Long empId, Model model) {
        model.addAttribute("employee", studentService.getEmployeeById(empId));
        return "edit_employee";
    }

    // Update employee details
    @PostMapping("/employees/{empId}")
    public String updateEmployee(@PathVariable Long empId,
            @ModelAttribute("employee") Student student) {
        
        Student existingEmployee = studentService.getEmployeeById(empId);
        existingEmployee.setEmpId(empId);
        existingEmployee.setName(student.getName());
        existingEmployee.setJob(student.getJob());
        existingEmployee.setSalary(student.getSalary());
        existingEmployee.setDeptNo(student.getDeptNo());
        
        studentService.updateEmployee(existingEmployee);
        return "redirect:/employees";        
    }
    
    // Handler method to delete an employee
    @PostMapping("/employees/{empId}/delete")
    public String deleteEmployee(@PathVariable Long empId) {
        studentService.deleteEmployeeById(empId);
        return "redirect:/employees";
    }
    
    // 🔥 NEW: Find Employee by ID and Show Details
    @GetMapping("/employee/{empId}")
    public String getEmployeeById(@PathVariable Long empId, Model model) {
        Student student = studentService.getEmployeeById(empId);
        model.addAttribute("employee", student);
        return "employee_details"; // New page to show employee details
    }
}
