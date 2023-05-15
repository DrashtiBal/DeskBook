package com.onerivet.deskbook.models.payload;

import java.time.LocalDateTime;

import com.onerivet.deskbook.models.entity.Employee;
import com.onerivet.deskbook.models.entity.Seat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SeatConfigurationDto {
	private int id;

//	private CityDto city;
//
//	private FloorDto floor;
//
//	private ColumnDetailsDto column;
//
//	private SeatNumberDto seatNumber;
//	
//	private EmployeeDto employeeDto;
	
	private SeatDto seat;
	
	private EmployeeDto employee;
	
	private EmployeeDto createdBy;
	
	private EmployeeDto modifiedBy;
	
	private LocalDateTime modifiedDate;
	
	//private boolean available;
}
