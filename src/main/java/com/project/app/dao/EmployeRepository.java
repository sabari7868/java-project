package com.project.app.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.app.entity.Employee;

@Repository
public interface EmployeRepository extends JpaRepository <Employee,Long>{
	
	//@Query("select e from Employee e where e.lastname = ?1")
	@Query("select e from Employee e where e.lastname LIKE %?1% ")
	List<Employee> findByName(String lastname);
	
}
