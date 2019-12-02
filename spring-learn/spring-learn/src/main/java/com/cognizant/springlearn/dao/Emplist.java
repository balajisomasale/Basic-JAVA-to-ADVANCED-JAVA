package com.cognizant.springlearn.dao;

import java.util.List;

import com.cognizant.springlearn.bean.Employee;

public class Emplist {

	List<Employee> emplist;

	public List<Employee> getEmplist() {
		return emplist;
	}

	public void setEmplist(List<Employee> emplist) {
		this.emplist = emplist;
	}

	public Emplist(List<Employee> emplist) {
		super();
		this.emplist = emplist;
	}
	
	
	public Emplist()
	{}


	
	
}
