package com.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp.entity.Emp;

public interface EmpRepository extends JpaRepository<Emp, Long>{

}
