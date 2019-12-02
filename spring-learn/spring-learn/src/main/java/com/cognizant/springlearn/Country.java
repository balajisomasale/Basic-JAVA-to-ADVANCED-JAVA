package com.cognizant.springlearn;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Country {

	
	@Id
	@Column(name="co_code")
	  @NotNull
	   @Size(max = 2)
	private String code;

	@Column(name="co_name")
	  @NotNull
	   @Size(max = 50)	
	private String name;


public Country()
{

System.out.println("Inside Country Constructor");
}


public Country(String code, String name) {
	super();
	this.code = code;
	this.name = name;
}


public String getCode() {
	return code;
}


public void setCode(String code) {
	this.code = code;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


@Override
public String toString() {
	return "Country [code=" + code + ", name=" + name + ", toString()=" + super.toString() + "]";
}


public static void set(int index, Country country) {
	// TODO Auto-generated method stub
	
}








}



