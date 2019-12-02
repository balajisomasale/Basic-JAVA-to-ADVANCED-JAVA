package com.cognizant.springlearn.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.bean.Employee;



//@RestController
//@CrossOrigin("http://localhost:4200")
public class Empcontroller {

	@Autowired
	private Empservice empservice;

	
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees()
	{
		
		
		return empservice.getAllEmployees();
	}
	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable int id)
	{
		return empservice.getEmployee(id);
	}
	
	@PutMapping("/employees/{id}")
public void updateEmployee(@PathVariable int id,@RequestBody Employee employee)	
{
		empservice.updateEmployee(id,employee);
}
	
	@DeleteMapping("/employees/{id}")
public void deleteEmployee(@PathVariable int id)
	
	{
		
	 empservice.deleteEmployee(id);
	}
	
	
}
