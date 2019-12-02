package com.cognizant.springlearn.DEPdao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.bean.Department;

//@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService depserv;
	
	public DepartmentController(){}
	
@GetMapping("/departments")	
public Department[] getAllDepartments()
{
	System.out.println("Department Controller ");
	return depserv.getAllDepartments();
}




}