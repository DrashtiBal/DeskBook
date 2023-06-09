package com.onerivet.deskbook.model.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="SeatConfiguration",schema="dbo")
@ToString
public class SeatConfiguration {

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="SeatConfigurationId")
	private int id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="CityId")
	private City city;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="FloorId")
	private Floor floor;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ColumnId")
	private Columns column;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="SeatNumberId")
	private SeatNumber seatNumber;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="EmployeeId")
	private Employee employee;
	
	
//	public SeatConfiguration(City city, Floor floor, Columns column, SeatNumber seatNumber) {
//		super();
//		this.city = city;
//		this.floor = floor;
//		this.column = column;
//		this.seatNumber = seatNumber;
//	}
}
