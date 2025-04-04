package com.ram.sis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ram.sis.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}