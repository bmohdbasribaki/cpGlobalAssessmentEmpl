package com.cp.rest.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.cp.rest.dto.EmployeeDto;
import com.cp.rest.entity.Employee;
import com.cp.rest.exception.BadRequestException;
import com.cp.rest.repository.EmployeeRepository;
import com.cp.rest.service.EmployeeService;
import com.cp.rest.service.mapper.EmployeeMapper;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	EmployeeMapper employeeMapper;
	
	@Override
	public List<Employee> listAllEmployee() {
		
		return employeeRepository.findAll();
	}

	@Override
	public EmployeeDto getEmployee(Long id) {
		
		Employee employee = employeeRepository.findById(id).get();
		return employeeMapper.entityToDto(employee);
	}
	
	
	@Override
	public void saveEmployee(EmployeeDto employeeDto) {
		
		 
		//new save
		if(ObjectUtils.isEmpty(employeeDto.getUuid())) {
			Optional<Employee> employee = Optional.of(employeeMapper.dtoToEntity(employeeDto));
			employeeRepository.save(employee.get());
		}else {
			//update
			Optional<Employee> employee = employeeRepository.findById(employeeDto.getUuid());
			employee.ifPresent(empl -> {
				empl.setDepartment(employeeDto.getDepartment());
				empl.setDob(employeeDto.getDob());
				empl.setEmail(employeeDto.getEmail());
				empl.setEmployeeId(employeeDto.getEmployeeId());
				empl.setEmployeeName(employeeDto.getEmployeeName());
				empl.setPhone_number(employeeDto.getPhone_number());
			});
			employeeRepository.save(employee.get());
			
			
		}
		
	}

	@Override
	public void deleteEmployee(Long id) {
		
		Optional<Employee> employee = employeeRepository.findById(id);
		if(employee.isPresent()) {
			employeeRepository.delete(employee.get());
		}else {
			throw new BadRequestException("employee not exist");
		}
	}

	
	

}
