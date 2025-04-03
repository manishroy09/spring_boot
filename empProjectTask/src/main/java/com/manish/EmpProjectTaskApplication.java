package com.manish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.emp.entity.Emp;
import com.emp.repository.EmpRepository;

@SpringBootApplication
public class EmpProjectTaskApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EmpProjectTaskApplication.class, args);
	}
	
	@Autowired
	private EmpRepository EmpRepository;

	@Override
	public void run(String... args) throws Exception {
		
		/*
		Student student1 = new Student("Ram", "Lovewanshi", "ramsoftware786@gmail.com");
		 studentRepository.save(student1);
		  
		  Student student2 = new Student("Sanjay", "kumar", "sanjay@gmail.com");
		  studentRepository.save(student2);
		 
		 Student student3 = new Student("deepak", "sharma", "deepak@gmail.com");
		 studentRepository.save(student3);
		*/
		
	}

}

