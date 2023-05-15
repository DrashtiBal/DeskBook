package com.onerivet.deskbook.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

//import com.onerivet.deskbook.exception.DataNotFoundException;
import com.onerivet.deskbook.exception.ResorceNotFoundException;
import com.onerivet.deskbook.models.entity.City;
import com.onerivet.deskbook.models.entity.ColumnDetails;
import com.onerivet.deskbook.models.entity.Designation;
import com.onerivet.deskbook.models.entity.Employee;
import com.onerivet.deskbook.models.entity.Floor;
import com.onerivet.deskbook.models.entity.ModeOfWork;
import com.onerivet.deskbook.models.entity.Seat;
import com.onerivet.deskbook.models.entity.SeatConfiguration;
import com.onerivet.deskbook.models.payload.EmployeeDto;
import com.onerivet.deskbook.models.payload.SeatConfigurationDto;
import com.onerivet.deskbook.models.payload.UpdateEmployeeDto;
import com.onerivet.deskbook.repository.CityRepo;
import com.onerivet.deskbook.repository.ColumnDetailsRepo;
import com.onerivet.deskbook.repository.DesignationRepo;
import com.onerivet.deskbook.repository.EmployeeRepo;
import com.onerivet.deskbook.repository.FloorRepo;
import com.onerivet.deskbook.repository.ModeOfWorkRepo;
import com.onerivet.deskbook.repository.SeatConfigurationRepo;
import com.onerivet.deskbook.repository.SeatRepo;
import com.onerivet.deskbook.services.EmployeeService;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Autowired
	private ModelMapper modelMapper;
	
	//@Autowired 
	//private SeatConfigurationRepo seatConfigurationRepo;
	
	//@Autowired
	//private ColumnDetailsRepo columnDetailsRepo;
	
	//@Autowired
	//private FloorRepo floorRepo;
	
	//@Autowired
	//private CityRepo cityRepo;
	
	//@Autowired
	//private SeatRepo seatRepo;
	
	@Autowired
	private ModeOfWorkRepo modeOfWorkRepo;
	
	@Autowired
	private DesignationRepo designationRepo; 

	@Override
	public List<EmployeeDto> getAllEmployees() {
		return this.employeeRepo.findAll().stream().map((employee) -> this.modelMapper.map(employee, EmployeeDto.class))
				.collect(Collectors.toList());
	}
	@Override
	public EmployeeDto getEmployeeById(String id) throws ResorceNotFoundException{
		Employee employee = this.employeeRepo.findById(id);
				/*.orElseThrow(() -> new ResorceNotFoundException("Employee with id " + id + " not found."));*/
		return this.modelMapper.map(employee, EmployeeDto.class);
	}

	@Override
	public EmployeeDto updateEmployeeById(UpdateEmployeeDto updateEmployeeDto, String id) throws ResorceNotFoundException {
		
		Employee employee = employeeRepo.findById(id);/*.orElseThrow(()-> new ResorceNotFoundException("User Not Found") );*/
		
//			 SeatConfiguration findEmployee = seatConfigurationRepo.findByEmployee(employee);
			 Designation designation = designationRepo.findById(updateEmployeeDto.getDesignation()).get();
			 ModeOfWork modeOfWork = modeOfWorkRepo.findById(updateEmployeeDto.getModeOfWork()).get();			
		Employee employee1 = this.modelMapper.map(updateEmployeeDto, Employee.class);
		employee.setFirstName(updateEmployeeDto.getFirstName());
		employee.setLastName(updateEmployeeDto.getLastName());
		employee.setPhoneNumber(updateEmployeeDto.getPhoneNumber());
		employee.setProfilePictureFileName(updateEmployeeDto.getProfilePictureFileName());
		employee.setProfilePictureFilePath(updateEmployeeDto.getProfilePictureFilePath());
		employee.setProject(updateEmployeeDto.getProject());
		employee.setDesignation(designation);
		employee.setModeOfWork(modeOfWork);
		
		if(modeOfWork=2)
		{
			
		}
		//SeatConfiguration seatConfiguration=null;/*=new SeatConfiguration();*/
		
		
//		if(seatConfiguration==null)
//		{
//			City city = cityRepo.findById(updateEmployeeDto.getCity()).get();
//			Floor floor = floorRepo.findById(updateEmployeeDto.getFloor()).get();
//			ColumnDetails columnDetails = columnDetailsRepo.findById(updateEmployeeDto.getCloumn()).get();
//			Seat seat2 = seatRepo.findById(updateEmployeeDto.getSeatNo()).get();
			
//			seatConfiguration.setCity(city);
//			seatConfiguration.setFloor(floor);
//			seatConfiguration.setColumn(columnDetails);
//			seatConfiguration.setSeatNumber(seat2);
//			seatConfiguration.setEmployee(employee);
		
		Employee saveEmployee = employeeRepo.save(employee);
		//SeatConfiguration saveSeatConfiguration = seatConfigurationRepo.save(seatConfiguration);
		
		EmployeeDto employeeDto = this.modelMapper.map(saveEmployee, EmployeeDto.class);
		//SeatConfigurationDto seatConfigurationDto = this.modelMapper.map(saveSeatConfiguration, SeatConfigurationDto.class);
		//employeeDto.setSeatConfiguration(seatConfigurationDto);
		//return this.modelMapper.map(saveEmployee, UpdateEmployeeDto.class);
		return employeeDto;
	}
}
