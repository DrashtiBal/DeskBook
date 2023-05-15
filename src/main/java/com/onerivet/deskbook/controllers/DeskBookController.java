package com.onerivet.deskbook.controllers;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onerivet.deskbook.models.payload.EmployeeDto;
import com.onerivet.deskbook.models.payload.ModeOfWorkDto;
import com.onerivet.deskbook.models.payload.UpdateEmployeeDto;
import com.onerivet.deskbook.models.response.GenericResponse;
import com.onerivet.deskbook.services.EmployeeService;
import com.onerivet.deskbook.services.ModeOfWorkService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/deskbook")
public class DeskBookController {
	
	@Autowired		
	private EmployeeService employeeService;
	
	@Autowired
	private ModeOfWorkService modeOfWorkService;
	
	/**
	 * @purpose: Get all employees
	 * @return: List of employeeDto
	 */
	@GetMapping("/employees")
	public ResponseEntity<GenericResponse<List<EmployeeDto>>> getAll() {
		List<EmployeeDto> allEmployees = employeeService.getAllEmployees();
		GenericResponse<List<EmployeeDto>> response = new GenericResponse<>(this.employeeService.getAllEmployees(), null);
		return new ResponseEntity<>(response,HttpStatus.OK); 
	}
	
	/**
	 * @purpose: Get employee by id
	 * @param: id
	 * @return: employeeDto
	 */
	@GetMapping("/{id}")
	public ResponseEntity<GenericResponse<EmployeeDto>> getById(@PathVariable("id") String id) {
		GenericResponse<EmployeeDto> response = new GenericResponse<>(this.employeeService.getEmployeeById(id),null);
		return new ResponseEntity<>(response,HttpStatus.OK);
		//return new employeeService.getEmployeeById(id);
	}

	@GetMapping("mode-of-work/")
	public List<ModeOfWorkDto> getAllModeOfWork()
	{
		return this.modeOfWorkService.getAllModeOfWork();
		
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<EmployeeDto> updateEmployeeById(@Valid  @RequestBody UpdateEmployeeDto employeeDto,String id)
	{
		return new ResponseEntity<>(employeeService.updateEmployeeById(employeeDto,id),HttpStatus.OK);
	}
}
