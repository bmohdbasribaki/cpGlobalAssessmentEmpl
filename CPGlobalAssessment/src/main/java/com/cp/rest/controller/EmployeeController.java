package com.cp.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cp.rest.constant.ResponseCodeConstants;
import com.cp.rest.dto.EmployeeDto;
import com.cp.rest.dto.ResponseDto;
import com.cp.rest.service.EmployeeService;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@CrossOrigin(origins="*",maxAge = 3600)
@RequestMapping("/api/empl/")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully fetched details."),
			@ApiResponse(code = 400, message = "Required Input Parameters missing."),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
    @GetMapping(value="/listAll")
	public ResponseEntity<ResponseDto> listEmployee() {
		try {
			ResponseDto dto = new ResponseDto();
			dto.setResults((Object) service.listAllEmployee());
			dto.setStatusId(ResponseCodeConstants.OK);
			dto.setStatusMessage(ResponseCodeConstants.SUCCESS_STRING);
			return ResponseEntity.status(HttpStatus.OK).body(dto);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseDto(
					ResponseCodeConstants.BAD_REQUEST, e.getMessage()));
		}
	}
	
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully fetched details."),
			@ApiResponse(code = 400, message = "Required Input Parameters missing."),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
    @GetMapping(value="/{id}")
	public ResponseEntity<ResponseDto> getEmployee(@PathVariable("id") Long id) {
		try {
			ResponseDto dto = new ResponseDto();
			dto.setResults((Object) service.getEmployee(id));
			dto.setStatusId(ResponseCodeConstants.OK);
			dto.setStatusMessage(ResponseCodeConstants.SUCCESS_STRING);
			return ResponseEntity.status(HttpStatus.OK).body(dto);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseDto(
					ResponseCodeConstants.BAD_REQUEST, e.getMessage()));
		}
	}
	
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully fetched details."),
			@ApiResponse(code = 400, message = "Required Input Parameters missing."),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
    @PostMapping(value="/saveorupdate")
	public ResponseEntity<ResponseDto> save(@RequestBody EmployeeDto employeeDto) {
		try {
			ResponseDto dto = new ResponseDto();
			service.saveEmployee(employeeDto);
			dto.setStatusId(ResponseCodeConstants.OK);
			dto.setStatusMessage(ResponseCodeConstants.SUCCESS_STRING);
			return ResponseEntity.status(HttpStatus.OK).body(dto);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseDto(
					ResponseCodeConstants.BAD_REQUEST, e.getMessage()));
		}
	}
	
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully fetched details."),
			@ApiResponse(code = 400, message = "Required Input Parameters missing."),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
    @PostMapping(value="/delete/{id}")
	public ResponseEntity<ResponseDto> delete(@PathVariable("id") Long id) {
		try {
			ResponseDto dto = new ResponseDto();
			service.deleteEmployee(id);
			dto.setStatusId(ResponseCodeConstants.OK);
			dto.setStatusMessage(ResponseCodeConstants.SUCCESS_STRING);
			return ResponseEntity.status(HttpStatus.OK).body(dto);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseDto(
					ResponseCodeConstants.BAD_REQUEST, e.getMessage()));
		}
	}

}
