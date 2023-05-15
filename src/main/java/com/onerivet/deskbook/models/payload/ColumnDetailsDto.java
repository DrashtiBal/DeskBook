package com.onerivet.deskbook.models.payload;

import com.onerivet.deskbook.models.entity.Floor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ColumnDetailsDto {
	private int id;

	private char columnName;
	
	private FloorDto floor;
}
