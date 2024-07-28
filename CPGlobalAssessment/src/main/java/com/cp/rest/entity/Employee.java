package com.cp.rest.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee{
	
	@Id
	@GeneratedValue
	private Long uuid;
	
	private String employeeId;
	
	private String employeeName;

	private String department;
	
	private String dob;
	
	private String email;
	
	private String phone_number;

}
