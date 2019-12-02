package com.cts.SPRINGwithSQL;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private int uid;
	
	private String uname;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	/**
	 * 
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param uid
	 * @param uname
	 */
	public User(int uid, String uname) {
		super();
		this.uid = uid;
		this.uname = uname;
	}
	
	
	
	
}
