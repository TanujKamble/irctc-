package com.bikkadit.demo.service;

import com.bikkadit.demo.model.Passenger;
import com.bikkadit.demo.model.Ticket;

public interface TicketServiceI {
	public abstract Ticket bookTicket(Passenger psg);

}
