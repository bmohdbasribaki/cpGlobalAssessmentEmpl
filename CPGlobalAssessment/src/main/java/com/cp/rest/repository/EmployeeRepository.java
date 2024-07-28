package com.cp.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cp.rest.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee	, Long>{
	
	

}
