package com.cognizant.springlearn.DEPdao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.springlearn.bean.Department;

@Repository
public class DepartmentDao {

	
public static Department[] getDeplist() {
		return deplist;
	}

	public static void setDeplist(Department[] deplist) {
		DepartmentDao.deplist = deplist;
	}

private static Department[] deplist;

public DepartmentDao(){
		
	
	}
	
	public Department[] getAllDepartments()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("dep.xml");
		
		//	Deplist dep=(Deplist)context.getBean("list");
			
		//	deplist=dep.getDeplist();
			
		
		return deplist;
	}
	
}
