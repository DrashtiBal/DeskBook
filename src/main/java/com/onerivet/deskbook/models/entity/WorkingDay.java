package com.onerivet.deskbook.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "[WorkingDay]", schema = "[Ref]")
public class WorkingDay {
	@Id
	@Column(name = "WorkingDayId")
	private int id;
	
	@Column(name = "Day")
	private String day;

	public WorkingDay(String day) {
		super();
		this.day = day;
	}
	
}