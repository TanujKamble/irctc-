package com.bikkadit.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.bikkadit.demo.model.Passenger;
import com.bikkadit.demo.model.Ticket;
import com.bikkadit.demo.repository.TicketRepository;

public class TIcketServiceImpl implements TicketServiceI{
	
@Autowired
public TicketRepository ticketRepository;
	@Override
	public Ticket bookTicket(Passenger psg) {
		if(psg != null) {
			
			Ticket ticket = ticketRepository.findById(1).get();
			
			return ticket;
		}
		return null;
	}

}
