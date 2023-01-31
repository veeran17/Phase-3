package com.cisco.Sporty_shoes.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Admin {
	
	
	@Id 
	@Column
	private String Aid;
	@Column
	private String Pswd;
	
	
	@Override
	public String toString() {
		return "Admin [Aid=" + Aid + ", Pswd=" + Pswd + "]";
	}
	public String getAid() {
		return Aid;
	}
	public void setAid(String aid) {
		Aid = aid;
	}
	public String getPswd() {
		return Pswd;
	}
	public void setPswd(String pswd) {
		Pswd = pswd;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(String aid, String pswd) {
		super();
		Aid = aid;
		Pswd = pswd;
	}
	

}
