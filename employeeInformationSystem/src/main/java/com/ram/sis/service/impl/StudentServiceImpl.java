package com.ram.sis.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ram.sis.entity.Student;
import com.ram.sis.repository.StudentRepository;
import com.ram.sis.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepository;
    
    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllEmployees() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveEmployee(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getEmployeeById(Long empId) {
        return studentRepository.findById(empId).get();
    }

    @Override
    public Student updateEmployee(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteEmployeeById(Long empId) {
        studentRepository.deleteById(empId);    
    }
}


