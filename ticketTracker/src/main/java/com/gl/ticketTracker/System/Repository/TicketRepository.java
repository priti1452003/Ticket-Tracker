package com.gl.ticketTracker.System.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.ticketTracker.System.Entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long>{

}

