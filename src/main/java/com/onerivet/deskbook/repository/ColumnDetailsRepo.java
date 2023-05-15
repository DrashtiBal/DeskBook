package com.onerivet.deskbook.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onerivet.deskbook.models.entity.City;
import com.onerivet.deskbook.models.entity.ColumnDetails;

public interface ColumnDetailsRepo extends JpaRepository<ColumnDetails, Integer> {

	//public Optional<ColumnDetails> findByColumnName(String columnName); 
	
	public List<ColumnDetails>
}
