package com.onerivet.deskbook.model.payload;

//import com.onerivet.deskbook.model.entity.City;
//import com.onerivet.deskbook.model.entity.Columns;
//import com.onerivet.deskbook.model.entity.Employee;
//import com.onerivet.deskbook.model.entity.Floor;
//import com.onerivet.deskbook.model.entity.SeatNumber;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SeatNumberDto {
	private int id;
	private String seatNumber;
}
