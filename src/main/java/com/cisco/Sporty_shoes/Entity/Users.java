package com.cisco.Sporty_shoes.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Users {
	
	@Id 
	@Column
	private String Uid;
	@Override
	public String toString() {
		return "Users [Uid=" + Uid + ", Uage=" + Uage + ", Unum=" + Unum + ", Ugender=" + Ugender + ", Pswd=" + Pswd
				+ "]";
	}
	public String getUid() {
		return Uid;
	}
	public void setUid(String uid) {
		Uid = uid;
	}
	public int getUage() {
		return Uage;
	}
	public void setUage(int uage) {
		Uage = uage;
	}
	public int getUnum() {
		return Unum;
	}
	public void setUnum(int unum) {
		Unum = unum;
	}
	public Long getUgender() {
		return Ugender;
	}
	public void setUgender(Long ugender) {
		Ugender = ugender;
	}
	public String getPswd() {
		return Pswd;
	}
	public void setPswd(String pswd) {
		Pswd = pswd;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(String uid, int uage, int unum, Long ugender, String pswd) {
		super();
		Uid = uid;
		Uage = uage;
		Unum = unum;
		Ugender = ugender;
		Pswd = pswd;
	}
	@Column
	private int Uage;
	@Column
	private int Unum;
	@Column
	private Long Ugender;
	@Column
	private String  Pswd;
	

}
