package com.cisco.Sporty_shoes.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	@Column
	private String Pid;
	@Override
	public String toString() {
		return "Product [Pid=" + Pid + ", Pname=" + Pname + ", PP=" + PP + "]";
	}
	public String getPid() {
		return Pid;
	}
	public void setPid(String pid) {
		Pid = pid;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public int getPP() {
		return PP;
	}
	public void setPP(int pP) {
		PP = pP;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String pid, String pname, int pP) {
		super();
		Pid = pid;
		Pname = pname;
		PP = pP;
	}
	@Column
	private String Pname;
	@Column 
	private int PP;

}
