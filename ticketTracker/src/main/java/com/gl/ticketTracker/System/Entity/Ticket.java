package com.gl.ticketTracker.System.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tickets")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "Ticket_Title", nullable = false)
	private String ticketTitle;

	@Column(name = "Ticket_Short_Description")
	private String ticketShortDescription;

	@Column(name = "Ticket_Created_On")
	private String ticketCreatedOn;

	public Ticket() {

	}

	public Ticket(String ticketTitle, String ticketShortDescription, String ticketCreatedOn) {
		this.ticketTitle = ticketTitle;
		this.ticketShortDescription = ticketShortDescription;
		this.ticketCreatedOn = ticketCreatedOn;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getticketTitle() {
	return ticketTitle;
	}

	public void setticketTitle(String ticketTitle) {
		this.ticketTitle = ticketTitle;
	}

	public String getticketShortDescription() {
		return ticketShortDescription;
	}

	public void setticketShortDescription(String ticketShortdescription) {
		this.ticketShortDescription = ticketShortDescription;
	}

	public String getticketCreatedOn() {
		return ticketCreatedOn;
	}

	public void setticketCreatedOn(String ticketCreatedOn) {
		this.ticketCreatedOn = ticketCreatedOn;
	}
}
