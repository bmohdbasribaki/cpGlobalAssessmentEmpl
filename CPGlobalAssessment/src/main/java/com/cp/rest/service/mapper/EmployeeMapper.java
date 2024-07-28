package com.cp.rest.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.cp.rest.dto.EmployeeDto;
import com.cp.rest.entity.Employee;

@Mapper(componentModel="spring")
public interface EmployeeMapper {
	
	@Mappings({
		@Mapping(target="uuid",source="empDto.uuid"),
		@Mapping(target="employeeId",source="empDto.employeeId"),
		@Mapping(target="employeeName",source="empDto.employeeName"),
		@Mapping(target="department",source="empDto.department"),
		@Mapping(target="dob",source="empDto.dob"),
		@Mapping(target="email",source="empDto.email"),
		@Mapping(target="phone_number",source="empDto.phone_number")
	})
	Employee dtoToEntity(EmployeeDto empDto);
	
	@Mappings({
		@Mapping(target="uuid",source="emp.uuid"),
		@Mapping(target="employeeId",source="emp.employeeId"),
		@Mapping(target="employeeName",source="emp.employeeName"),
		@Mapping(target="department",source="emp.department"),
		@Mapping(target="dob",source="emp.dob"),
		@Mapping(target="email",source="emp.email"),
		@Mapping(target="phone_number",source="emp.phone_number")
	})
	EmployeeDto entityToDto(Employee emp);
}
