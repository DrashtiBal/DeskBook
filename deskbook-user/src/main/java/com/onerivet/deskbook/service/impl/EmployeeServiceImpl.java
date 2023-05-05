package com.onerivet.deskbook.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onerivet.deskbook.exception.DataNotFoundException;
import com.onerivet.deskbook.model.entity.Employee;
import com.onerivet.deskbook.model.payload.EmployeeDto;
import com.onerivet.deskbook.model.payload.UpdateUserDto;
import com.onerivet.deskbook.repository.EmployeeRepository;
import com.onerivet.deskbook.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public List<EmployeeDto> getAllEmployee() {
		return employeeRepository.findAll().stream().map(this::employeeToEmployeeDto).collect(Collectors.toList());
	}
		@Override
		public EmployeeDto getEmployeeById(int id) {
		Employee employee = employeeRepository.findById(id).get();
		return this.employeeToEmployeeDto(employee);
	}	
		@Override
		public EmployeeDto updateEmployeebyId(UpdateUserDto employeeDto, int id) {
			
				EmployeeDto employeeById = getEmployeeById(id);
				if(employeeById!=null) {
					Employee employee = employeeRepository.save(updateModelMapper(employeeDto));
					return employeeToEmployeeDto(employee);
				}else{
					throw new DataNotFoundException("Data Not Found");
				}
		}
		
		public Employee employeeDtoToEmployee(EmployeeDto employeeDto)
		{
			Employee employee = this.modelMapper.map(employeeDto, Employee.class);
			return employee;
		}
		
		public EmployeeDto employeeToEmployeeDto(Employee employee)
		{
			EmployeeDto employeedto = this.modelMapper.map(employee,EmployeeDto.class);
			return employeedto;
		}
		
		public Employee updateModelMapper(UpdateUserDto updateUserDto) {
			return modelMapper.map(updateUserDto, Employee.class);
		}
}
