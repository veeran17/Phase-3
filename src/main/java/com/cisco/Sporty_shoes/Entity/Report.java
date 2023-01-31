package com.cisco.Sporty_shoes.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Report {

	@Id
	@Column
	private String Pid;
	@Column
	private int PP;
	@Temporal(TemporalType.DATE)
	@Column
	private Date Date;

	public Report(String pid, int pP, java.util.Date date) {
		super();
		Pid = pid;
		PP = pP;
		Date = date;
	}

	public Report() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getPid() {
		return Pid;
	}

	public void setPid(String pid) {
		Pid = pid;
	}

	public int getPP() {
		return PP;
	}

	public void setPP(int pP) {
		PP = pP;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	@Override
	public String toString() {
		return "Report [Pid=" + Pid + ", PP=" + PP + ", Date=" + Date + "]";
	}

}
