package com.onerivet.deskbook.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onerivet.deskbook.models.entity.City;
import com.onerivet.deskbook.models.entity.Seat;
//import com.onerivet.deskbook.models.entity.SeatNumber;

public interface SeatRepo extends JpaRepository<Seat, Integer> {

	public Optional<Seat> findBySeatNumber(String seatNumber);
}
