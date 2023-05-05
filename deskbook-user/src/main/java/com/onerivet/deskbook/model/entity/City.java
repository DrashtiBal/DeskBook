package com.onerivet.deskbook.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="city",schema="Ref")
public class City {
 
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CityId")
	private int id;
	
	@Column(name = "CityName")
	private String cityName;
	
}
