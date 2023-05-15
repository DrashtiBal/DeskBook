package com.onerivet.deskbook.models.payload;

import com.onerivet.deskbook.models.entity.City;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FloorDto {
	private int id;

	private String floorName;
	
	private CityDto city;
}
