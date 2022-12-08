package com.bikkadit.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Ticket {
	
	@Id
	private int pid;
	private int pnr;
	private String ticketStatus;
	private double price;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getPnr() {
		return pnr;
	}
	public void setPnr(int pnr) {
		this.pnr = pnr;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Ticket [pid=" + pid + ", pnr=" + pnr + ", ticketStatus=" + ticketStatus + ", price=" + price + "]";
	}
	
}
