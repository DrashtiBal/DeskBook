package com.onerivet.deskbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onerivet.deskbook.model.entity.Employee;
import com.onerivet.deskbook.model.payload.EmployeeDto;
import com.onerivet.deskbook.model.payload.UpdateUserDto;
import com.onerivet.deskbook.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/get-all")
	public List<EmployeeDto> getAll()
	{
		return employeeService.getAllEmployee();
	}
	
	@GetMapping("/get-by-id/{id}")
	public EmployeeDto getEmployeeById(@PathVariable int id)
	{
		return employeeService.getEmployeeById(id);
	}
	
	@PutMapping("/update-by-id/{id}")
	public EmployeeDto getEmployeeById(@RequestBody UpdateUserDto employeeDto, @PathVariable int id)
	{
		return employeeService.updateEmployeebyId(employeeDto,id);
	}
}
