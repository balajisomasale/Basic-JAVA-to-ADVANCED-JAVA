package com.cognizant.customers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

	@Autowired
	private CustomerDAO customerdao;
	
	
	public List<Customer> getCustomer()
	{
		
		return customerdao.list();
	}


	public Customer get(Long id) {
		
		Customer cust = customerdao.get(id);
		return cust;
	}
	public Customer create(Customer customer)
	{
		customerdao.create(customer);
		return customer;
		
	}
	
	public Long delete(Long id)
	{
		Long id1=customerdao.delete(id);
		return id1;	
	}


	public Customer update(long id, Customer customer) {
		Customer cust=customerdao.update(id,customer);
		return cust;
	}
	


	
	
	
}
