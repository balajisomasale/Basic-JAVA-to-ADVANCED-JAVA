package com.cognizant.springlearn.DEPdao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.bean.Department;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentDao depdao;
	
	
	public DepartmentService()
	{
		
	}
	public Department[] getAllDepartments()
	{
		
		
		return depdao.getAllDepartments();
	}
	
	
	
}
