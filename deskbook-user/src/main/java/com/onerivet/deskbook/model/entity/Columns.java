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
@Table(name="[Column]",schema="Ref")
@ToString
public class Columns {

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ColumnId")
	private int id;
	
	@Column(name="ColumnName")
	private String columnName;
}
