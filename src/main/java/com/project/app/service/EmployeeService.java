package com.project.app.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.app.dao.EmployeRepository;
import com.project.app.entity.Employee;
@CrossOrigin(origins = "*")
@RestController
public class EmployeeService {
	
	@Autowired
	EmployeRepository employeRepository;
	
	@GetMapping("/employee-name/{lastname}")
	public List<Employee> getEmployesByName(@PathVariable("lastname") String nom){
		return employeRepository.findByName(nom.toLowerCase());
	}
	
	@GetMapping("/list")
	public List<Employee> getEmployes(){
		return employeRepository.findAll();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable("id") long id){
		return employeRepository.findById(id).get();
	}
	
	@PutMapping("/update/{id}")
	public Employee updateEmploye(@PathVariable("id") long id, @RequestBody Employee emp){
		emp.setId(id);
		/*
		Employee employee =employeRepository.findById(id).get();
		employee.setLastname(emp.getLastname().toLowerCase());
		employee.setFirstname(emp.getFirstname().toLowerCase());
		employee.setEmail(emp.getEmail().toLowerCase());
		return employeRepository.save(employee);*/
		return employeRepository.save(emp);
	}
	
	@PostMapping("/add")
	public Employee addEmploye(@RequestBody Employee emp){
		/*emp.setNom(emp.getNom().toLowerCase());
		emp.setPrenom(emp.getPrenom().toLowerCase());
		emp.setAdressMail(emp.getAdressMail().toLowerCase());*/
		return employeRepository.save(emp);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteEmploye(@PathVariable("id") long id){
		employeRepository.deleteById(id);
	}

	public static void main(String[] args) {
		
	}

}
