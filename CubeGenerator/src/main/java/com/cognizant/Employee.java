package com.cognizant;



public class Employee {  
	


private Address address;//Aggregation  

public Employee() 

{ }  





  
public Address getAddress() {
	return address;
}






public void setAddress(Address address) {
	this.address = address;
}






void show(){  
    System.out.println(address.toString());  
}
}  