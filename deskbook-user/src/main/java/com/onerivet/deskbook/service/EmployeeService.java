package com.onerivet.deskbook.service;

import java.util.List;

import com.onerivet.deskbook.model.entity.Employee;
import com.onerivet.deskbook.model.payload.EmployeeDto;
import com.onerivet.deskbook.model.payload.UpdateUserDto;

public interface EmployeeService {

	public List<EmployeeDto> getAllEmployee();
	public EmployeeDto getEmployeeById(int id);
	public EmployeeDto updateEmployeebyId(UpdateUserDto employeeDto,int id);
}
