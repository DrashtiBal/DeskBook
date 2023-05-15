package com.onerivet.deskbook.models.payload;

import com.onerivet.deskbook.models.entity.ColumnDetails;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SeatDto {
	private int id;

	private String seatNumber;
	
	//private boolean booked;
	
	private ColumnDetailsDto column;
}
