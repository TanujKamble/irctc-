package com.bikkadit.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Passenger {
	@Id
	private int pid;
	private String fname;
	private String lname;
	private String to;
	private String doj;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Passenger [pid=" + pid + ", fname=" + fname + ", lname=" + lname + ", to=" + to + ", doj=" + doj + "]";
	}

}
