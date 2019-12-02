package com.cognizant.customers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class CustomerDAO {
	
	private static List<Customer> customerList = new ArrayList<Customer>();

	public CustomerDAO() {
		customerList.add(new Customer(1, "Balaji", "Hyd"));
		customerList.add(new Customer(2, "Harsha", "Kochi"));
	}

	public List<Customer> list() {

		return customerList;
	}

	public Customer get(Long id) {
		for(Customer c: customerList)
		{
			if(c.id==id)
			{return c;}
		}
		
		return null;
	}

	public Customer create(Customer customer) {
	customer.setId(System.currentTimeMillis());
	customerList.add(customer);
	return customer;
	}

	public Long delete(Long id) {
		
		for(Customer c:customerList)
		{
			if(c.id==id)
			{
				customerList.remove(c);
				
				return id;
			
			}
			
		}
		
		return null;
	}
//change here
	public Customer update(long id, Customer customer) {
		for(Customer c:customerList)
		{
			if(c.id==id)
			{
				customer.setId(c.id);

				customerList.remove(c);
				customerList.add(customer);
				

				
				return customer;
			
			}
			
		}
		
		return null;
		
		
		
	}

}
