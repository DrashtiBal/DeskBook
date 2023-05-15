package com.onerivet.deskbook.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.onerivet.deskbook.models.entity.Employee;
import com.onerivet.deskbook.models.payload.EmployeeDto;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	public Employee findById(String id);
}
