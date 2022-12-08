package com.bikkadit.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikkadit.demo.model.Passenger;


public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}
