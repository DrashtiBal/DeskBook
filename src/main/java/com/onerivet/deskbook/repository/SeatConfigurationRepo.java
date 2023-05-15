package com.onerivet.deskbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onerivet.deskbook.models.entity.Employee;
import com.onerivet.deskbook.models.entity.SeatConfiguration;

@Repository
public interface SeatConfigurationRepo extends JpaRepository<SeatConfiguration, Integer>{

	public SeatConfiguration findByEmployee(Employee employee);
}
