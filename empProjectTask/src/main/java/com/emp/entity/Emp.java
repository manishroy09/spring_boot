package com.emp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Emp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empid;
	
	@Column(name = "name", nullable = false)
    private String name;
	
	@Column(name = "job")
    private String job;
	
	@Column(name = "sal")
    private float sal;
	
	@Column(name = "deptno")
    private int deptno;

	public Emp() {
		super();
	}

	public Emp(Long empid, String name, String job, float sal, int deptno) {
		super();
		this.empid = empid;
		this.name = name;
		this.job = job;
		this.sal = sal;
		this.deptno = deptno;
	}

	public Long getEmpid() {
		return empid;
	}

	public void setEmpid(Long empid) {
		this.empid = empid;
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

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	
    
}
