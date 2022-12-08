package com.bikkadit.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadit.demo.model.Passenger;
import com.bikkadit.demo.model.Ticket;
import com.bikkadit.demo.service.TicketServiceI;

@RestController
public class TicketController {
	
	@Autowired
	private TicketServiceI ticketService;
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger psg) {
		Ticket bookTicket = ticketService.bookTicket(psg);
		return new ResponseEntity<bookTicket,HttpStatus.Created>;
		
	}

}
