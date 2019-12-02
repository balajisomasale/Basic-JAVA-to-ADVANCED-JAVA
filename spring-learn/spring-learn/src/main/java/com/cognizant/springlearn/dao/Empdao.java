package com.cognizant.springlearn.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.springlearn.bean.Employee;

import org.springframework.data.repository.CrudRepository;

@Repository
public class Empdao 
{
	private static List<Employee> emplist = new ArrayList<Employee>();

	public Empdao() {

		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		Emplist emp = (Emplist) context.getBean("list");
		emplist = emp.getEmplist();

	}

	public List<Employee> getAllEmployees() {

		return emplist;

	}

	public Employee getEmployee(int id) {
		for (Employee emp : emplist) {
			if (emp.getId() == id) {
				return emp;
			}
		}

		return null;
	}

public void updateEmployee(int id, Employee employee) {
	// TODO Auto-generated method stub
	
	for(Employee i:emplist)
	{
		if(i.getId()==id)
		{
			
			int index=emplist.indexOf(i);
			emplist.set(index, employee);
		}
		
		
	}
}
	
	public void deleteEmployee(int id)
	
	{
		
		for(Employee c:emplist)
	{
		if(c.id==id)
		{
			emplist.remove(c);	
		}		
	}}



}
