package com.onerivet.deskbook.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name="ModeOfWork",schema="Ref")
@ToString
public class ModeOfWork {

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="ModeOfWorkId")
	private int id;
	
	@Column(name="ModeOfWorkName")
	private String modeOfWorkName;
	
	
	
}
