package com.cp.rest.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class EmployeeDto {

	private Long uuid;

	private String employeeId;

	private String employeeName;
	
	private String department;
	
	private String dob;
	
	private String email;
	
	private String phone_number;
	
}
