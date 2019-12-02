package com.cognizant.springlearn.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.bean.Employee;
import com.cognizant.springlearn.bean.SpringLearnApplication;
@Service
public class Empservice {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	
	@Autowired
	private Empdao empdao;


	public List<Employee> getAllEmployees() {
		
//		return empdao.getAllEmployees();
		
		
		return empdao;
	}
	
	
	
	public Employee getEmployee(int id)
	{
		return empdao.getEmployee(id);
	}



	public void updateEmployee(int id, Employee employee) {
		// TODO Auto-generated method stub
		
		empdao.updateEmployee(id,employee);
		
	}

	
	public void deleteEmployee(int id)
	
	{
	
	empdao.deleteEmployee(id);
	
	}
	
	}
