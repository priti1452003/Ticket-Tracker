package com.gl.ticketTracker.System.Service;

import java.util.List;

import com.gl.ticketTracker.System.Entity.*;

public interface TicketService {
	
	List<Ticket> getAllTickets();

	Ticket saveTicket(Ticket ticket);

	Ticket getTicketById(Long id);

	Ticket updateTicket(Ticket ticket);

	void deleteTicketById(Long id);
}


