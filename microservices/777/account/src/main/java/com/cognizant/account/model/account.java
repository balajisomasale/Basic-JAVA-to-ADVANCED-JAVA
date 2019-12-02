package com.cognizant.account.model;


public class account {

	
	
	

	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public account(String number, String type, long balance) {
		super();
		this.number = number;
		this.type = type;
		this.balance = balance;
	}


	private String number;
	
	private String type;
	private long balance;
	
}
