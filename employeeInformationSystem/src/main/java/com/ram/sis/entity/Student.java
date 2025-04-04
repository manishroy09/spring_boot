package com.ram.sis.entity;

import jakarta.persistence.*;

@Entity 
@Table(name = "employees")
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empId;
    
    @Column(name = "name", nullable = false)
    private String name;
    
    @Column(name = "job")
    private String job;
    
    @Column(name = "salary")
    private Double salary;
    
    @Column(name = "dept_no")
    private Integer deptNo;
    
    public Student() {
    }
    
    public Student(String name, String job, Double salary, Integer deptNo) {
        this.name = name;
        this.job = job;
        this.salary = salary;
        this.deptNo = deptNo;
    }
    
    public Long getEmpId() {
        return empId;
    }
    
    public void setEmpId(Long empId) {
        this.empId = empId;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getJob() {
        return job;
    }
    
    public void setJob(String job) {
        this.job = job;
    }
    
    public Double getSalary() {
        return salary;
    }
    
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    
    public Integer getDeptNo() {
        return deptNo;
    }
    
    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }
}
