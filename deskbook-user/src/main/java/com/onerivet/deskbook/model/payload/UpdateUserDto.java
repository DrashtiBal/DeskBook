package com.onerivet.deskbook.model.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserDto {

	private String emailId;
	private String phoneNumber;
	private DesignationDto designation;
	private String project;
}
