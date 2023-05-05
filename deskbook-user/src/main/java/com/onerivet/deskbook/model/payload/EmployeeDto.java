package com.onerivet.deskbook.model.payload;

//import java.util.Set;

import com.onerivet.deskbook.model.entity.Designation;
import com.onerivet.deskbook.model.entity.ModeOfWork;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeeDto {
	private int id;
	private String userId;
	private String emailId;
	private String fname;
	private String lname;
	private String phoneNo;
	private String project;
	private ModeOfWork modeOfWorkId;
	private String profilePictureFileName;
	private String profilePictureFilePath;
	private Designation designationId;
	//private Set<Role> role;
	//private Set<WorkingDay> workingDay;
	//private SeatConfiguration configurationId;
}
