package com.cp.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cp.rest.dto.EmployeeDto;
import com.cp.rest.entity.Employee;

@Service
public interface EmployeeService {

	List<Employee> listAllEmployee();

	void saveEmployee(EmployeeDto employeeDto);

	void deleteEmployee(Long id);

	EmployeeDto getEmployee(Long id);

	
}
