package com.harvetbasket.EcomBackend.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Seller {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sid;
	
	@Column(nullable=false)
	private String sname;
	
	@Column(nullable=false)
	private String scity;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}

}
