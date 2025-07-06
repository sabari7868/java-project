package com.project.app;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.app.dao.EmployeRepository;
import com.project.app.entity.Employee;

@SpringBootApplication
public class EmployeeApplication implements CommandLineRunner {

	@Autowired
	EmployeRepository employeRepository ;
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		employeRepository.save(new Employee("Last name 1","First name 1","lastname1.firstname1@email.com"));
		employeRepository.save(new Employee("Last name 2","First name 2","lastname2.firstname2@email.com"));
		employeRepository.save(new Employee("Last name 3","First name 3","lastname3.firstname3@email.com"));
		employeRepository.findAll().forEach(emp -> {System.out.println(emp.toString()); });*/				
	}
}
