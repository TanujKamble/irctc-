package com.bikkadit.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikkadit.demo.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {

}
